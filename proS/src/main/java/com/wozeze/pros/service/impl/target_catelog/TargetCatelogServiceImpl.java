package com.wozeze.pros.service.impl.target_catelog;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wozeze.pros.common.Constant;
import com.wozeze.pros.common.TypeValue;
import com.wozeze.pros.dao.target_catelog.TargetCatelogMapper;
import com.wozeze.pros.domain.target_catelog.TargetCatelog;
import com.wozeze.pros.service.BaseService;
import com.wozeze.pros.service.iface.target_catelog.ITargetCatelogService;

@Service
public class TargetCatelogServiceImpl extends BaseService implements ITargetCatelogService {
	
	@Autowired
	TargetCatelogMapper targetCatelogMapper;
	
	@Override
	public void addTargetCatelog(TargetCatelog catelog) {
		targetCatelogMapper.insertTargetCatelog(catelog);
	}

	@Override
	public List<TargetCatelog> getTargetCatelogs(TargetCatelog catelog) {
		return targetCatelogMapper.queryTargetCatelogs(catelog);
	}
	
	@Override
	public void removeTargetCatelog(TargetCatelog catelog){
		targetCatelogMapper.deleteTargetCatelog(catelog);
	}
	
	@Override
	public int getTargetCatelogTotalCount(){
		return getTotalCount(new TypeValue("tableName", Constant.T_TARGET_CATELOG));
	}
}
