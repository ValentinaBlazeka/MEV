package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;


@Controller
public class WebController {

	@RequestMapping(value ={"/", "/popisclanova"}, method = RequestMethod.GET)
	public ModelAndView pocetak(HttpSession request) {

		ModelAndView retVal = new ModelAndView();
		retVal.setViewName("popis_clanova");
		return retVal; 
	}
	
	
}
