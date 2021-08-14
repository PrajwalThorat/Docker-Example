package com.mongodemo.demoservice.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodemo.demoservice.model.User;
import com.mongodemo.demoservice.service.UserService;

@RestController
@RequestMapping("/api/v1/userservice")
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	  @GetMapping("/{age}") public ResponseEntity<?> listByage(@PathVariable int
	  age) {
	  
	  return new ResponseEntity<>(userService.listAllUserByAge(age),
	  HttpStatus.OK); }
	 
	
	@GetMapping("/user")
    public ResponseEntity<?> listAllUser() {
      
        return new ResponseEntity<>(userService.listAllUser(), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<?> save(@RequestBody User user) {
    	        return new ResponseEntity<>(userService.addNewUser(user), HttpStatus.CREATED);
    }


    @PutMapping
    public ResponseEntity<?> update(@RequestBody User user) {
    	  return new ResponseEntity<>(userService.updUser(user), HttpStatus.CREATED);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
    	userService.delUser(id);
        return ResponseEntity.ok().body("Deleted successfully...!");
    }
}
