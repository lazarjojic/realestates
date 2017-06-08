package com.nortal.lazar.realestate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.nortal.lazar.realestate.model.RealEstateWrapperModel;

@SessionAttributes("realEstateWrapperModel")
@Controller
public class RealEstateDataController {

	@RequestMapping(value = "/protected/realEstate/realEstateData", method = RequestMethod.GET)
	public String openPage(Model model) {
		RealEstateWrapperModel realEstateWrapperModel = new RealEstateWrapperModel();
		model.addAttribute("realEstateWrapperModel", realEstateWrapperModel);
		return "/protected/realEstate/RealEstateData";
	}

	@RequestMapping(value = "/protected/realEstate/realEstateData", method = RequestMethod.POST)
	public String submitPage(@RequestParam("action") String action, @ModelAttribute("realEstateWrapperModel") RealEstateWrapperModel realEstateWrapperModel, Model model) {
		switch (action) {
		case "Save":
			model.addAttribute("realEstateWrapperModel", realEstateWrapperModel);
			return "/protected/realEstate/AddEditRealEstate";
		case "Close":
			return "/protected/realEstate/AddEditRealEstate";
		default:
			return "/protected/realEstate/AddEditRealEstate";
		}
	}

}
