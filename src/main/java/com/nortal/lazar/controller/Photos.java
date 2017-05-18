package com.nortal.lazar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Photos {

//	@RequestMapping(value = "/Protected/addPhotos", method = RequestMethod.POST)
//	public String staOvde(HttpServletRequest request, HttpServletResponse response) {
//		String action = request.getParameter("action");
//		if (action.equals("close")) {
//			return "index";
//		} else {
//			String name = request.getParameter("name");
//			String pib = request.getParameter("pib");
//			String director = request.getParameter("director");
//			String address = request.getParameter("address");
//			String phone = request.getParameter("phone");
//			Agency agency = new Agency(name, pib, director, address, phone);
//			agencyService.save(agency);
//			return "/Protected/AddAgency";
//		}
//	}

	@RequestMapping(value = "/Protected/photos", method = RequestMethod.GET)
	public String openPage() {
		return "/Protected/Photos";
	}
}
