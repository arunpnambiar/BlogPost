package com.Blogpost.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping("/login")
	public ModelAndView login(user user) {
		ModelAndView mav = new ModelAndView();
		boolean isSuccess = service.login(user);
		if(isSuccess)
		{
			user.setId(100);
			System.out.print(user.toString());
			List<blog> blog = blogservice.getUserBlog(user.getId());
			 mav = new ModelAndView("/blog");
			 mav.addObject("Bloglist", blog);
			 return mav;
		}
		else {
			mav = new ModelAndView("register");
			return mav;
		}
	}
	@PostMapping("/register")
	public ModelAndView register(user user) {
		ModelAndView mav = null;
		boolean isSuccess = service.register(user);
		if(isSuccess)
		{
			user.setId(100);
			System.out.print(user.toString());
			List<blog> blog = blogservice.getUserBlog(user.getId());
			 mav = new ModelAndView("/blog");
			 mav.addObject("Bloglist", blog);
			 
		}
		return mav;
	}
}
