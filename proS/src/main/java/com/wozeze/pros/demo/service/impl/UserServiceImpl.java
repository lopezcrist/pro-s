package com.wozeze.pros.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wozeze.pros.demo.dao.UserMapper;
import com.wozeze.pros.demo.domain.User;
import com.wozeze.pros.demo.service.iface.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	UserMapper userMapper;

	@Override
	public User getUserByUsernameAndPassword(User user) {
		return userMapper.getUserByUserNameAndPassword(user.getUsername());
	}

}
