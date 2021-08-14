package com.mongodemo.demoservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.mongodemo.demoservice.model.User;
import com.mongodemo.demoservice.repository.UserRepo;

@Service
@CacheConfig(cacheNames={"userCache"})
public class UserServiceImpl implements UserService {

	private UserRepo userRepo;

	@Autowired
	public UserServiceImpl(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@Override
	public User addNewUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@CachePut(cacheNames="cacheUser")
	@Override
	public User updUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}


	@CacheEvict(allEntries=true)
	@Override
	public void delUser(String userId) {
		// TODO Auto-generated method stub
		if (userRepo.findById(userId).isPresent()) {
			userRepo.deleteById(userId);
		}
	}

	@Cacheable()
	@Override
	public List<User> listAllUser() {

		System.out.println("List of user is called");
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	
	  @Override
	 // @Cacheable(value="userCache", key="#age")
	  @Cacheable(value="userCache", condition="#age>10")
	  public List<User> listAllUserByAge(int age)
	  { // TODO
		  System.out.println("age called");
	  return userRepo.findByUserAge(age); }
	 

}
