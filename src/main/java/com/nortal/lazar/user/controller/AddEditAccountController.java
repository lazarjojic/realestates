package com.nortal.lazar.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nortal.lazar.agency.service.AgencyService;
import com.nortal.lazar.user.entity.UserEntity;
import com.nortal.lazar.user.model.UserModel;
import com.nortal.lazar.user.service.UserService;

@Controller
public class AddEditAccountController {

	@Autowired
	private AgencyService agencyService;

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET, value = "/protected/user/addEditAccount")
	public ModelAndView openKreiranjeNaloga() {
		List<Object[]> agencies = agencyService.getAgenciesNames();
		ModelAndView modelAndView = new ModelAndView("/protected/user/AddEditAccount");
		modelAndView.addObject("userModel", new UserModel());
		modelAndView.addObject("agencies", agencies);
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/protected/user/addEditAccount")
	public String doPost(@ModelAttribute(value = "userModel") UserModel userModel, HttpServletRequest request, HttpServletResponse response, Model model,
			@RequestParam("action") String action) {
		switch (action) {
		case "Save":
			UserEntity userEntity = new UserEntity(userModel);
			userService.save(userEntity);
			List<Object[]> agencies = agencyService.getAgenciesNames();
			model.addAttribute("agencies", agencies);
			// returning redirect in order to have clear form
			return "redirect:/protected/user/addEditAccount";
		case "Close":
			return "protected/Home";
		default:
			return "protected/Home";
		}

	}

}
