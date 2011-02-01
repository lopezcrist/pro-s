package com.wozeze.pros.service.iface.target_catelog;

import com.wozeze.pros.common.Pagination;
import com.wozeze.pros.domain.target_catelog.TargetCatelog;

public interface ITargetCatelogService<T> {

	public void addTargetCatelog(TargetCatelog catelog);
	
	public void removeTargetCatelog(TargetCatelog catelog);
	
	public TargetCatelog findTargetCatelog(TargetCatelog catelog);
	
	public void modifyTargetCatelog(TargetCatelog catelog);
	
	public Pagination<TargetCatelog> findTargetCatelogPagination(Pagination<TargetCatelog> pagination);
	
}
