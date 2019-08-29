package com.Blogpost.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Blogpost.POJO.blog;
import com.Blogpost.POJO.user;
import com.Blogpost.service.blogService;
import com.Blogpost.service.loginService;

@Controller
public class loginCOntroller {
	@Autowired 
	loginService service;
	@Autowired
	blogService blogservice;
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/login")
	public ModelAndView login(user user) {
		ModelAndView mav = null;
		boolean isSuccess = service.login(user);
		if(isSuccess)
		{
			List<blog> blog = blogservice.getUserBlog(user.getId());
			 mav = new ModelAndView("login");
			 mav.addObject("Blodlist", blog);
			 return mav;
		}
		else {
			mav = new ModelAndView("register");
			return mav;
		}
	}
}
