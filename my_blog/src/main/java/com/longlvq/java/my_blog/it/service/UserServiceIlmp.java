package com.longlvq.java.my_blog.it.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.longlvq.java.my_blog.it.entity.UserEntity;
import com.longlvq.java.my_blog.it.repository.UserRepository;

@Service
public class UserServiceIlmp implements UserService {

	@Autowired
	UserRepository userRepository;
	@Override
	public UserEntity getUserById(int userId) {
		UserEntity userEntity = userRepository.findByUserId(userId);
		return userEntity; 
	}

}
