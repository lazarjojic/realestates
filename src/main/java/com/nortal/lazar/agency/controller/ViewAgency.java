package com.nortal.lazar.agency.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.nortal.lazar.agency.model.AgencyModel;

@SessionAttributes("agencyToView")
@Controller
public class ViewAgency {

	@RequestMapping(value = "/Protected/Agency/viewAgency", method = RequestMethod.POST)
	public String submitViewAgencyPage(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("agencyToView") AgencyModel agencyToView, Model model, SessionStatus sessionStatus) {
		model.addAttribute("agency", agencyToView);
		String action = request.getParameter("action");
		switch (action) {
		case "Edit":
			return "/Protected/Agency/AddEditAgency";
		case "Close":
			sessionStatus.setComplete();
			return "/Protected/Agency/SearchAgencies";
		case "Delete":
			return null;
		default:
			return null;
		}
	}

}
