package com.wozeze.pros.service.impl.target;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wozeze.pros.common.Constant;
import com.wozeze.pros.dao.target.TargetMapper;
import com.wozeze.pros.dao.target_catelog.TargetCatelogMapper;
import com.wozeze.pros.domain.QueryParam;
import com.wozeze.pros.domain.ResultObject;
import com.wozeze.pros.domain.target.Target;
import com.wozeze.pros.domain.target_catelog.TargetCatelog;
import com.wozeze.pros.service.BaseService;
import com.wozeze.pros.service.iface.target.ITargetService;

@Service
public class TargetServiceImpl extends BaseService<Target> implements ITargetService<Target>{

	@Autowired
	TargetMapper targetMapper;
	
	@Autowired
	TargetCatelogMapper targetCatelogMapper;
	
	@Override
	@Transactional
	public void addTarget(Target target) {
		targetMapper.insertTarget(target);
		targetMapper.insertTargetRelationTargetCatelog(target);
	}

	/**
	 * get all targetCatelogs
	 * @return
	 */
	@Override
	public List<TargetCatelog> getTargetCatelogs(QueryParam<TargetCatelog> queryParam) {
		return targetCatelogMapper.queryTargetCatelogs(queryParam);
	}

	/**
	 * find targets
	 */
	@Override
	public ResultObject<Target> getTargets(QueryParam<Target> queryParam) {
		List<Target> targets = targetMapper.queryTargets(setQueryParamValue(queryParam, Constant.T_TARGET));
		ResultObject<Target> resultSet = new ResultObject<Target>();
		resultSet.setResults(targets);
		resultSet.setPage(queryParam.getPage());
		return resultSet;
	}

}
