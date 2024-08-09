package com.spring.mvc.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.mvc.entity.User;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int save(User user)
	{
		int i = (Integer)hibernateTemplate.save(user);
		return i;
	}
}
