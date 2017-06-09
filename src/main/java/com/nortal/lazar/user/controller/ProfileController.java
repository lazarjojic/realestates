package com.nortal.lazar.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nortal.lazar.user.model.UserModel;

@Controller
public class ProfileController {

	@RequestMapping(value = "/protected/user/profile", method = RequestMethod.POST)
	public String submitPage(Model model, HttpServletRequest request, HttpServletResponse response) {
		String action = request.getParameter("action").toString();
		if (action.equals("Close")) {
			return "protected/Home";
		} else {
			return "protected/user/ChangePassword";
		}
	}

	@RequestMapping(value = "/protected/user/profile", method = RequestMethod.GET)
	public String openPage(HttpServletRequest request, HttpServletResponse response, Model model) {
		HttpSession session = request.getSession();
		UserModel user = (UserModel) session.getAttribute("user");
		model.addAttribute("account", user);
		return "/protected/user/Profile";
	}

}
