package com.js.octopus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MainController {
	
	@RequestMapping
	public @ResponseBody String main(){
		return "Hello Octopus";
	}
}
