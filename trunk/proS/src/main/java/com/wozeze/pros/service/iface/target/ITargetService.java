package com.wozeze.pros.service.iface.target;

import java.util.List;
import com.wozeze.pros.domain.QueryParam;
import com.wozeze.pros.domain.ResultObject;
import com.wozeze.pros.domain.target.Target;
import com.wozeze.pros.domain.target_catelog.TargetCatelog;

public interface ITargetService<T> {

	/**
	 * add a target
	 * @param target
	 */
	public void addTarget(Target target);
	
	/**
	 * get all targetCatelogs
	 * @return
	 */
	public List<TargetCatelog> getTargetCatelogs(QueryParam<TargetCatelog> queryParam);
	
	/**
	 * find targets
	 * @param queryParam
	 * @return
	 */
	public ResultObject<Target> getTargets(QueryParam<T> queryParam);
}
