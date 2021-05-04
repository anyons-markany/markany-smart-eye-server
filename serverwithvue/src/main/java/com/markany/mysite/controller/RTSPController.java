package com.markany.mysite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.markany.mysite.dto.JsonResult;
import com.markany.mysite.service.RTSPService;
import com.markany.mysite.vo.RTSPVo;

@CrossOrigin
@RestController("RtspApiController")
public class RTSPController {
	@Autowired
	private RTSPService rtspService;
	
	@GetMapping("/api/rtsp_infos/rtsp_list")
	public JsonResult index() {
		System.out.println("컨트롤러 진입");
		List<RTSPVo> list = rtspService.getRtspList();
		return JsonResult.success(list);
	}
	
	@PostMapping("/api/rtsp_infos/rtsp_list")
	public JsonResult setRTSP(@RequestBody RTSPVo vo) {
		RTSPVo rtspVo = rtspService.setRtsp(vo);
		System.out.println(rtspVo);
		return JsonResult.success(rtspVo);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@DeleteMapping("/api/rtsp_infos/rtsp_list/{id}")
	public JsonResult delRTSP(@PathVariable Long id) {
		System.out.println("id: " + id);
		Long no = rtspService.delRtsp(id);
		return no == 1 ? JsonResult.success(no) : JsonResult.fail("삭제 실패");
	}
	
	
	@PutMapping("/api/rtsp_infos/rtsp_list/{id}")
	public JsonResult putRTSP(@PathVariable Long id) {
		Long no = rtspService.updateRtsp(id);
		
		return no == 1 ? JsonResult.success(no) : JsonResult.fail("수정 실패");
		
	}
	
	
}


