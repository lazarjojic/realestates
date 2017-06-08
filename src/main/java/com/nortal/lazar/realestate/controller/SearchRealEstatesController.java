package com.nortal.lazar.realestate.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nortal.lazar.agency.entity.AgencyEntity;
import com.nortal.lazar.agency.service.AgencyService;

@Controller
public class SearchRealEstatesController {

	@Autowired
	private AgencyService agencyService;

	@RequestMapping(value = "/protected/searchRealEstates", method = RequestMethod.POST)
	public String staOvde(HttpServletRequest request, HttpServletResponse response) {
		String action = request.getParameter("action");
		if (action.equals("Show")) {
			return "/protected/RealEstate";
		} else if (action.equals("Edit")) {
			String name = request.getParameter("name");
			String pib = request.getParameter("pib");
			String director = request.getParameter("director");
			String address = request.getParameter("address");
			String phone = request.getParameter("phone");
			AgencyEntity agency = new AgencyEntity(name, pib, director, address, phone);
			agencyService.save(agency);
			return "/protected/EditRealEstate";
		} else if (action.equals("Delete")) {
			return null;
		} else {
			return "/protected/SearchRealEstates";
		}
	}

	@RequestMapping(value = "/protected/searchRealEstates", method = RequestMethod.GET)
	public String openPage() {
		return "/protected/SearchRealEstates";
	}

}
