package com.dtech.utility.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilityController {

	@RequestMapping("/")
	public String welcomePage(Map<String, Object> input) {
		return "index";
	}
	
}
