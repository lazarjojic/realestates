package com.nortal.lazar.realestate.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@SessionAttributes(value = { "photos", "documents", "positions", "sketches" })
@Controller
public class PhotosController {

	// @RequestMapping(value = "/Protected/addPhotos", method =
	// RequestMethod.POST)
	// public String staOvde(HttpServletRequest request, HttpServletResponse
	// response) {
	// String action = request.getParameter("action");
	// if (action.equals("close")) {
	// return "index";
	// } else {
	// String name = request.getParameter("name");
	// String pib = request.getParameter("pib");
	// String director = request.getParameter("director");
	// String address = request.getParameter("address");
	// String phone = request.getParameter("phone");
	// Agency agency = new Agency(name, pib, director, address, phone);
	// agencyService.save(agency);
	// return "/Protected/AddAgency";
	// }
	// }

	@RequestMapping(value = "/protected/realEstate/photos", method = RequestMethod.GET)
	public String openPage(HttpSession session, Model model) {

		if (session.getAttribute("photos") != null) {
			List<String> photosTemp = new ArrayList<String>((List<String>) session.getAttribute("photos"));
			List<String> documentsTemp = new ArrayList<String>((List<String>) session.getAttribute("documents"));
			List<String> positionsTemp = new ArrayList<String>((List<String>) session.getAttribute("positions"));
			List<String> sketchesTemp = new ArrayList<String>((List<String>) session.getAttribute("sketches"));
			model.addAttribute("photosTemp", photosTemp);
			model.addAttribute("documentsTemp", documentsTemp);
			model.addAttribute("positionsTemp", positionsTemp);
			model.addAttribute("sketchesTemp", sketchesTemp);
		} else {
			List<String> photosTemp = new ArrayList<String>();
			List<String> documentsTemp = new ArrayList<String>();
			List<String> positionsTemp = new ArrayList<String>();
			List<String> sketchesTemp = new ArrayList<String>();
			List<String> photos = new ArrayList<String>();
			List<String> documents = new ArrayList<String>();
			List<String> positions = new ArrayList<String>();
			List<String> sketches = new ArrayList<String>();
			model.addAttribute("photosTemp", photosTemp);
			model.addAttribute("documentsTemp", documentsTemp);
			model.addAttribute("positionsTemp", positionsTemp);
			model.addAttribute("sketchesTemp", sketchesTemp);
			model.addAttribute("photos", photos);
			model.addAttribute("documents", documents);
			model.addAttribute("positions", positions);
			model.addAttribute("sketches", sketches);
		}

		return "/protected/realEstate/Photos";
	}

	@RequestMapping(value = "/protected/realEstate/photos", method = RequestMethod.POST)
	public String submitPage(HttpServletRequest request, HttpServletResponse response, SessionStatus sessionStatus, HttpSession session, Model model) throws IOException, ServletException {
		String action = request.getParameter("action");
		switch (action) {

		case "Add":
			final String path = request.getParameter("location");
			final Part filePart = request.getPart("file");
			final String fileName = getFileName(filePart);
			final PrintWriter writer = response.getWriter();
			OutputStream out = null;
			InputStream filecontent = null;
			try {

				out = new FileOutputStream(new File(path + File.separator + fileName));
				filecontent = filePart.getInputStream();

				int read = 0;
				final byte[] bytes = new byte[1024];

				while ((read = filecontent.read(bytes)) != -1) {
					out.write(bytes, 0, read);
				}
				writer.println("New file " + fileName + " created at " + path);

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
			
		case "Close":
			session.removeAttribute("photosTemp");
			session.removeAttribute("documentsTemp");
			session.removeAttribute("positionsTemp");
			session.removeAttribute("sketchesTemp");
			return "/protected/realEstate/AddEditRealEstate";
		case "Save":
			List<String> photos = (List<String>) session.getAttribute("photos");
			List<String> documents = (List<String>) session.getAttribute("documents");
			List<String> positions = (List<String>) session.getAttribute("positions");
			List<String> sketchesTemp = (List<String>) session.getAttribute("sketches");

			photos = (List<String>) session.getAttribute("photosTemp");
			documents = (List<String>) session.getAttribute("documentsTemp");
			positions = (List<String>) session.getAttribute("positionsTemp");
			sketchesTemp = (List<String>) session.getAttribute("sketchesTemp");

			session.removeAttribute("photosTemp");
			session.removeAttribute("documentsTemp");
			session.removeAttribute("positionsTemp");
			session.removeAttribute("sketchesTemp");
			return "/protected/realEstate/AddEditRealEstate";
		default:
			return null;
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
