package com.longlvq.java.my_blog.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.longlvq.java.my_blog.it.entity.UserEntity;
import com.longlvq.java.my_blog.it.service.UserService;

@RestController
public class IndexController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/",method = RequestMethod.GET) 
	public ResponseEntity<UserEntity> index() {
		return new ResponseEntity<UserEntity>(userService.getUserById(1), HttpStatus.OK);
	}
}
