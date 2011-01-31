package com.wozeze.pros.service;

import javax.annotation.Resource;

import com.wozeze.pros.common.Page;
import com.wozeze.pros.common.PageUtil;
import com.wozeze.pros.domain.QueryParam;
import com.wozeze.pros.service.iface.common.ICommonService;


public abstract class BaseService<T> {
	
	@Resource
	ICommonService commonService;

	protected QueryParam<T> setQueryParamValue(QueryParam<T> queryParam, String tableName){
		Page page = queryParam.getPage();
		if(page == null){
			// from the menu link to this action method
			int totalRows = commonService.getTargetTotalRows(tableName);
			page = new Page(totalRows);
		}else{
			// from the page bottom pagination link to this action method 
			page = PageUtil.getPager(page.getCurrentPage(), page.getNavigationPage(), page.getTotalRows());
		}
		
		return queryParam.setPage(page);
	}
}
