package com.Blogpost.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Blogpost.Dao.blogDao;
import com.Blogpost.POJO.blog;

@Service
public class blogServiceImpl implements blogService{

	@Autowired
	blogDao dao;
	
	@Override
	public boolean saveBlog(blog blog) {
		return dao.saveBlog(blog);
	}

	@Override
	public List<blog> getUserBlog(int userid) {
		return dao.getUserBlog(userid);
	}

}
