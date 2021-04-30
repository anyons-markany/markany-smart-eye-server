package com.markany.mysite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markany.mysite.repository.CCTVRepository;
import com.markany.mysite.vo.CCTVVo;

@Service
public class CCTVService {
	
	@Autowired
	private CCTVRepository cctvRepository;

	public List<CCTVVo> getCCTVList() {
		return cctvRepository.findAll();
	}
	
	public void add(CCTVVo vo) {
		cctvRepository.add(vo);
	}

	public boolean update(CCTVVo vo) {
		System.out.println(vo.toString());
		int count = cctvRepository.update(vo);
		return count == 1;
	}

	public boolean delete(Long id) {
		int count = cctvRepository.delete(id);
		return count > 0;
	}
}
