package com.wozeze.pros.service.impl.target_catelog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wozeze.pros.dao.target_catelog.TargetCatelogMapper;
import com.wozeze.pros.domain.target_catelog.TargetCatelog;
import com.wozeze.pros.service.iface.target_catelog.ITargetCatelogService;

@Service
public class TargetCatelogServiceImpl implements ITargetCatelogService {
	
	@Autowired
	TargetCatelogMapper targetCatelogMapper;
	
	@Override
	public void addTargetCatelog(TargetCatelog catelog) {
		targetCatelogMapper.insertTargetCatelog(catelog);
	}
}
