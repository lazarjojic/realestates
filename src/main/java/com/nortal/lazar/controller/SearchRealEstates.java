package com.nortal.lazar.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nortal.lazar.entity.AgencyEntity;
import com.nortal.lazar.service.AgencyService;

@Controller
public class SearchRealEstates {

	@Autowired
	private AgencyService agencyService;

	@RequestMapping(value = "/Protected/searchRealEstates", method = RequestMethod.POST)
	public String staOvde(HttpServletRequest request, HttpServletResponse response) {
		String action = request.getParameter("action");
		if (action.equals("Show")) {
			return "/Protected/RealEstate";
		} else if (action.equals("Edit")) {
			String name = request.getParameter("name");
			String pib = request.getParameter("pib");
			String director = request.getParameter("director");
			String address = request.getParameter("address");
			String phone = request.getParameter("phone");
			AgencyEntity agency = new AgencyEntity(name, pib, director, address, phone);
			agencyService.save(agency);
			return "/Protected/EditRealEstate";
		} else if (action.equals("Delete")) {
			return null;
		} else {
			return "/Protected/SearchRealEstates";
		}
	}

	@RequestMapping(value = "/Protected/searchRealEstates", method = RequestMethod.GET)
	public String openPage() {
		return "/Protected/SearchRealEstates";
	}

}
