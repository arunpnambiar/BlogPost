package com.Blogpost.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.Blogpost.POJO.blog;

@Repository
public class blogDaoImpl implements blogDao {

	@Override
	public boolean saveBlog(blog blog) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<blog> getUserBlog(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

}
