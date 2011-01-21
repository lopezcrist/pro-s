package com.wozeze.pros.service.iface.system;

import com.wozeze.pros.domain.system.User;


public interface IUserService {

	public void addUser(User user);
	
	public User getUserByUsernameAndPassword(User user);

}
