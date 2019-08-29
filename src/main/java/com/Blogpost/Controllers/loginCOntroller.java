package com.Blogpost.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginCOntroller {
	
	@GetMapping("/")
	public String login() {
		return "index";
	}

}
