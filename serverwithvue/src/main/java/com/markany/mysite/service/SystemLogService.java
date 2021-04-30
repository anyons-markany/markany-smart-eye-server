package com.markany.mysite.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markany.mysite.repository.SystemLogRepository;
import com.markany.mysite.vo.SystemLogVo;

@Service
public class SystemLogService {
	private static final Log LOGGER = LogFactory.getLog(SystemLogService.class);
	
	@Autowired
	private SystemLogRepository systemLogRepository;

	public List<SystemLogVo> getSearchList(SystemLogVo vo) {
		
		return systemLogRepository.findByDate(vo);
	}
}
