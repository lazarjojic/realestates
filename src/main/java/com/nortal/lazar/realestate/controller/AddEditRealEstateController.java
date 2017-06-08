package com.nortal.lazar.realestate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nortal.lazar.realestate.model.RealEstateAddressModel;
import com.nortal.lazar.realestate.model.RealEstateModel;
import com.nortal.lazar.realestate.model.RealEstateWrapperModel;

@Controller
public class AddEditRealEstateController {

	@RequestMapping(value = "/Protected/RealEstate/addEditRealEstate", method = RequestMethod.GET)
	public String openPage(Model model) {
		RealEstateWrapperModel realEstateWrapperModel = new RealEstateWrapperModel();
		model.addAttribute("realEstateWrapperModel", realEstateWrapperModel);		
		return "/Protected/RealEstate/AddEditRealEstate";
	}
	
	@RequestMapping(value = "/Protected/RealEstate/addEditRealEstate", method = RequestMethod.POST)
	public String submitPage(@ModelAttribute("realEstateWrapperModel") RealEstateWrapperModel realEstateWrapperModel) {
		
		return "/Protected/RealEstate/AddEditRealEstate";
	}

}
