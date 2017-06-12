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

@SessionAttributes({ "foundAccounts", "selectedAccount" })
@Controller
public class SearchAccountsController {

	@Autowired
	private AgencyService agencyService;

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/protected/user/searchAccounts", method = RequestMethod.GET)
	public ModelAndView openPage(HttpServletRequest request, HttpServletResponse response, Model model) {
		ModelAndView modelAndView = new ModelAndView("/protected/user/SearchAccounts");
		modelAndView.addObject("userModel", new UserModel());
		return modelAndView;
	}

	@RequestMapping(value = "/protected/user/searchAccounts", method = RequestMethod.POST)
	public String submitPage(@RequestParam("action") String action, @ModelAttribute("userModel") UserModel userModel, Model model,
			@RequestParam("selectedIndex") String selectedIndex, HttpSession session) {
		List<Object[]> foundAccounts = null;
		switch (action) {
		case "Search":
			UserModel finalUserModel = formatSearchParameters(userModel);
			Integer finalAgencyID = finalUserModel.getAgencyID();
			if (finalUserModel.getAgencyID() == -1)
				finalAgencyID = null;
			foundAccounts = userService.getUsers(finalUserModel.getFirstName(), finalUserModel.getLastName(), finalUserModel.getPhone(), finalAgencyID, finalUserModel.getStatus(),
					finalUserModel.getUsername());
			model.addAttribute("foundAccounts", foundAccounts);
			return "protected/user/SearchAccounts";
		case "Show":
			if (selectedIndex.equals(""))
				return "protected/user/SearchAccounts";
			foundAccounts = (List<Object[]>) session.getAttribute("foundAccounts");
			UserModel selectedAccount = extractSelectedAccount(foundAccounts, Integer.parseInt(selectedIndex) - 1);
			// remove session attributes

			model.addAttribute("selectedAccount", selectedAccount);
			return "protected/user/ViewAccount";
		case "Close":
			// remove session attributes
			return "protected/Home";
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
		if (userModel.getStatus().equals("Show All"))
			status = null;
		if (userModel.getUsername().equals(""))
			username = null;

		// ID=0 just to put some value in constructor, it will never be used
		UserModel finalUserModel = new UserModel(0, firstName, lastName, phone, agencyID, agencyName, status, username, password);
		return finalUserModel;
	}

	private UserModel extractSelectedAccount(List<Object[]> foundAccounts, int index) {
		int i = 0;
		int ID = (Integer) (foundAccounts.get(index))[i];
		String firstName = (String) (foundAccounts.get(index))[++i];
		String lastName = (String) (foundAccounts.get(index))[++i];
		String phone = (String) (foundAccounts.get(index))[++i];
		String agencyName = (String) (foundAccounts.get(index))[++i];
		String status = (String) (foundAccounts.get(index))[++i];
		String username = (String) (foundAccounts.get(index))[++i];
		// should i set agency id???
		return new UserModel(ID, firstName, lastName, phone, 0, agencyName, status, username, null);
	}

}
