package com.nortal.lazar.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nortal.lazar.user.entity.UserEntity;
import com.nortal.lazar.user.model.UserModel;
import com.nortal.lazar.user.service.UserService;

@Controller
public class ChangePasswordController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/Protected/changePassword", method = RequestMethod.POST)
	public String submitPage(Model model, HttpServletRequest request, HttpServletResponse response) {
		String action = request.getParameter("action").toString();
		if (action.equals("Close")) {
			return "Protected/Profile";
		} else {
			String oldPassword = request.getParameter("oldPassword");
			String newPassword = request.getParameter("newPassword");
			String confirmNewPassword = request.getParameter("confirmNewPassword");
			HttpSession session = request.getSession();
			UserModel user = (UserModel) session.getAttribute("user");
			if (oldPassword.equals(user.getPassword()) && newPassword.equals(confirmNewPassword)) {
				// store new pass in DB
				userService.updatePassword(user.getID(), newPassword);
				user.setPassword(newPassword);
				session.setAttribute("user", user);
				return "Protected/Profile";
			} else {
				System.out.println("Greska");
				return "Protected/ChangePassword";
			}

		}
	}

	@RequestMapping(value = "/Protected/changePassword", method = RequestMethod.GET)
	public String openPage(HttpServletRequest request, HttpServletResponse response, Model model) {
		return "/Protected/ChangePassword";
	}
}
