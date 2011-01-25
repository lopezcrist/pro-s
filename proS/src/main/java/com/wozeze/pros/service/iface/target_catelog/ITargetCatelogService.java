package com.wozeze.pros.service.iface.target_catelog;

import java.util.List;

import com.wozeze.pros.common.Page;
import com.wozeze.pros.domain.target_catelog.TargetCatelog;

public interface ITargetCatelogService {

	public void addTargetCatelog(TargetCatelog catelog);
	
	public List<TargetCatelog> getTargetCatelogs(TargetCatelog catelog, Page page);
	
	public int getTargetCatelogTotalCount();
}
