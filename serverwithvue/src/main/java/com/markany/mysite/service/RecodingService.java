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

	public void add(RecodingVo vo) {
		recodingRepository.insertRecodingInfo(vo);
	}
}
