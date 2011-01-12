package com.wozeze.pros.demo.dao;

import com.wozeze.pros.demo.domain.User;

public interface UserMapper {

	public User queryUserByUserNameAndPassword(User user);
	
	public void insertUser(User user);
	
}
