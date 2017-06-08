package com.nortal.lazar.realestate.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.nortal.lazar.realestate.model.RealEstateAddressModel;
import com.nortal.lazar.realestate.model.RealEstateModel;
import com.nortal.lazar.realestate.model.RealEstateWrapperModel;

@SessionAttributes("realEstateModel")
@Controller
public class AddEditRealEstateController {

	@RequestMapping(value = "/protected/realEstate/addEditRealEstate", method = RequestMethod.GET)
	public String openPage(Model model, @ModelAttribute("realEstateWrapperModel") RealEstateWrapperModel realEstateWrapperModel, HttpSession session) {
		// RealEstateWrapperModel realEstateWrapperModel = new
		// RealEstateWrapperModel();
		// model.addAttribute("realEstateWrapperModel", realEstateWrapperModel);
	//	RealEstateModel realEstateModel = (RealEstateModel) session.getAttribute("realEstateModel");
		return "/protected/realEstate/AddEditRealEstate";
	}

	@RequestMapping(value = "/protected/realEstate/addEditRealEstate", method = RequestMethod.POST)
	public String submitPage(@ModelAttribute("realEstateWrapperModel") RealEstateWrapperModel realEstateWrapperModel) {

		return "/protected/realEstate/AddEditRealEstate";
	}

}