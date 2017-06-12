package com.nortal.lazar.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.nortal.lazar.agency.entity.AgencyEntity;
import com.nortal.lazar.agency.service.AgencyService;
import com.nortal.lazar.model.LoginModel;
import com.nortal.lazar.user.entity.UserEntity;
import com.nortal.lazar.user.model.UserModel;
import com.nortal.lazar.user.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@Autowired
	private AgencyService agencyService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void openProjectURL(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.sendRedirect(request.getContextPath() + "/login");
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView openPage(HttpServletRequest request, HttpServletResponse response) {
		this.getClass().getClassLoader().getResourceAsStream("korali.jpg");
		if (isUserLogedin(request)) {
			return new ModelAndView("protected/Home");
		} else {
			ModelAndView mav = new ModelAndView("Login");
			mav.addObject("login", new LoginModel());
			return mav;
		}
	}

	private boolean isUserLogedin(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Object authorizationAttribute = session.getAttribute("isAuthorized");
		if (authorizationAttribute == null)
			return false;
		return (boolean) authorizationAttribute;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String submitPage(@Valid @ModelAttribute("login") LoginModel loginModel, BindingResult result, HttpServletRequest request, Model model) {
		if (result.hasErrors()) {
			return "Login";
		}
		String username = loginModel.getUsername();
		String password = loginModel.getPassword();
		UserEntity userEntity = userService.getUser(username);
		if (userEntity == null) {
			// error message wrong username or password and stay on the same
			// page
			return "Login";
		} else if (!userEntity.getPassword().equals(password)) {
			// error message wrong username or password and stay on the same
			// page
			return "Login";
		} else {
			setSessionData(request, userEntity);
			return "redirect:/protected/home";
		}
	}

	private void setSessionData(HttpServletRequest request, UserEntity userEntity) {
		UserModel currentUser = new UserModel(userEntity);
		AgencyEntity agencyEntity = agencyService.getAgency(currentUser.getAgencyID());
		currentUser.setAgencyName(agencyEntity.getName());
		HttpSession session = request.getSession();
		session.setAttribute("currentUser", currentUser);
		session.setAttribute("isAuthorized", true);
	}

}
