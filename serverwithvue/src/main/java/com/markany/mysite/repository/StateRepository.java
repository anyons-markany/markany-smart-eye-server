package com.markany.mysite.repository;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markany.mysite.vo.UserVo;

@Repository
public class StateRepository {
	
	@Autowired
	SqlSession sqlSession;

	//로그인
	public UserVo Login(UserVo vo) {
		System.out.println("로그인 레포지토리"+ vo);
		return sqlSession.selectOne("state.login", vo);
	}

}