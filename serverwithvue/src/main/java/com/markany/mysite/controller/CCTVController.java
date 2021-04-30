package com.markany.mysite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.markany.mysite.dto.JsonResult;
import com.markany.mysite.service.CCTVService;
import com.markany.mysite.vo.CCTVVo;

@CrossOrigin
@RestController("CCTVApiController")
@RequestMapping("/api/cctvgroup")
public class CCTVController {	
	@Autowired
	private CCTVService cctvService;
	
	@RequestMapping("/list")
	public JsonResult index(Model model) {
		List<CCTVVo> list = cctvService.getCCTVList();
		return JsonResult.success(list);
	}
}