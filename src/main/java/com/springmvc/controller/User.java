package com.springmvc.controller;

import java.util.concurrent.atomic.AtomicLong;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
public class User {
	//做一个修改
	private static final AtomicLong idSequence = new AtomicLong();
	private Long id;
	 
	 @NotEmpty
	 private String userName;
	 @NotEmpty
	 @Size(min=6,max=16)
	 private String password;
	 
	 private boolean sex;
	 private int age;
	 @Email
	 private String email;
	 Long assignId() {
	 this.id = idSequence.incrementAndGet();
	 return id;
	 }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
