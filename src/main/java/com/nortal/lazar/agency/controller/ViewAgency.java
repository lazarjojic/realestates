package com.nortal.lazar.agency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nortal.lazar.agency.model.AgencyModel;

@Controller
public class ViewAgency {

	@RequestMapping(value = "/Protected/Agency/viewAgency", method = RequestMethod.GET)
	public ModelAndView openViewAgencyPage(AgencyModel agencyModel) {
		ModelAndView modelAndView = new ModelAndView("ViewAgency");
		modelAndView.addObject("agencyModel", agencyModel);
		return modelAndView;
	}

}
