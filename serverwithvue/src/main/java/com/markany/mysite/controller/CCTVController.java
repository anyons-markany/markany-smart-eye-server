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
import com.markany.mysite.vo.CCTVGroupVo;
import com.markany.mysite.vo.CCTVVo;

@CrossOrigin
@RestController("CCTVApiController")
@RequestMapping("/api/cctv")
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
		cctvService.update(vo);
		return JsonResult.success(vo);
	}
	
	// 삭제하기
	@RequestMapping("/delete")
	public JsonResult delete(@RequestBody CCTVVo vo) {
		cctvService.delete(vo.getId());
		return JsonResult.success(vo);
	}
	
	// 집중 관제 목록
	@RequestMapping("/cent_con")
	public JsonResult cent_con(Model model) {
		List<CCTVGroupVo> list = cctvService.getCentConList();
		return JsonResult.success(list);
	}
	
	// 집중 관제 추가 리스트
	@RequestMapping("/cent_con_add")
	public JsonResult cent_con_add(Model model) {
		List<CCTVGroupVo> list = cctvService.getCentConAddList();
		return JsonResult.success(list);
	}
	
	// 집중 관제 수정
	@RequestMapping("/cent_con_update")
	public JsonResult cent_con_update(@RequestBody CCTVVo vo) {
		cctvService.cent_con_update(vo);
		return JsonResult.success(vo);
	}
	// 집중 관제 삭제 
}