package com.markany.mysite.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markany.mysite.vo.SystemLogVo;

@Repository
public class SystemLogRepository {
	
	@Autowired
	SqlSession sqlSession;

	public List<SystemLogVo> findByDate(SystemLogVo vo) {
		
		if(vo.getAction().equalsIgnoreCase("Login") || vo.getAction().toString().equals("Logout")) {
			return sqlSession.selectList("systemLog.findByDateAction", vo);
		}else {
			return sqlSession.selectList("systemLog.findByDate", vo);
		}
	}	
	
}
