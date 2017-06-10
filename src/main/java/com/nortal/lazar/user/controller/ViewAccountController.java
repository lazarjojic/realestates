package com.nortal.lazar.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.nortal.lazar.agency.service.AgencyService;
import com.nortal.lazar.user.model.UserModel;


@Controller
public class ViewAccountController {

	@Autowired
	private AgencyService agencyService;

	@RequestMapping(value = "/protected/user/viewAccount", method = RequestMethod.POST)
	public ModelAndView submitPage(@RequestParam("action") String action) {
		ModelAndView modelAndView = null;
		List<Object[]> existingAgencies = agencyService.getAgenciesNames();
		switch (action) {
		case "Close":
			modelAndView = new ModelAndView("/protected/user/SearchAccounts");
			modelAndView.addObject("userModel", new UserModel());
			modelAndView.addObject("existingAgencies", existingAgencies);
			break;
		case "Edit":
			modelAndView = new ModelAndView("/protected/user/AddEditAccount");
			modelAndView.addObject("userModel", new UserModel());
			//modelAndView.addObject("existingAgencies", existingAgencies);
			break;
		}
		return modelAndView;

	}

	// @RequestMapping(value = "/protected/user/viewAccount", method =
	// RequestMethod.GET)
	// public String openPage(HttpServletRequest request, HttpServletResponse
	// response, Model model) {
	//
	// return "/Protected/Account";
	// }

}
