package com.wozeze.webapp.demo.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.wozeze.webapp.demo.dao.UserBo;
 
public class UserAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	//DI via Spring
	@Resource
	UserBo userBo;
	
	public String execute() throws Exception {
		
		/*WebApplicationContext context =
			WebApplicationContextUtils.getRequiredWebApplicationContext(ServletActionContext.getServletContext());
		
		UserBo userBo1 = (UserBo)context.getBean("userBo");
		userBo1.printUser();*/
		
		userBo.printUser();
		
		return SUCCESS;
		
	}
}