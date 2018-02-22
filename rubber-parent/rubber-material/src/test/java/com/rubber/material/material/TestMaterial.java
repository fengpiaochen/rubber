package com.rubber.material.material;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

}
