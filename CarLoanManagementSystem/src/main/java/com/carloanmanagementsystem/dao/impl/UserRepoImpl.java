package com.carloanmanagementsystem.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.carloanmanagementsystem.dao.UserRepo;
import com.carloanmanagementsystem.model.User;

@Component
public class UserRepoImpl implements UserRepo {

	@Autowired
	private SessionFactory sessionFactory;

	public List<User> getUserDetails() {
		Criteria criteria = sessionFactory.openSession().createCriteria(User.class);
		return criteria.list();
	}

	public User findUserByEmail(String email) {
		User userDetails = null;
		Criteria criteria = sessionFactory.openSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("email", email));
		List<User> entityList = criteria.list();
		if(!entityList.isEmpty()) {
			userDetails = entityList.get(0);
		}
		return userDetails;
	}

	public User findUserById(int id) {
		// TODO Auto-generated method stub
		User userDetails = null;
		Criteria criteria = sessionFactory.openSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("id", id));
		List<User> entityList = criteria.list();
		if(!entityList.isEmpty()) {
			userDetails = entityList.get(0);
		}
		return userDetails;
		//return null;
	}

}
