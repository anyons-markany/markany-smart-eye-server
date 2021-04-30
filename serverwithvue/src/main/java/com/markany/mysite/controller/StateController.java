package com.markany.mysite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.markany.mysite.dto.JsonResult;
import com.markany.mysite.service.StateService;
import com.markany.mysite.vo.UserVo;

@CrossOrigin
@RestController("StateApiController")
@RequestMapping("/api/state")
public class StateController {
	
	
	@Autowired
	private StateService stateService;
	
	@PostMapping("/login")
	public JsonResult login(@RequestBody UserVo vo) {
		System.out.println("컨트롤러" + vo);
		
		//조회된 쿼리
		UserVo uservo = stateService.loginUser(vo);
		System.out.println("조회된 컨트롤러" + uservo);

		return JsonResult.success(uservo);		
	};
	
}