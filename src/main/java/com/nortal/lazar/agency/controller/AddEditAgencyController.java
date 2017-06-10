package com.nortal.lazar.agency.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nortal.lazar.agency.entity.AgencyEntity;
import com.nortal.lazar.agency.model.AgencyModel;
import com.nortal.lazar.agency.service.AgencyService;

@Controller
public class AddEditAgencyController {

	@Autowired
	private AgencyService agencyService;

	@RequestMapping(value = "/protected/agency/addEditAgency", method = RequestMethod.POST)
	public String submitForm(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("agency") AgencyModel agencyModel) {
		String action = request.getParameter("action");
		if (action.equals("Close")) {
			return "/protected/Home";
		} else {
			//for this better constructor
			AgencyEntity agencyEntity = new AgencyEntity(agencyModel.getName(), agencyModel.getPIB(), agencyModel.getDirector(), agencyModel.getAddress(), agencyModel.getPhone());
			agencyService.save(agencyEntity);			
			return "redirect:/protected/agency/addEditAgency";
		}
	}

	@RequestMapping(value = "/protected/agency/addEditAgency", method = RequestMethod.GET)
	public String openPage(Model model) {
		AgencyModel agencyModel = new AgencyModel();
		model.addAttribute("agency", agencyModel);
		return "/protected/agency/AddEditAgency";
	}

}
