package com.nortal.lazar.user.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.nortal.lazar.agency.service.AgencyService;
import com.nortal.lazar.user.model.UserModel;

@SessionAttributes("addOrEditAccount")
@Controller
public class ViewAccountController {

	@Autowired
	private AgencyService agencyService;

	@RequestMapping(value = "/protected/user/viewAccount", method = RequestMethod.POST)
	public ModelAndView submitPage(@RequestParam("action") String action, HttpSession session) {
		ModelAndView modelAndView = null;
		switch (action) {
		case "Close":
			modelAndView = new ModelAndView("/protected/user/SearchAccounts");
			modelAndView.addObject("userModel", new UserModel());
			break;
		case "Edit":
			modelAndView = new ModelAndView("/protected/user/AddEditAccount");
			String addOrEditAccount = (String) session.getAttribute("addOrEditAccount");
			if (addOrEditAccount == null) {
				modelAndView.addObject("addOrEditAccount", "edit");
				modelAndView.addObject("pageTitle", "Edit Account");
			}
			modelAndView.addObject("userModel", new UserModel());
			break;
		}
		return modelAndView;

	}

}
