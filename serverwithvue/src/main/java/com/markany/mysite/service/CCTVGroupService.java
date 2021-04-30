package com.markany.mysite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markany.mysite.repository.CCTVGroupRepository;
import com.markany.mysite.vo.CCTVGroupVo;
import com.markany.mysite.vo.CCTVVo;



@Service
public class CCTVGroupService {
	@Autowired
	private CCTVGroupRepository cctvgroupRepository;

	public List<CCTVGroupVo> getCCTVGroupList() {
		return cctvgroupRepository.findAll();
	}
	
	public void add(CCTVGroupVo vo) {
		cctvgroupRepository.add(vo);
	}

	public boolean update(CCTVGroupVo vo) {
		System.out.println(vo.toString());
		int count = cctvgroupRepository.update(vo);
		return count == 1;
	}

	public boolean delete(Long id) {
		int count = cctvgroupRepository.delete(id);
		return count > 0;
	}

	public List<CCTVVo> getCCTVListInGroup(Long id) {
		return cctvgroupRepository.findInGroup(id);
	}
}
