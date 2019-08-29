package com.Blogpost.Dao;

import java.util.List;

import com.Blogpost.POJO.blog;

public interface blogDao {
	public boolean saveBlog(blog blog);
	public List<blog> getUserBlog(int userid);
}
