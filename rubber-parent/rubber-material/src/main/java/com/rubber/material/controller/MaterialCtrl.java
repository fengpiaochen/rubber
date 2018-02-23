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
import com.rubber.material.model.Material;
import com.rubber.material.service.MaterialService;
 
/**
 *  物料表控制器
 * @author   自动生成
 * @version $Id: materialService.java, v 0.1  2018-2-22 13:31:26  自动生成 Exp $
 */
@Controller 
@RequestMapping("material")
public class MaterialCtrl {
  
	/**物料表业务接口**/
	@Autowired
	private MaterialService materialService;
	
	
	@RequestMapping("/list")
	public String list(PageData<Material> pageData,Model model){ 
		materialService.selectByPaging(pageData);
		return "material/list";
	}
	
	@RequestMapping("/add")
	public String add(Material entity, Model model){ 
		materialService.insert(entity);
		return "material/list";
	}
	
	@RequestMapping("/update")
	public String update(Material entity, Model model){ 
		materialService.updateByPrimaryKey(entity);
		return "material/list";
	}
 
 	@RequestMapping("/delete")
	public String delete(Material entity, Model model){ 
		materialService.deleteByPrimaryKey(entity.getId());
		return "material/list";
	}
 	
 
 
} 