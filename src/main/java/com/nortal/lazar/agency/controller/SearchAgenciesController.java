package com.nortal.lazar.agency.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.nortal.lazar.agency.entity.AgencyEntity;
import com.nortal.lazar.agency.model.AgencyModel;
import com.nortal.lazar.agency.service.AgencyService;

@SessionAttributes("agencyToView")
@Controller
public class SearchAgenciesController {

	@Autowired
	private AgencyService agencyService;

	@RequestMapping(value = "/protected/agency/searchAgencies", method = RequestMethod.POST)
	public String submitSearchAgenciesPage(@ModelAttribute("agency") AgencyModel agencyModel, HttpServletRequest request, HttpServletResponse response, Model model,
			HttpSession session) {
		String action = request.getParameter("action");
		if (action.equals("Search")) {
			AgencyModel finalAgencyModel = formatSearchParameters(agencyModel);
			List<AgencyEntity> foundAgencies = agencyService.getAgencies(finalAgencyModel.getName(), finalAgencyModel.getPIB(), finalAgencyModel.getDirector(),
					finalAgencyModel.getAddress(), finalAgencyModel.getPhone());
			model.addAttribute("agencies", foundAgencies);
			session.setAttribute("foundAgencies", foundAgencies);
			return "/protected/agency/SearchAgencies";
		} else {
			int selectedIndex = Integer.parseInt(request.getParameter("selectedIndex"));
			List<AgencyEntity> foundAgencies = (List<AgencyEntity>) session.getAttribute("foundAgencies");
			AgencyModel agencyToView = new AgencyModel(foundAgencies.get(selectedIndex - 1));
			model.addAttribute("agency", agencyToView);
			model.addAttribute("agencyToView", agencyToView);
			session.removeAttribute("foundAgencies");
			if (action.equals("Show")) {
				return "/protected/agency/ViewAgency";
			} else if (action.equals("Edit")) {
				return "/protected/agency/AddEditAgency";
			} else if (action.equals("Delete")) {
				return null;
			} else {
				return "/protected/agency/SearchAgencies";
			}
		}
	}

	@RequestMapping(value = "/protected/agency/searchAgencies", method = RequestMethod.GET)
	public String openSearchAgenciesPage() {
		return "/protected/agency/SearchAgencies";
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

		AgencyModel finalAgencyModel = new AgencyModel(name, PIB, director, address, phone);
		return finalAgencyModel;
	}

}
