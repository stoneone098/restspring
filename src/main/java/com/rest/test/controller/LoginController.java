package com.rest.test.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.test.service.LoginService;

@RestController
public class LoginController {
@Autowired
LoginService service;
	
@PostMapping("/vaild")
public String valid(@RequestBody  String  request)
	{
	String Vaild="N";

	JSONObject value = new JSONObject(request);
	if(!(value.get("username").toString().isBlank()||value.get("password").toString().isBlank()))
	{
		
		Vaild="Y";
	}

		return Vaild;
		
	}
 

}
