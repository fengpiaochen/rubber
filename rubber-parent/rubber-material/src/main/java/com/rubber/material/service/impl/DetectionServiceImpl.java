/**
 * Eya.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.rubber.material.service.impl;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubber.common.service.impl.BaseServiceImpl;
import com.rubber.material.dao.DetectionMapper;
import com.rubber.material.model.Detection;
import com.rubber.material.service.DetectionService;

 
/**
 * 检测表业务层访问接口实现
 * @author  自动生成
 * @version $Id: detectionServiceImpl.java, v 0.1  2018-2-22 13:31:26  自动生成 Exp $
 */
@Service("detectionService")
public class DetectionServiceImpl extends BaseServiceImpl<Detection> implements DetectionService {

    /**检测表数据层访问接口实现**/
	@Autowired
	private DetectionMapper detectionMapper;

 
	@PostConstruct
    public void setBaseMapper() {
        this.baseMapper =  detectionMapper;
    }
    
    
	
	
	 
}