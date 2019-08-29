package com.Blogpost.service;

import java.util.List;

import com.Blogpost.POJO.blog;

public interface blogService {
	public boolean saveBlog(blog blog);
	public List<blog> getUserBlog(int userid);
}
