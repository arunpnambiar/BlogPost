package com.Blogpost.Dao;

import com.Blogpost.POJO.user;

public interface loginDao {
	
	public boolean login(user user);
	public boolean register(user user);

}
