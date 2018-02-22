/**
 * Eya.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.rubber.material.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rubber.common.vo.PageData;
import com.rubber.material.model.User;
import com.rubber.material.service.UserService;
 
/**
 *  用户表控制器
 * @author   自动生成
 * @version $Id: userService.java, v 0.1  2018-2-22 13:31:26  自动生成 Exp $
 */
@Controller 
@RequestMapping("user")
public class UserCtrl {
  
	/**用户表业务接口**/
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/list")
	public String list(PageData<User> pageData,Model model){ 
		userService.selectByPaging(pageData);
		return "user/list";
	}
	
	@RequestMapping("/add")
	public String add(User entity, Model model){ 
		userService.insert(entity);
		return "user/list";
	}
	
	@RequestMapping("/update")
	public String update(User entity, Model model){ 
		userService.updateByPrimaryKey(entity);
		return "user/list";
	}
 
 	@RequestMapping("/delete")
	public String delete(User entity, Model model){ 
		userService.deleteByPrimaryKey(entity.getId());
		return "user/list";
	}
 	
 
 
} 