package com.wozeze.pros.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.wozeze.pros.common.Page;
import com.wozeze.pros.service.iface.common.ICommonService;

public abstract class BaseAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	@Resource
	ICommonService commonService;

	protected Page page;

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}
}
