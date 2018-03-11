/**
 * Eya.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.rubber.material.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
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
	@ResponseBody
	public String list(PageData<Material> pageData,Model model, HttpServletResponse response){ 
		response.setCharacterEncoding("utf-8");
		materialService.selectByPaging(pageData);
		List<Material> list = pageData.getResult();
		String str = JSONObject.toJSONString(list);
		System.out.println(str);
		return str;
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