package com.wozeze.pros.service.impl.target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.wozeze.pros.dao.target.TargetMapper;
import com.wozeze.pros.domain.target.Target;
import com.wozeze.pros.service.BaseService;
import com.wozeze.pros.service.iface.target.ITargetService;

@Service
public class TargetServiceImpl extends BaseService<Target> implements ITargetService<Target>{

	@Autowired
	TargetMapper targetMapper;
	
	@Override
	@Transactional
	public void addTarget(Target target) {
		targetMapper.insertTargetCatelog(target);
		targetMapper.insertTargetRelationTargetCatelog(target);
	}

}
