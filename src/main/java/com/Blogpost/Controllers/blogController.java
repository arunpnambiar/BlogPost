package com.Blogpost.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Blogpost.POJO.blog;
import com.Blogpost.service.blogService;

@Controller
public class blogController {
	@Autowired
	blogService service;

	@PostMapping
	public ModelAndView saveBlog(blog blog) {
		ModelAndView mav = new ModelAndView("blog");
		boolean isSuccess = service.saveBlog(blog);
		if (isSuccess) {
			System.out.print(blog.toString());
			List<blog> blogData = service.getUserBlog(blog.getUserid());
			mav = new ModelAndView("/blog");
			mav.addObject("Bloglist", blogData);

		}
		return mav;
	}

}
