package com.rubber.material.material;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSONObject;
import com.rubber.common.vo.MatchType;
import com.rubber.common.vo.PageData;
import com.rubber.material.model.Material;
import com.rubber.material.service.MaterialService;
import com.rubber.material.service.impl.MaterialServiceImpl;

public class TestMaterial {
	
	@Test
	public void testInsert(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		MaterialService detectionService = (MaterialServiceImpl)ctx.getBean("materialService");
		Material material = new Material();
		material.setId("1");
		material.setName("物料1");
		material.setSpecification("1000*3");
		material.setSupplierId("供应商1");
		material.setUnit("吨");
		material.setCreateTime(new Date());
		detectionService.insert(material);
	}

	
	@Test
	public void testUpdate(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		MaterialService detectionService = (MaterialServiceImpl)ctx.getBean("materialService");
		Material material = new Material();
		material.setId("96b019aa187f11e8a259c85b76ce5f6b");
		material.setName("物料11");
		material.setSpecification("1000*31");
		material.setSupplierId("供应商11");
		material.setUnit("吨");
		material.setModifyTime(new Date());
		detectionService.updateByPrimaryKey(material);
	}
	
	@Test
	public void testDelete(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		MaterialService detectionService = (MaterialServiceImpl)ctx.getBean("materialService");
		detectionService.deleteByPrimaryKey("8b261f4a17ef11e8a259c85b76ce5f6b");
	}
	
	@Test
	public void testSelect(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		MaterialService detectionService = (MaterialServiceImpl)ctx.getBean("materialService");
		List<Material> list = detectionService.selectAllRecord();
		for(Material m : list){
			System.out.println(JSONObject.toJSONString(m));
		}
	}
	
	@Test
	public void testSelectPaging(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		MaterialService detectionService = (MaterialServiceImpl)ctx.getBean("materialService");
		PageData<Material> pageData = new PageData<Material>();
		pageData.setPageNum(4); 
		pageData.setNumPerPage(1);
		pageData.setOrderField("createTime");
		pageData.setOrderDirection("desc");
		detectionService.selectByPaging(pageData);
		System.out.println(pageData.getTotalCount() + "," + pageData.getTotalPages()); 
		for(Material m : pageData.getResult()){
			System.out.println(JSONObject.toJSONStringWithDateFormat(m, "yyyy-MM-dd HH:mm:ss"));
		}
	}
	
	
}
