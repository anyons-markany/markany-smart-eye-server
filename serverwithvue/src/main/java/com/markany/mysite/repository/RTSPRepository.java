package com.markany.mysite.repository;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markany.mysite.vo.RTSPVo;

@Repository
public class RTSPRepository {
	
	@Autowired
	SqlSession sqlSession;
	
	public List<RTSPVo> findAll() {
		System.out.println("레포지토리 진입");
		return sqlSession.selectList("rtsp.findAll");
	}

	public RTSPVo findById(Long id) {
		return sqlSession.selectOne("rtsp.findById", id);
	}
	
	public RTSPVo findByManufacturer(String manufacturer) {
		return sqlSession.selectOne("rtsp.findByManufacturer", manufacturer);
	}

	public RTSPVo findByModel(String model) {
		return sqlSession.selectOne("rtsp.findByModel", model);
	}
	
	public RTSPVo findByPaths(String vo) {
		return sqlSession.selectOne("rtsp.findByPaths", vo);
	}
	
	public Integer insert(RTSPVo vo) {
		return sqlSession.insert("rtsp.insert", vo);
	}
	
	public Integer delete(Long id) {
		return sqlSession.delete("rtsp.delete", id);
	}
	
	public Integer update(Long id) {
		return sqlSession.update("rtsp.update", id);
	}
	
}



