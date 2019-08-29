package com.Blogpost.Dao;

import java.util.ArrayList;
import java.util.List;

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
		List<user> list =  new ArrayList<user>();
		list.add(user);
		System.out.print(list);
		return true;
	}

}
