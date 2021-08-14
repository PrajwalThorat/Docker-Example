package com.mongodemo.demoservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodemo.demoservice.model.User;


public interface UserRepo extends MongoRepository<User, String> {
 
	 List<User> findByUserAge(int age); 
}
