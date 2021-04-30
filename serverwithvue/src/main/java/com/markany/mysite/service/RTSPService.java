package com.markany.mysite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markany.mysite.repository.RTSPRepository;
import com.markany.mysite.vo.RTSPVo;

@Service
public class RTSPService {
	
	@Autowired
	private RTSPRepository rtspRepository;
	
	public List<RTSPVo> getRtspList() {
		System.out.println("서비스 진입");
		return rtspRepository.findAll();
	}
	
	public RTSPVo setRtsp(RTSPVo vo) {
		Long id = (long)rtspRepository.insert(vo);
		return rtspRepository.findById(id);
	}

	public Long delRtsp(Long id) {
		return (long)rtspRepository.delete(id);
		
	}

	public Long updateRtsp(Long id) {
		
		return (long)rtspRepository.update(id);
	}
	
	/*
	 * 
	public RTSPVo getRtspById(Long id) {
		return rtspRepository.findById(id);
	}
	
	public RTSPVo getRtspByManufacturer(String manufacturer) {
		return rtspRepository.findByManufacturer(manufacturer);
	}
	
	public RTSPVo getRtspByModel(String model) {
		return rtspRepository.findByModel(model);
	}
	
	public RTSPVo getRtspByPaths(String paths) {
		return rtspRepository.findByPaths(paths);
	}
	
	*/
	
	
	
}


