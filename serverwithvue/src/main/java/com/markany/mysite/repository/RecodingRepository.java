package com.markany.mysite.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markany.mysite.vo.RecodingVo;


@Repository
public class RecodingRepository {
	@Autowired
	private SqlSession sqlSession;
	
	public List<RecodingVo> findAll() {
		return sqlSession.selectList("recoding.findAll");
	}

	public int insertRecodingInfo(RecodingVo vo) {
		return sqlSession.insert("recoding.insert", vo);
	}
}
