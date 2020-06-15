package com.longlvq.java.my_blog.it.repository;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

import com.longlvq.java.my_blog.it.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

  List<UserEntity> findByUserName(String userName);

  UserEntity findByUserId(int id);
  
}