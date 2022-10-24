package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SkyController {
	 @RequestMapping(path = "/call", method = RequestMethod.GET)
	    public String showLoginPage() {
	        return "call";
	    }
}
