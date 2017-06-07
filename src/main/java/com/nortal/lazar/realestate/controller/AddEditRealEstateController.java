package com.nortal.lazar.realestate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nortal.lazar.realestate.model.RealEstateModel;

@Controller
public class AddEditRealEstateController {

	@RequestMapping(value = "/Protected/RealEstate/addEditRealEstate", method = RequestMethod.GET)
	public String openPage(Model model) {
		RealEstateModel realEstateModel = new RealEstateModel();		
		model.addAttribute("realEstateModel", realEstateModel);
		return "/Protected/RealEstate/AddEditRealEstate";
	}
	
	@RequestMapping(value = "/Protected/RealEstate/addEditRealEstate", method = RequestMethod.POST)
	public String submitPage(@ModelAttribute("realEstateModel") RealEstateModel realEstateModel) {
		
		return "/Protected/RealEstate/AddEditRealEstate";
	}

}
