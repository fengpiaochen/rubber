/**
 * Eya.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.rubber.material.model;
import java.util.Date;

import com.rubber.common.model.BaseModel;

/**
 * 用户表
 * @author  自动生成
 * @version $Id: User.java, v 0.1 2018-2-22 12:55:15   自动生成 Exp $
 */
public class User extends BaseModel implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

	/***/
	private String            id;
	
	/***/
	private String            username;
	
	/***/
	private String            password;
	
	/***/
	private String            realname;
	
	/***/
	private Date            createTime;
	
	
	
	 /**
     * Setter method for property <tt>id</tt>.
     * 
     * @param id value to be assigned to property id
     */
	public void setId(String id) {
		this.id = id;
	}
	
	 /**
     * Getter method for property <tt>id</tt>.
     * 
     * @return id value of id
     */
	public String getId() {
		return this.id;
	}
	
	 /**
     * Setter method for property <tt>username</tt>.
     * 
     * @param username value to be assigned to property username
     */
	public void setUsername(String username) {
		this.username = username;
	}
	
	 /**
     * Getter method for property <tt>username</tt>.
     * 
     * @return username value of username
     */
	public String getUsername() {
		return this.username;
	}
	
	 /**
     * Setter method for property <tt>password</tt>.
     * 
     * @param password value to be assigned to property password
     */
	public void setPassword(String password) {
		this.password = password;
	}
	
	 /**
     * Getter method for property <tt>password</tt>.
     * 
     * @return password value of password
     */
	public String getPassword() {
		return this.password;
	}
	
	 /**
     * Setter method for property <tt>realname</tt>.
     * 
     * @param realname value to be assigned to property realname
     */
	public void setRealname(String realname) {
		this.realname = realname;
	}
	
	 /**
     * Getter method for property <tt>realname</tt>.
     * 
     * @return realname value of realname
     */
	public String getRealname() {
		return this.realname;
	}
	
	 /**
     * Setter method for property <tt>createTime</tt>.
     * 
     * @param createTime value to be assigned to property createTime
     */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	 /**
     * Getter method for property <tt>createTime</tt>.
     * 
     * @return createTime value of createTime
     */
	public Date getCreateTime() {
		return this.createTime;
	}
}