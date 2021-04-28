package com.markany.mysite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markany.mysite.repository.RecodingRepository;
import com.markany.mysite.vo.RecodingVo;


@Service
public class RecodingService {
		
	@Autowired
	private RecodingRepository recodingRepository;

	public List<RecodingVo> getRecodingList() {
		return recodingRepository.findAll();
	}
	
	public List<RecodingVo> getRecodingById(Long startNo) {
		return recodingRepository.findById(startNo);
	}

	public void add(RecodingVo vo) {
		recodingRepository.insertRecodingInfo(vo);
	}

	public boolean update(RecodingVo vo) {
		int count = recodingRepository.update(vo);
		return count == 1;
	}

	public boolean delete(Long id) {
		int count = recodingRepository.delete(id);
		return count > 0;
	}
}
