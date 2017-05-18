package com.nortal.lazar.realestate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EditRealEstate {

	@RequestMapping(value = "/Protected/editRealEstate", method = RequestMethod.GET)
	public String openPage() {
		return "/Protected/editRealEstate";
	}

}
