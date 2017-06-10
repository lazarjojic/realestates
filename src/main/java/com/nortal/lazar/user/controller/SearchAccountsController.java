package com.nortal.lazar.user.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.nortal.lazar.agency.service.AgencyService;
import com.nortal.lazar.user.model.UserModel;
import com.nortal.lazar.user.service.UserService;

@SessionAttributes(value = { "existingAgencies", "foundAccounts" })
@Controller
public class SearchAccountsController {

	@Autowired
	private AgencyService agencyService;

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/protected/user/searchAccounts", method = RequestMethod.GET)
	public ModelAndView openPage(HttpServletRequest request, HttpServletResponse response, Model model) {
		List<Object[]> existingAgencies = agencyService.getAgenciesNames();
		ModelAndView modelAndView = new ModelAndView("/protected/user/SearchAccounts");
		modelAndView.addObject("userModel", new UserModel());
		modelAndView.addObject("existingAgencies", existingAgencies);
		return modelAndView;
	}

	@RequestMapping(value = "/protected/user/searchAccounts", method = RequestMethod.POST)
	public String submitPage(@RequestParam("action") String action, @ModelAttribute("userModel") UserModel userModel, Model model, @RequestParam("selectedIndex") String selectedIndex, HttpSession session) {
		List<Object[]> foundAccounts = null;
		switch (action) {
		case "Search":
			UserModel finalUserModel = formatSearchParameters(userModel);
			foundAccounts = userService.getUsers(finalUserModel.getFirstName(), finalUserModel.getLastName(), finalUserModel.getPhone(),
					finalUserModel.getAgencyID(), finalUserModel.getStatus(), finalUserModel.getUsername());
			model.addAttribute("foundAccounts", foundAccounts);
			return "/protected/user/SearchAccounts";
		case "Show":
			foundAccounts = (List<Object[]>)session.getAttribute("foundAccounts");
			// remove session attributes
			UserModel selectedAccount = extractSelectedAccount(foundAccounts, Integer.parseInt(selectedIndex));
			model.addAttribute("selectedAccount", selectedAccount);
			return "/protected/user/ViewAccount";
		case "Close":
			// remove session attributes
			return "/protected/Home";
		default:
			return null;
		}
	}

	private UserModel formatSearchParameters(UserModel userModel) {
		String firstName = userModel.getFirstName();
		String lastName = userModel.getLastName();
		String phone = userModel.getPhone();
		int agencyID = userModel.getAgencyID();
		String agencyName = null;
		String status = userModel.getStatus();
		String username = userModel.getUsername();
		String password = null;
		if (userModel.getFirstName().equals(""))
			firstName = null;
		if (userModel.getLastName().equals(""))
			lastName = null;
		if (userModel.getPhone().equals(""))
			phone = null;
		if (userModel.getUsername().equals(""))
			username = null;
		UserModel finalUserModel = new UserModel(firstName, lastName, phone, agencyID, agencyName, status, username, password);
		return finalUserModel;
	}

	UserModel extractSelectedAccount(List<Object[]> foundAccounts, int index) {
		// String firstName = (String)((Object[])foundAccounts.get(index))[0];
		String firstName = (String) (foundAccounts.get(index))[0];
		return new UserModel(firstName, "", "", 0, "", "", "", "");

	}

}
