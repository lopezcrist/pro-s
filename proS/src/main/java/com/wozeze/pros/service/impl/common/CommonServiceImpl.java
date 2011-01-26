package com.wozeze.pros.service.impl.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wozeze.pros.common.TypeValue;
import com.wozeze.pros.dao.common.CommonMapper;
import com.wozeze.pros.service.iface.common.ICommonService;

@Service
public class CommonServiceImpl implements ICommonService {
	
	@Autowired
	CommonMapper commonMapper;

	@Override
	public int getTargetTotalRows(TypeValue typeValue) {
		return commonMapper.getTotalCount(typeValue);
	}

}
