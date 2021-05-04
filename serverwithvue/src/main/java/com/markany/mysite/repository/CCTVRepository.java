package com.markany.mysite.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markany.mysite.vo.CCTVGroupVo;
import com.markany.mysite.vo.CCTVVo;

@Repository
public class CCTVRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<CCTVVo> findAll() {
		return sqlSession.selectList("cctv.findAll");
	}
	
	public int add(CCTVVo vo) {
		return sqlSession.insert("cctv.insert", vo);
	}

	public int update(CCTVVo vo) {
		System.out.println(vo.toString());
		return sqlSession.update("cctv.update", vo);
	}

	public int delete(Long id) {
		return sqlSession.delete("cctv.delete", id);
	}
	
	public List<CCTVGroupVo> centcon_find() {
		return sqlSession.selectList("cctv.centcon_true_find");
	}

	public List<CCTVGroupVo> getCentConAddList() {
		return sqlSession.selectList("cctv.centcon_false_find");
	}

	public int cent_con_update(CCTVVo vo) {
		System.out.println(vo.toString());
		return sqlSession.update("cctv.cent_con_update", vo);
	}
}
