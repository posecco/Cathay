package com.example.cathayDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cathayDemo.service.CatchService;

@RestController
public class CurrencyController {
	
	@Autowired
	private CatchService cService;
	
	@GetMapping(value = "/getData")
	public Object getCurrencyData() {
		String result = cService.search();
		return 	result;	
	}
}
