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
	
	/**
	 * query target by id
	 * @param target
	 * @return
	 */
	public Target queryTargetById(Target target);
	
	/**
	 * update a target
	 * @param target
	 */
	public void updateTarget(Target target);
	
	/**
	 * remove the relationship between target and targetCatelog
	 * @param target
	 */
	public void deleteTargetRelationTargetCatelog(Target target);
	
	/**
	 * remove the target
	 * @param target
	 */
	public void deleteTarget(Target target);
	
}
