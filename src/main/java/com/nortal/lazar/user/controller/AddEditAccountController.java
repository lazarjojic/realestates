package com.nortal.lazar.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

	@RequestMapping(method = RequestMethod.GET, value = "/Protected/addEditAccount")
	public String openKreiranjeNaloga(Model model) {
		List<Object[]> agencies = agencyService.getAgenciesNames();
		model.addAttribute("agencies", agencies);
		model.addAttribute("profile", new UserModel());
		return "/Protected/CreateAccount";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/Protected/addEditAccount")
	public String doPost(HttpServletRequest request, HttpServletResponse response, Model model) {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String phone = request.getParameter("phone");
		int agencyID = Integer.parseInt(request.getParameter("agency"));
		String status = request.getParameter("status");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserEntity userEntity = new UserEntity(firstName, lastName, phone, agencyID, status, username, password);
		userService.save(userEntity);
		List<Object[]> agencies = agencyService.getAgenciesNames();
		model.addAttribute("agencies", agencies);
		return "/Protected/CreateAccount";
	}

}
