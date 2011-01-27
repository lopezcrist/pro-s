package com.wozeze.pros.action.system;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wozeze.pros.domain.system.User;
import com.wozeze.pros.service.iface.system.IUserService;

public class UserAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	
	@Resource
	IUserService userService;
	
	public String toIndexPage() {
		return "index";
	}
	
	/**
	 * 跳转到注册页面
	 * @return
	 * @throws Exception
	 */
	public String toRegisterPage() {
		return "registerPage";
	}
	
	/**
	 * 用户注册
	 * @return
	 * @throws Exception
	 */
	public String register() {
		userService.addUser(user);
		return "register_success";
	}
	
	/**
	 * 用户登陆
	 * @return
	 * @throws Exception
	 */
	public String login() {
		User user1 = userService.getUserByUsernameAndPassword(user);
		if(user1!=null){
			ActionContext.getContext().getSession().put("user", user1.getName());
			return "login_success";
		}else{
			this.addFieldError("user.name", "用户名或密码错误");
			return "login_failure";
		}
	}
	
	public String logout(){
		ActionContext.getContext().getSession().remove("user");
		return "logout_success";
	}

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}