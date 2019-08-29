package com.Blogpost.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.Blogpost.POJO.user;
import com.Blogpost.service.loginService;

@Controller
public class loginCOntroller {
	@Autowired 
	loginService service;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/login")
	public String login(user user) {
		boolean isSuccess = service.login(user);
		if(isSuccess)
		{
			return "blog";
		}
		else {
			return "index";
		}
	}
}
