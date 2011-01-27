package com.wozeze.pros.service.iface.target_catelog;

import com.wozeze.pros.domain.QueryParam;
import com.wozeze.pros.domain.ResultObject;
import com.wozeze.pros.domain.target_catelog.TargetCatelog;

public interface ITargetCatelogService<T> {

	public void addTargetCatelog(TargetCatelog catelog);
	
	public ResultObject<TargetCatelog> getTargetCatelogs(QueryParam<T> queryParam);
	
	public void removeTargetCatelog(TargetCatelog catelog);
	
	public TargetCatelog getTargetCatelog(TargetCatelog catelog);
	
}
