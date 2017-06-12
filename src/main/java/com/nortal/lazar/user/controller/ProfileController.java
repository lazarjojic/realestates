package com.nortal.lazar.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nortal.lazar.user.model.UserModel;
import com.nortal.lazar.user.service.UserImageService;

@Controller
public class ProfileController {

	@Autowired
	UserImageService userImageService;

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
	public String openPage(HttpSession session, Model model) {
		UserModel currentUser = (UserModel) session.getAttribute("currentUser");
		String profileImagePath = userImageService.getImagePath(currentUser.getID());
		model.addAttribute("profileImagePath", profileImagePath);
		return "/protected/user/Profile";
	}

}
