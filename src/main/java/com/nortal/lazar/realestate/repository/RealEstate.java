package com.nortal.lazar.realestate.repository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nortal.lazar.agency.entity.AgencyEntity;
import com.nortal.lazar.agency.service.AgencyService;

@Controller
public class RealEstate {

	@Autowired
	private AgencyService agencyService;

	@RequestMapping(value = "/Protected/realEstate", method = RequestMethod.POST)
	public String staOvde(HttpServletRequest request, HttpServletResponse response) {
		return "/Protected/RealEstate";
	}

	@RequestMapping(value = "/Protected/realEstate", method = RequestMethod.GET)
	public String openPage() {
		return "/Protected/RealEstate";
	}

}
