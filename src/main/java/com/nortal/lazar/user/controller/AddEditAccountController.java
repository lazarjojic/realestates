package com.nortal.lazar.user.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.nortal.lazar.agency.service.AgencyService;
import com.nortal.lazar.user.entity.UserEntity;
import com.nortal.lazar.user.model.UserModel;
import com.nortal.lazar.user.service.UserService;

@SessionAttributes("addOrEditAccount")
@Controller
public class AddEditAccountController {

	@Autowired
	private AgencyService agencyService;

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET, value = "/protected/user/addEditAccount")
	public ModelAndView openKreiranjeNaloga(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView("/protected/user/AddEditAccount");
		modelAndView.addObject("userModel", new UserModel());
		String addOrEditAccount = (String) session.getAttribute("addOrEditAccount");
		if (addOrEditAccount == null) {
			modelAndView.addObject("addOrEditAccount", "add");
			modelAndView.addObject("pageTitle", "Add Account");
		}
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/protected/user/addEditAccount")
	public String doPost(@ModelAttribute(value = "userModel") UserModel userModel, Model model, @RequestParam("action") String action, 
			@RequestParam("file") Part filePart, HttpSession session, SessionStatus sessionStatus, HttpServletResponse response) throws IOException {
		String addOrEditAccount = (String) session.getAttribute("addOrEditAccount");
		switch (action) {
		case "Add":

			final String fileName = getFileName(filePart);
			final PrintWriter writer = response.getWriter();
			OutputStream out = null;
			InputStream filecontent = null;
			try {

			//	out = new FileOutputStream(new File(path + File.separator + fileName));
				out = new FileOutputStream(new File("files" + File.separator + fileName));
				filecontent = filePart.getInputStream();

				int read = 0;
				final byte[] bytes = new byte[1024];

				while ((read = filecontent.read(bytes)) != -1) {
					out.write(bytes, 0, read);
				}
				//writer.println("New file " + fileName + " created at " + path);

			} catch (FileNotFoundException fne) {
				writer.println("You either did not specify a file to upload or are " + "trying to upload a file to a protected or nonexistent " + "location.");
				writer.println("<br/> ERROR: " + fne.getMessage());

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (out != null) {
					out.close();
				}
				if (filecontent != null) {
					filecontent.close();
				}
				if (writer != null) {
					writer.close();
				}
			}
			return "kurac";
		case "Save":
			UserEntity userEntity = null;
			if (addOrEditAccount.equals("add")) {
				userEntity = new UserEntity(userModel);
				userService.save(userEntity);

				// returning redirect in order to have clear form
				return "redirect:/protected/user/AddEditAccount";
			} else {
				// edit existing account
				// return to view account but update account with new data
				UserModel selectedAccount = (UserModel) session.getAttribute("selectedAccount");
				selectedAccount.update(userModel);
				model.addAttribute("selectedAccount", selectedAccount);
				session.setAttribute("selectedAccount", selectedAccount);
				userEntity = new UserEntity(selectedAccount);
				userService.updateUser(userEntity);
				return "protected/user/ViewAccount";
			}
		case "Close":
			sessionStatus.setComplete();
			if (addOrEditAccount.equals("add")) {
				return "protected/Home";
			} else {
				return "protected/user/ViewAccount";
			}
		default:
			return "protected/Home";
		}
	}

	private String getFileName(final Part part) {
		final String partHeader = part.getHeader("content-disposition");
		for (String content : part.getHeader("content-disposition").split(";")) {
			if (content.trim().startsWith("filename")) {
				return content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
			}
		}
		return null;
	}
}
