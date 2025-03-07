package com.markany.mysite.repository;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markany.mysite.exception.UserRepositoryException;
import com.markany.mysite.vo.UserVo;

@Repository
public class UserRepository {
	
	@Autowired
	SqlSession sqlSession;
	
	public List<UserVo> findAll() {
		return sqlSession.selectList("user.findAll");
	}
	public UserVo findByIdAndPassword(UserVo vo){
		return sqlSession.selectOne("user.findByIAndPassword", vo);
	}
	
	
	
	
	
	
	
	
	public UserVo findByNo(Long userNo) {
		return sqlSession.selectOne("user.find", userNo);
	}
	
	public UserVo findByEmail(String email){
		return sqlSession.selectOne("user.findByEmail", email);
	}
	
	
	public UserVo findByEmailAndPassword2(UserVo vo) {
//		Map<String, Object> map = new HashMap<>();
//		map.put("e", vo.getEmail());
//		map.put("p", vo.getPassword());
		
		return sqlSession.selectOne("user.findByEmailAndPassword2", vo);
	}

	public int insert(UserVo userVo) throws UserRepositoryException {
		return sqlSession.insert("user.insert", userVo);
	}

	public int update(UserVo vo) {
		return sqlSession.update("user.update", vo);
	}
}
