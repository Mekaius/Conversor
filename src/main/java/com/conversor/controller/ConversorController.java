package com.conversor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.conversor.models.conversorValores;
import com.conversor.repository.ConversorRepository;

@Controller
public class ConversorController {
	
	@Autowired
	private ConversorRepository er;
	
	@RequestMapping(value="/Conversor", method=RequestMethod.GET)
	public String form() {
		return "conversor/formConversor";
	}
	@RequestMapping(value="/Conversor", method=RequestMethod.POST)
	public String form(conversorValores cnv) {
		
		er.save(cnv);
		
		return "redirect:/Conversor";
	}
}
