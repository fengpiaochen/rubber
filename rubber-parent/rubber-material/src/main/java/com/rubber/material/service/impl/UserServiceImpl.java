/**
 * Eya.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.rubber.material.service.impl;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubber.common.service.impl.BaseServiceImpl;
import com.rubber.material.dao.UserMapper;
import com.rubber.material.model.User;
import com.rubber.material.service.UserService;

 
/**
 * 用户表业务层访问接口实现
 * @author  自动生成
 * @version $Id: userServiceImpl.java, v 0.1  2018-2-22 13:31:26  自动生成 Exp $
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    /**用户表数据层访问接口实现**/
	@Autowired
	private UserMapper userMapper;

 
	@PostConstruct
    public void setBaseMapper() {
        this.baseMapper =  userMapper;
    }
    
    public void add(User entity){
    	userMapper.insert(entity);
    }
	
	 
}