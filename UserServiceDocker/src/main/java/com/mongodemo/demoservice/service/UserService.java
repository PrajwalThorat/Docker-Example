package com.mongodemo.demoservice.service;

import java.util.List;

import com.mongodemo.demoservice.model.User;

public interface UserService {

	User addNewUser(User user);
	User updUser(User user);
	void delUser(String userId);
	
	List<User> listAllUser();
	
	List<User> listAllUserByAge(int age); 
}
