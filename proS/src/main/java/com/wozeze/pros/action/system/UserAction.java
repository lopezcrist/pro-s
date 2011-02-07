package com.wozeze.pros.action.system;

import javax.annotation.Resource;
import com.opensymphony.xwork2.ActionContext;
import com.wozeze.pros.common.Message;
import com.wozeze.pros.action.BaseAction;
import com.wozeze.pros.common.Constant;
import com.wozeze.pros.domain.system.User;
import com.wozeze.pros.service.iface.system.IUserService;

public class UserAction extends BaseAction<User>{
	
	private static final long serialVersionUID = 1L;
	
	@Resource
	IUserService userService;
	
	private User user;
	
	public String toIndexPage() {
		return Constant.INDEX;
	}
	
	/**
	 * 跳转到注册页面
	 * @return
	 * @throws Exception
	 */
	public String toRegisterPage() {
		return Constant.REGISTER_PAGE;
	}
	
	/**
	 * 用户注册
	 * @return
	 * @throws Exception
	 */
	public String register() {
		userService.addUser(user);
		setSuccuessMsg(getText(Message.REGISTER_USER_SUCCESS));
		return Constant.REGISTER_SUCCESS;
	}
	
	/**
	 * 用户登陆
	 * @return
	 * @throws Exception
	 */
	public String login() {
		User userExists = userService.getUserByUsernameAndPassword(user);
		if(userExists != null){
			ActionContext.getContext().getSession().put(Constant.USER, userExists);
			return Constant.LOGIN_SUCCESS;
		}else{
			this.addFieldError(Constant.USER_NAME, getText(Message.USER_NAME_PASSWORD_WRONG));
			return Constant.LOGIN_FAILURE;
		}
	}
	
	public String logout(){
		ActionContext.getContext().getSession().remove(Constant.USER);
		return Constant.LOGOUT_SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}