package com.wozeze.pros.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.wozeze.pros.common.Constant;
import com.wozeze.pros.common.Page;
import com.wozeze.pros.common.PageUtil;
import com.wozeze.pros.common.TypeValue;
import com.wozeze.pros.domain.BaseDomain;
import com.wozeze.pros.service.iface.common.ICommonService;

public abstract class BaseAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	@Resource
	ICommonService commonService;

	protected Page page;

	protected String actionUrl;

	protected void setPageValue(BaseDomain baseDomain, String tableName){
		if(page == null){
			// from the menu link to this action method
			int totalRows = commonService.getTargetTotalRows(new TypeValue(Constant.TABLE_NAME, tableName));
			page = new Page(totalRows);
			
		}else{
			// from the page bottom pagination link to this action method 
			page = PageUtil.getPager(page.getCurrentPage(), page.getNavigationPage(), page.getTotalRows());
		}
		setPage(page);
		baseDomain.setPage(page);
	}
	
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
