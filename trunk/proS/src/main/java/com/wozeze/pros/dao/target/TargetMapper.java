package com.wozeze.pros.dao.target;

import java.util.List;

import com.wozeze.pros.domain.QueryParam;
import com.wozeze.pros.domain.target.Target;

public interface TargetMapper {

	/**
	 * add a target
	 * @param target
	 */
	public void insertTarget(Target target);
	
	/**
	 * query targets
	 * @param queryParam
	 * @return
	 */
	public List<Target> queryTargets(QueryParam<Target> queryParam);
	
	/**
	 * add a target and targetCatelog's relationship
	 * @param target
	 */
	public void insertTargetRelationTargetCatelog(Target target);
	
}
