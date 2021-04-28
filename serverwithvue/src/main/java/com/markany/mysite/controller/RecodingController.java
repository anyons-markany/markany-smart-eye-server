package com.markany.mysite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.markany.mysite.dto.JsonResult;
import com.markany.mysite.service.RecodingService;
import com.markany.mysite.vo.RecodingVo;

@CrossOrigin
@RestController("RecodingApiController")
@RequestMapping("/api/recoding")
public class RecodingController {
	@Autowired
	private RecodingService recodingService;
	
	// 불러오기
	@RequestMapping("/list")
	public JsonResult index(Model model) {
		List<RecodingVo> list = recodingService.getRecodingList();
		return JsonResult.success(list);
	}
	
	// 추가하기
	@PostMapping("/add")
	public JsonResult add(@RequestBody RecodingVo vo) {
		recodingService.add(vo);
		return JsonResult.success(vo);
	}
	
	// 수정하기
	@RequestMapping("/update")
	public JsonResult update(@RequestBody RecodingVo vo) {
		System.out.println(vo.toString());
		recodingService.update(vo);
		return JsonResult.success(vo);
	}
	
	// 삭제하기
	@RequestMapping("/delete")
	public JsonResult delete(@RequestBody RecodingVo vo) {
		recodingService.delete(vo.getId());
		return JsonResult.success(vo);
	}
}
