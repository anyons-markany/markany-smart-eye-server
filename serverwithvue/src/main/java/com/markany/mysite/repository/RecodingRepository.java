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
	
	public List<RecodingVo> findById(Long startNo) {
		return sqlSession.selectOne("recoding.findById", startNo);
	}

	public int insertRecodingInfo(RecodingVo vo) {
		return sqlSession.insert("recoding.insert", vo);
	}

	public int update(RecodingVo vo) {
		System.out.println(vo.toString());
		return sqlSession.update("recoding.update", vo);
	}

	public int delete(Long id) {
		return sqlSession.delete("recoding.delete", id);
	}
}
