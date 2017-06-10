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
public class ViewAccountController {

	@RequestMapping(value = "/protected/user/viewAccount", method = RequestMethod.POST)
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

//	@RequestMapping(value = "/protected/user/viewAccount", method = RequestMethod.GET)
//	public String openPage(HttpServletRequest request, HttpServletResponse response, Model model) {
//		
//		return "/Protected/Account";
//	}

}
