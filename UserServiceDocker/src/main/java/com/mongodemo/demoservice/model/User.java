package com.mongodemo.demoservice.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class User {
	
	@Id
	private String userId;
	private String userName;
	private int userAge;
	private List<String> hobbies;
	
	
	public User(String userId, String userName, ArrayList<String> hobbies, int userAge) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.hobbies = hobbies;
		this.userAge = userAge;
	}
	public User() {
		super();
	
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", hobbies=" + hobbies
				+ "]";
	}
	
	
	
	
	
}
