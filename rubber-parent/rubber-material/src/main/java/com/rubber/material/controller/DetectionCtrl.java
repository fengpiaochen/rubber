/**
 * Eya.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.rubber.material.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rubber.common.vo.PageData;
import com.rubber.material.model.Detection;
import com.rubber.material.service.DetectionService;
 
/**
 *  检测表控制器
 * @author   自动生成
 * @version $Id: detectionService.java, v 0.1  2018-2-22 13:31:26  自动生成 Exp $
 */
@Controller 
@RequestMapping("detection")
public class DetectionCtrl {
  
	/**检测表业务接口**/
	@Autowired
	private DetectionService detectionService;
	
	
	@RequestMapping("/list")
	public String list(PageData<Detection> pageData,Model model){ 
		detectionService.selectByPaging(pageData);
		model.addAttribute("pageData", pageData);
		return "detection/list";
	}
	
	@RequestMapping("/add")
	public String add(Detection entity, Model model){ 
		detectionService.insert(entity);
		return "detection/list";
	}
	
	@RequestMapping("/update")
	public String update(Detection entity, Model model){ 
		detectionService.updateByPrimaryKey(entity);
		return "detection/list";
	}
 
 	@RequestMapping("/delete")
	public String delete(Detection entity, Model model){ 
		detectionService.deleteByPrimaryKey(entity.getId());
		return "detection/list";
	}
 	
 
 
} 