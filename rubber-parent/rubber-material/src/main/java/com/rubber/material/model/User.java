package com.rubber.material.model;

import com.rubber.common.model.BaseModel;

public class User extends BaseModel{
	
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String username;
	
	private String realname;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}
	
	

}
