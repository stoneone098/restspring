package com.rest.test.pojo;

import org.springframework.stereotype.Component;

@Component
public class LoginVO {

	private int userid=0;
	private String username=null;
	private String password=null;
	public int getUserid() {
		return userid;
	}
	public LoginVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginVO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
