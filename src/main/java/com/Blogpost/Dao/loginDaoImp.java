package com.Blogpost.Dao;

import org.springframework.stereotype.Repository;

import com.Blogpost.POJO.user;

@Repository
public class loginDaoImp implements loginDao {

	@Override
	public boolean login(user user) {
		if (user.getName().equalsIgnoreCase("admin") && user.getPassword().equalsIgnoreCase("1"))
			return true;
		else
			return false;
	}

	@Override
	public boolean register(user user) {
		return true;
	}

}
