package com.wozeze.pros.service;

import javax.annotation.Resource;
import com.wozeze.pros.common.Pagination;
import com.wozeze.pros.service.iface.common.ICommonService;

public abstract class BaseService<T> {
	
	@Resource
	ICommonService commonService;
	
	protected int getTotalRows(String tableName){
		return commonService.getTargetTotalRows(tableName);
	}

	protected Pagination<T> setPagination(Pagination<T> pagination, String tableName){
		if(pagination.getCurrentPage() == 0){
			pagination = new Pagination<T>(getTotalRows(tableName),pagination.getParamObject(), pagination.isAll());
		}else{
			pagination = new Pagination<T>(pagination.getTotalRows(),pagination.getCurrentPage(),pagination.getParamObject(), pagination.isAll());
		}
		return pagination;
	}
	
}
