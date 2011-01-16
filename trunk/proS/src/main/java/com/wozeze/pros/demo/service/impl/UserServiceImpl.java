package com.wozeze.pros.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.wozeze.pros.demo.dao.UserMapper;
import com.wozeze.pros.demo.domain.User;
import com.wozeze.pros.demo.service.iface.IUserService;

public class UserServiceImpl implements IUserService {
	
	@Autowired
	UserMapper userMapper;

	@Override
	public User getUserByUsernameAndPassword(User user) {
		return userMapper.queryUserByUserNameAndPassword(user);
	}

	@Override
	public void addUser(User user) {
		userMapper.insertUser(user);
	}

}