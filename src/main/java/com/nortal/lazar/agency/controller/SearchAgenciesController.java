package com.nortal.lazar.agency.controller;

import java.util.List;

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
public class SearchAgenciesController {

	@Autowired
	private AgencyService agencyService;

	@RequestMapping(value = "/Protected/Agency/searchAgencies", method = RequestMethod.POST)
	public String staOvde(@ModelAttribute("searchAgencies") AgencyModel agencyModel, HttpServletRequest request, HttpServletResponse response, Model model) {
		String action = request.getParameter("action");
		if (action.equals("show")) {
			return "/Protected/Agency/ViewAgency";
		} else if (action.equals("edit")) {
			String name = request.getParameter("name");
			String pib = request.getParameter("pib");
			String director = request.getParameter("director");
			String address = request.getParameter("address");
			String phone = request.getParameter("phone");
			AgencyEntity agency = new AgencyEntity(name, pib, director, address, phone);
			agencyService.save(agency);
			return "/Protected/Agency/EditAgency";
		} else if (action.equals("delete")) {
			return null;
		} else if (action.equals("search")) {
			AgencyModel finalAgencyModel = formatSearchParameters(agencyModel);
			List<AgencyEntity> agencies = agencyService.getAncies(finalAgencyModel.getName(), finalAgencyModel.getPIB(), finalAgencyModel.getDirector(),
					finalAgencyModel.getAddress(), finalAgencyModel.getPhone());
			model.addAttribute("agencies", agencies);
			return "/Protected/Agency/SearchAgencies";
		} else {
			return "/Protected/Agency/SearchAgencies";
		}
	}

	@RequestMapping(value = "/Protected/Agency/searchAgencies", method = RequestMethod.GET)
	public String openSearchAgenciesPage() {
		return "/Protected/Agency/SearchAgencies";
	}

	/**
	 * Replace each empty search parameter with null value
	 * 
	 * @param agencyModel
	 * @return
	 */
	private AgencyModel formatSearchParameters(AgencyModel agencyModel) {
		String name = agencyModel.getName();
		String PIB = agencyModel.getPIB();
		String director = agencyModel.getDirector();
		String address = agencyModel.getAddress();
		String phone = agencyModel.getPhone();

		if (name.equals(""))
			name = null;
		if (PIB.equals(""))
			PIB = null;
		if (director.equals(""))
			director = null;
		if (address.equals(""))
			address = null;
		if (phone.equals(""))
			phone = null;

		AgencyModel agencyModelFinal = new AgencyModel(name, PIB, director, address, phone);
		return agencyModelFinal;
	}

}
