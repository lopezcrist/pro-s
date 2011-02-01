package com.wozeze.pros.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wozeze.pros.common.Constant;
import com.wozeze.pros.common.Pagination;
import com.wozeze.pros.domain.system.User;

public abstract class BaseAction<T> extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	protected Pagination<T> pagination = new Pagination<T>();
	
	protected void setSuccuessMsg(String msg){
		ActionContext.getContext().put(Constant.SUCCESS_CONTENT, msg);
	}
	
	protected void setPageResult(Object obj){
		ActionContext.getContext().put(Constant.PAGE_RESULT, obj);
	}
	
	protected void setFailureMsg(String msg){
		ActionContext.getContext().put(Constant.FAILURE_CONTENT, msg);
	}
	
	/**
	 * get userId from session User object
	 * @return
	 */
	protected User getUser(){
		return (User) ActionContext.getContext().getSession().get("user");
	}
	
	public Pagination<T> getPagination() {
		return pagination;
	}

	public void setPagination(Pagination<T> pagination) {
		this.pagination = pagination;
	}
}
