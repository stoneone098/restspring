package com.rest.test.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.test.dao.LoginDAO;
import com.rest.test.pojo.LoginVO;

@Service
public class Loginbusiness {

	@Autowired
	LoginDAO logindao;
	private String valid(LoginVO login)
	{
		return null;
		
	}

}
