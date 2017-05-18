package com.nortal.lazar.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nortal.lazar.klase.User;
import com.nortal.lazar.service.AgencyService;

@Controller
public class Account {

	@Autowired
	private AgencyService agencyService;

	@RequestMapping(value = "/Protected/account", method = RequestMethod.POST)
	public String staOvde(HttpServletRequest request, HttpServletResponse response) {
		return null;
	}

	@RequestMapping(value = "/Protected/account", method = RequestMethod.GET)
	public String openPage(HttpServletRequest request, HttpServletResponse response, Model model) {
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		model.addAttribute("account", user);
		return "/Protected/Account";
	}

}
