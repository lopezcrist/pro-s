package com.wozeze.pros.dao.target;

import com.wozeze.pros.domain.target.Target;

public interface TargetMapper {

	/**
	 * add a target
	 * @param target
	 */
	public void insertTargetCatelog(Target target);
	
	/**
	 * add a target and targetCatelog's relationship
	 * @param target
	 */
	public void insertTargetRelationTargetCatelog(Target target);
	
}
