package com.carloanmanagementsystem.dao;

import java.util.List;

import com.carloanmanagementsystem.model.User;


public interface UserRepo {
	
	List<User> getUserDetails();
	User findUserByEmail(String email);
	User findUserById(int id);
	//User findUserById(int id);

}
