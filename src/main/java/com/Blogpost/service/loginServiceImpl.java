package com.Blogpost.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Blogpost.Dao.loginDao;
import com.Blogpost.POJO.user;

@Service
public class loginServiceImpl implements loginService {

	@Autowired
	loginDao dao;
	
	@Override
	public boolean login(user user) {
		return dao.login(user);
	}

	@Override
	public boolean register(user user) {
		return dao.register(user);
	}

}
