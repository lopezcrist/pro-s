package com.wozeze.pros.service.impl.target_catelog;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wozeze.pros.common.Constant;
import com.wozeze.pros.dao.target_catelog.TargetCatelogMapper;
import com.wozeze.pros.domain.QueryParam;
import com.wozeze.pros.domain.ResultObject;
import com.wozeze.pros.domain.target_catelog.TargetCatelog;
import com.wozeze.pros.service.BaseService;
import com.wozeze.pros.service.iface.target_catelog.ITargetCatelogService;

@Service
public class TargetCatelogServiceImpl extends BaseService<TargetCatelog> implements ITargetCatelogService<TargetCatelog> {
	
	@Autowired
	TargetCatelogMapper targetCatelogMapper;
	
	@Override
	public void addTargetCatelog(TargetCatelog catelog) {
		targetCatelogMapper.insertTargetCatelog(catelog);
	}

	@Override
	public ResultObject<TargetCatelog> getTargetCatelogs(QueryParam<TargetCatelog> queryParam) {
		List<TargetCatelog> targetCatelogs = targetCatelogMapper.queryTargetCatelogs(setQueryParamValue(queryParam, Constant.T_TARGET_CATELOG));
		ResultObject<TargetCatelog> resultSet = new ResultObject<TargetCatelog>();
		resultSet.setResults(targetCatelogs);
		resultSet.setPage(queryParam.getPage());
		return resultSet;
	}
	
	@Override
	public void removeTargetCatelog(TargetCatelog catelog){
		targetCatelogMapper.deleteTargetCatelog(catelog);
	}

	@Override
	public TargetCatelog getTargetCatelog(TargetCatelog catelog) {
		return targetCatelogMapper.queryTargetCatelogById(catelog);
	}
}
