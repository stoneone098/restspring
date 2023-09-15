package com.rest.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.test.business.Loginbusiness;
import com.rest.test.pojo.LoginVO;

@Service
public class LoginService {
@Autowired
Loginbusiness loginbusiness;

private String valid(LoginVO login)
{
	return null;
	
}

}
