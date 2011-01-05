package com.wozeze.pros.demo.service.iface;

import com.wozeze.pros.demo.domain.User;

public interface IUserService {

	public User getUserByUsernameAndPassword(User user);
}
