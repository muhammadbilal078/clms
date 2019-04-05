package com.carloanmanagementsystem.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.carloanmanagementsystem.dao.UserRepo;
import com.carloanmanagementsystem.model.User;
import com.carloanmanagementsystem.service.UserService;

@Component(value = "userDetailService")
public class UserServiceImpl implements UserDetailsService, UserService{
	
	@Autowired
	private UserRepo userDao;

	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		com.carloanmanagementsystem.model.User user = userDao.findUserByEmail(email);
		if(user == null){
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(String.valueOf(user.getId()), user.getPassword(), getAuthority(email));
	}

	private List<SimpleGrantedAuthority> getAuthority(String email) {
		
		com.carloanmanagementsystem.model.User user = userDao.findUserByEmail(email);
		String role = "ROLE_USER";
		if(user.getType() == "Admin"){
			role = "Admin";
		}
		else if (user.getType() == "Manager") {
			role = "Manager";
		}
		else if(user.getType() == "Car Dealer") {
			role = "Car Dealer";
		}
		return Arrays.asList(new SimpleGrantedAuthority(role));
	}

	public List<com.carloanmanagementsystem.model.User> getUsers() {
		return userDao.getUserDetails();
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		com.carloanmanagementsystem.model.User user = userDao.findUserById(id);
		if (user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return user;
	}

}
