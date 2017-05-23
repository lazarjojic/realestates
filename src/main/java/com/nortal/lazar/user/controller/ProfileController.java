package com.nortal.lazar.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nortal.lazar.model.UserModel;

public class ProfileController {

	@RequestMapping(value = "/Protected/profile", method = RequestMethod.POST)
	public String submitPage(Model model, HttpServletRequest request, HttpServletResponse response) {
		String action = request.getParameter("action").toString();
		if (action.equals("Close")) {
			return "Protected/Home";
		} else {
			HttpSession session = request.getSession();
			model.addAttribute("profile", session.getAttribute("user"));
			return "Protected/CreateAccount";
		}
	}

	@RequestMapping(value = "/Protected/profile", method = RequestMethod.GET)
	public String openPage(HttpServletRequest request, HttpServletResponse response, Model model) {
		HttpSession session = request.getSession();
		UserModel user = (UserModel) session.getAttribute("user");
		model.addAttribute("account", user);
		return "/Protected/Profile";
	}

}
