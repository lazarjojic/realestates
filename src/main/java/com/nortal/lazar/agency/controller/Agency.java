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
public class Agency {

	@Autowired
	private AgencyService agencyService;

	@RequestMapping(value = "/Protected/agency", method = RequestMethod.POST)
	public String staOvde(HttpServletRequest request, HttpServletResponse response) {
		return "/Protected/Agency";
	}

	@RequestMapping(value = "/Protected/agency", method = RequestMethod.GET)
	public String openPage() {
		return "/Protected/Agency";
	}

}
