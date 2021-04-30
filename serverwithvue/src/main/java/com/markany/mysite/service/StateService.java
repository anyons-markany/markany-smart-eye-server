package com.markany.mysite.service;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.markany.mysite.repository.StateRepository;
import com.markany.mysite.vo.UserVo;

@Service
public class StateService {
	
	@Autowired
	private StateRepository stateRepository;
	
	public UserVo loginUser(UserVo vo) {
		System.out.println("서비스"+ vo);
		return stateRepository.Login(vo);
	}
	

}

