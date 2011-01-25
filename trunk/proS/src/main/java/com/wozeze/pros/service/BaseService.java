package com.wozeze.pros.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.wozeze.pros.common.TypeValue;
import com.wozeze.pros.dao.common.CommonMapper;

public abstract class BaseService {

	@Autowired
	CommonMapper commonMapper;
	
	public int getTotalCount(TypeValue typeValue){
		return commonMapper.getTotalCount(typeValue);
	}
}
