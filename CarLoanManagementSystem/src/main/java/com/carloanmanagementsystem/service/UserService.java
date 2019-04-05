package com.carloanmanagementsystem.service;

import java.util.List;

import com.carloanmanagementsystem.model.User;


public interface UserService {
	
	List<User> getUsers();
	User findUserById(int id);

}
