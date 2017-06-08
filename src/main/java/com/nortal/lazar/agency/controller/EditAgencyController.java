package com.nortal.lazar.agency.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nortal.lazar.agency.entity.AgencyEntity;
import com.nortal.lazar.agency.service.AgencyService;

@Controller
public class EditAgencyController {

	@Autowired
	private AgencyService agencyService;

	@RequestMapping(value = "/protected/editAgency", method = RequestMethod.POST)
	public String staOvde(HttpServletRequest request, HttpServletResponse response) {
		String action = request.getParameter("action");
		if (action.equals("close")) {
			return "index";
		} else {
			String name = request.getParameter("name");
			String pib = request.getParameter("pib");
			String director = request.getParameter("director");
			String address = request.getParameter("address");
			String phone = request.getParameter("phone");
			AgencyEntity agency = new AgencyEntity(name, pib, director, address, phone);
			agencyService.save(agency);
			return "/protected/EditAgency";
		}
	}

	@RequestMapping(value = "/protected/editAgency", method = RequestMethod.GET)
	public String openPage() {
		return "/protected/EditAgency";
	}

}
