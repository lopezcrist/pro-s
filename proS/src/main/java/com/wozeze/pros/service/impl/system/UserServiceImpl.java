package com.wozeze.pros.service.impl.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wozeze.pros.dao.system.UserMapper;
import com.wozeze.pros.domain.system.User;
import com.wozeze.pros.service.iface.system.IUserService;

@Service
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
