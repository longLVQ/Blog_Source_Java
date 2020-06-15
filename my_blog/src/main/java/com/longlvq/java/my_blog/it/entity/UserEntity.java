package com.longlvq.java.my_blog.it.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "user" )
@Data
public class UserEntity {
	  @Id
	  @Column(name = "user_id")
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private int userId;

	  @Column(name="user_name")
	  private String userName;
	  
	  @Column(name="pass_word")
	  private String passWord;
}
