package com.nortal.lazar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddRealEstate {

	@RequestMapping(value = "/Protected/addRealEstate", method = RequestMethod.GET)
	public String openPage() {
		return "/Protected/AddRealEstate";
	}

}
