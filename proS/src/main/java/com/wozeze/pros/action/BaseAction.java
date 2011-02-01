package com.wozeze.pros.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wozeze.pros.common.Constant;
import com.wozeze.pros.common.Page;

public abstract class BaseAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	protected Page page;
	
	protected void setSuccuessMsg(String msg){
		ActionContext.getContext().put(Constant.SUCCESS_CONTENT, msg);
	}
	
	protected void setPageResult(Object obj){
		ActionContext.getContext().put(Constant.PAGE_RESULT, obj);
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}
}
