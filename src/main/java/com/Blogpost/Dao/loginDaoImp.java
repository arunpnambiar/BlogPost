package com.Blogpost.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.Blogpost.POJO.user;

@Repository
public class loginDaoImp implements loginDao {
	List<user> userlist =null;

	loginDaoImp() {
		userlist = new ArrayList<>();
		user insertuser = new user();
		insertuser.setName("admin");
		insertuser.setId(100);
		insertuser.setPassword("1");
		userlist.add(insertuser);
		user insertuser1 = new user();
		insertuser1.setName("john");
		insertuser1.setId(101);
		insertuser1.setPassword("2");
		userlist.add(insertuser1);
		user insertuser2 = new user();
		insertuser2.setName("mary");
		insertuser2.setId(102);
		insertuser2.setPassword("3");
		userlist.add(insertuser2);
	}

	@Override
	public boolean login(user user) {
		System.out.println(userlist.toString());
		if (userlist.stream().filter(x -> x.getName().equalsIgnoreCase(user.getName())
				&& x.getPassword().equalsIgnoreCase(user.getPassword())).count() > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean register(user user) {
		List<user> list = new ArrayList<user>();
		list.add(user);
		System.out.print(list);
		return true;
	}

}
