package com.markany.mysite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	// 추가하기
	@PostMapping("/add")
	public JsonResult add(@RequestBody CCTVVo vo) {
		cctvService.add(vo);
		return JsonResult.success(vo);
	}
	
	// 수정하기
	@RequestMapping("/update")
	public JsonResult update(@RequestBody CCTVVo vo) {
		System.out.println(vo.toString());
		cctvService.update(vo);
		return JsonResult.success(vo);
	}
	
	// 삭제하기
	@RequestMapping("/delete")
	public JsonResult delete(@RequestBody CCTVVo vo) {
		cctvService.delete(vo.getId());
		return JsonResult.success(vo);
	}
}