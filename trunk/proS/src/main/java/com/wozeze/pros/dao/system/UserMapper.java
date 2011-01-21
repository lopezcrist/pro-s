package com.wozeze.pros.dao.system;

import com.wozeze.pros.domain.system.User;


public interface UserMapper {

	public User queryUserByUserNameAndPassword(User user);
	
	public void insertUser(User user);
	
}
