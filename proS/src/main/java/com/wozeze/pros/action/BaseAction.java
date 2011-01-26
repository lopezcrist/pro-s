package com.wozeze.pros.action;

import com.opensymphony.xwork2.ActionSupport;
import com.wozeze.pros.common.Page;

public abstract class BaseAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	protected Page page;

	protected String actionUrl;

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public String getActionUrl() {
		return actionUrl;
	}

	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

}
