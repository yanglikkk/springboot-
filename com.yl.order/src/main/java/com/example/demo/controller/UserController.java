package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class UserController {
	@RequestMapping("/wel")
	public String wel() {
		return "wel";
	}
	
}
