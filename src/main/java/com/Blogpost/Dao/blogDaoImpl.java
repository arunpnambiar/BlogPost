package com.Blogpost.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

import org.springframework.stereotype.Repository;

import com.Blogpost.POJO.blog;

@Repository
public class blogDaoImpl implements blogDao {
	List<blog> blogList = new ArrayList<blog>();
	@Override
	public boolean saveBlog(blog blog) {
		blogList.add(blog);
		return true;
	}

	@Override
	public List<blog> getUserBlog(int userid) {
		
		return blogList.stream().filter(x-> x.getUserid() == userid).collect(Collectors.toList());
	}

}
