package com.markany.mysite.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markany.mysite.vo.CCTVGroupVo;
import com.markany.mysite.vo.CCTVVo;


@Repository
public class CCTVGroupRepository {

	@Autowired
	private SqlSession sqlSession;
	
	public List<CCTVGroupVo> findAll() {
		return sqlSession.selectList("cctvgroup.findAll");
	}
	
	public int add(CCTVGroupVo vo) {
		return sqlSession.insert("cctvgroup.insert", vo);
	}

	public int update(CCTVGroupVo vo) {
		System.out.println(vo.toString());
		return sqlSession.update("cctvgroup.update", vo);
	}

	public int delete(Long id) {
		return sqlSession.delete("cctvgroup.delete", id);
	}

	public List<CCTVVo> findInGroup(Long id) {
		return sqlSession.selectList("cctvgroup.findInGroup", id);
	}
}
