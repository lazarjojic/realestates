package com.nortal.lazar.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/protected/home", method = RequestMethod.GET)
	public String openProjectURL(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "protected/Home";
	}

}
