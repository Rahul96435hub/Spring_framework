package com.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.dao.UserDao;
import com.spring.mvc.entity.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public int saveUser(User user) {
		
	int i =	userDao.save(user);
		
		return i;
	}
	
	
	

}
