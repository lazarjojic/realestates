package com.nortal.lazar.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nortal.lazar.agency.entity.AgencyEntity;
import com.nortal.lazar.agency.service.AgencyService;
import com.nortal.lazar.model.UserModel;
import com.nortal.lazar.user.entity.UserEntity;
import com.nortal.lazar.user.service.UserService;

@Controller
public class LoginController {

	private static final String USERNAME_PARAMETER = "username";
	private static final String PASSWORD_PARAMETER = "password";

	@Autowired
	private UserService userService;

	@Autowired
	private AgencyService agencyService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void openProjectURL(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.sendRedirect(request.getContextPath() + "/login");
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String openPage() {
		return "Login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String submitPage(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter(USERNAME_PARAMETER);
		String password = request.getParameter(PASSWORD_PARAMETER);
		UserEntity userEntity = userService.getUser(username);

		if (userEntity == null) {
			// error message and stay on the same page
			return "redirect:/login";
		} else if (!userEntity.getPassword().equals(password)) {
			// error message wrong pass and stay on the same page
			return "redirect:/login";
		} else {
			setSessionData(request, userEntity);
			return "/Protected/Home";
		}
	}

	private void setSessionData(HttpServletRequest request, UserEntity userEntity) {
		UserModel user = new UserModel(userEntity);
		AgencyEntity agencyEntity = agencyService.getAgency(user.getAgencyID());
		user.setAgencyName(agencyEntity.getName());
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		session.setAttribute("isAuthorized", true);
	}

}
