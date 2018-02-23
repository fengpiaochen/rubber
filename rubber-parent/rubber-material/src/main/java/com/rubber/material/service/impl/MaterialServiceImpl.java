/**
 * Eya.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.rubber.material.service.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubber.common.service.impl.BaseServiceImpl;
import com.rubber.material.dao.MaterialMapper;
import com.rubber.material.model.Material;
import com.rubber.material.service.MaterialService;

 
/**
 * 物料表业务层访问接口实现
 * @author  自动生成
 * @version $Id: materialServiceImpl.java, v 0.1  2018-2-22 13:31:26  自动生成 Exp $
 */
@Service("materialService")
public class MaterialServiceImpl extends BaseServiceImpl<Material> implements MaterialService {

    /**物料表数据层访问接口实现**/
	@Autowired
	private MaterialMapper materialMapper;

 
	@PostConstruct
    public void setBaseMapper() {
        this.baseMapper =  materialMapper;
    }
    
  
	 
}