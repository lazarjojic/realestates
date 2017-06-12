package com.nortal.lazar.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.nortal.lazar.agency.service.AgencyService;

@SessionAttributes("existingAgencies")
@Controller
public class HomeController {

	@Autowired
	private AgencyService agencyService;

	@RequestMapping(value = "/protected/home", method = RequestMethod.GET)
	public ModelAndView openProjectURL(HttpSession session) throws IOException {
		ModelAndView modelAndView = new ModelAndView("protected/Home");
		setExistingAgenciesSessionAttribute(session, modelAndView);
		return modelAndView;
	}

	private void setExistingAgenciesSessionAttribute(HttpSession session, ModelAndView modelAndView) {
		List<Object[]> existingAgencies = (List<Object[]>) session.getAttribute("existingAgencies");
		if (existingAgencies == null) {
			existingAgencies = agencyService.getAgenciesNames();
			modelAndView.addObject("existingAgencies", existingAgencies);
		}
	}

}
