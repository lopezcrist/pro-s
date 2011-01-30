package com.wozeze.pros.service.iface.target;

import com.wozeze.pros.domain.target.Target;

public interface ITargetService<T> {

	/**
	 * add a target
	 * @param target
	 */
	public void addTarget(Target target);
	
}
