package com.udemy.limitsmicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.limitsmicroservice.bean.Configuration;
import com.udemy.limitsmicroservice.bean.LimitConfiguration;

@RestController
@RequestMapping("/limits")
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping
	public LimitConfiguration retrieveLimitsFromConfiguration(){
		return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
	}

}
