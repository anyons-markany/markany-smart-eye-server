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
import com.markany.mysite.service.CCTVGroupService;
import com.markany.mysite.vo.CCTVGroupVo;
import com.markany.mysite.vo.CCTVVo;

@CrossOrigin
@RestController("CCTVGroupApiController")
@RequestMapping("/api/cctvgroup")
public class CCTVGroupController {
	@Autowired
	private CCTVGroupService cctvgroupService;
	
	@RequestMapping("/list")
	public JsonResult index(Model model) {
		List<CCTVGroupVo> list = cctvgroupService.getCCTVGroupList();
		return JsonResult.success(list);
	}
	
	@RequestMapping("/listingroup")
	public JsonResult listingroup(Model model, @RequestBody CCTVGroupVo vo) {
		List<CCTVVo> list = cctvgroupService.getCCTVListInGroup(vo.getId());
		return JsonResult.success(list);
	}
	
	// 추가하기
	@PostMapping("/add")
	public JsonResult add(@RequestBody CCTVGroupVo vo) {
		cctvgroupService.add(vo);
		return JsonResult.success(vo);
	}
	
	// 수정하기
	@RequestMapping("/update")
	public JsonResult update(@RequestBody CCTVGroupVo vo) {
		System.out.println(vo.toString());
		cctvgroupService.update(vo);
		return JsonResult.success(vo);
	}	
	
	// 삭제하기
	@RequestMapping("/delete")
	public JsonResult delete(@RequestBody CCTVGroupVo vo) {
		cctvgroupService.delete(vo.getId());
		return JsonResult.success(vo);
	}
}
