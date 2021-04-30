package com.markany.mysite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.markany.mysite.dto.JsonResult;
import com.markany.mysite.service.SystemLogService;
import com.markany.mysite.vo.SystemLogVo;

@CrossOrigin
@RestController("SystemLogApiController")
@RequestMapping("/api/systemlog")
public class SystemLogController {
	
	@Autowired
	private SystemLogService systemLogService;
	
	@RequestMapping("/search" )
	public JsonResult search(@RequestBody SystemLogVo vo) {
		System.out.println(vo);
		List<SystemLogVo> list = systemLogService.getSearchList(vo);
		System.out.println(list);
		return JsonResult.success(list);
	}
}