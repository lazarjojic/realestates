package com.nortal.lazar.realestate.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@SessionAttributes(value = { "photos", "documents", "positions", "sketches" })
@Controller
public class PhotosController {

	// @RequestMapping(value = "/Protected/addPhotos", method =
	// RequestMethod.POST)
	// public String staOvde(HttpServletRequest request, HttpServletResponse
	// response) {
	// String action = request.getParameter("action");
	// if (action.equals("close")) {
	// return "index";
	// } else {
	// String name = request.getParameter("name");
	// String pib = request.getParameter("pib");
	// String director = request.getParameter("director");
	// String address = request.getParameter("address");
	// String phone = request.getParameter("phone");
	// Agency agency = new Agency(name, pib, director, address, phone);
	// agencyService.save(agency);
	// return "/Protected/AddAgency";
	// }
	// }

	@RequestMapping(value = "/Protected/RealEstate/photos", method = RequestMethod.GET)
	public String openPage(HttpSession session, Model model) {

		if (session.getAttribute("photos") != null) {
			List<String> photosTemp = new ArrayList<String>((List<String>) session.getAttribute("photos"));
			List<String> documentsTemp = new ArrayList<String>((List<String>) session.getAttribute("documents"));
			List<String> positionsTemp = new ArrayList<String>((List<String>) session.getAttribute("positions"));
			List<String> sketchesTemp = new ArrayList<String>((List<String>) session.getAttribute("sketches"));
			model.addAttribute("photosTemp", photosTemp);
			model.addAttribute("documentsTemp", documentsTemp);
			model.addAttribute("positionsTemp", positionsTemp);
			model.addAttribute("sketchesTemp", sketchesTemp);
		} else {
			List<String> photosTemp = new ArrayList<String>();
			List<String> documentsTemp = new ArrayList<String>();
			List<String> positionsTemp = new ArrayList<String>();
			List<String> sketchesTemp = new ArrayList<String>();
			List<String> photos = new ArrayList<String>();
			List<String> documents = new ArrayList<String>();
			List<String> positions = new ArrayList<String>();
			List<String> sketches = new ArrayList<String>();
			model.addAttribute("photosTemp", photosTemp);
			model.addAttribute("documentsTemp", documentsTemp);
			model.addAttribute("positionsTemp", positionsTemp);
			model.addAttribute("sketchesTemp", sketchesTemp);
			model.addAttribute("photos", photos);
			model.addAttribute("documents", documents);
			model.addAttribute("positions", positions);
			model.addAttribute("sketches", sketches);
		}

		return "/Protected/RealEstate/Photos";
	}

	@RequestMapping(value = "/Protected/RealEstate/photos", method = RequestMethod.POST)
	public String submitPage(HttpServletRequest request, SessionStatus sessionStatus, HttpSession session, Model model) {
		String action = request.getParameter("action");
		switch (action) {
		case "Close":
			session.removeAttribute("photosTemp");
			session.removeAttribute("documentsTemp");
			session.removeAttribute("positionsTemp");
			session.removeAttribute("sketchesTemp");
			return "/Protected/RealEstate";
		case "Save":
			List<String> photos = (List<String>) session.getAttribute("photos");
			List<String> documents = (List<String>) session.getAttribute("documents");
			List<String> positions = (List<String>) session.getAttribute("positions");
			List<String> sketchesTemp = (List<String>) session.getAttribute("sketches");

			photos = (List<String>) session.getAttribute("photosTemp");
			documents = (List<String>) session.getAttribute("documentsTemp");
			positions = (List<String>) session.getAttribute("positionsTemp");
			sketchesTemp = (List<String>) session.getAttribute("sketchesTemp");
			
			session.removeAttribute("photosTemp");
			session.removeAttribute("documentsTemp");
			session.removeAttribute("positionsTemp");
			session.removeAttribute("sketchesTemp");
			return "/Protected/RealEstate";
		default:
			return null;
		}

	}
}
