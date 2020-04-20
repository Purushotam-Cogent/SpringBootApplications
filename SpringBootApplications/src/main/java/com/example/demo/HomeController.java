package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String getHome()
	{
		return "<h1>Welcome to Spring STS Home</h1>";
	}

}
