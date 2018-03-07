package com.rubber.material.material;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSONObject;
import com.rubber.common.vo.PageData;
import com.rubber.material.model.Detection;
import com.rubber.material.service.DetectionService;
import com.rubber.material.service.impl.DetectionServiceImpl;

public class TestDetection {

	@Test
	public void testInsert(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DetectionService detectionService = (DetectionServiceImpl)ctx.getBean("detectionService");
		Detection detection = new Detection();
		detection.setAmount(10d);
		detection.setCreateTime(new Date());
		detection.setCreatorId("52590ed818ad11e8a259c85b76ce5f6b");
		detection.setDetectDate(new Date());
		detection.setDetectState(1);
		detection.setMaterialId("96b019aa187f11e8a259c85b76ce5f6b");
		detection.setRemark("检测1");
		detection.setUseState(1);
		detectionService.insert(detection);
		
	}

	
	@Test
	public void testUpdate(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DetectionService detectionService = (DetectionServiceImpl)ctx.getBean("detectionService");
		Detection detection = new Detection();
		detection.setId("68b15c2418ae11e8a259c85b76ce5f6b");
		detection.setAmount(101d);
		detection.setCreateTime(new Date());
		detection.setCreatorId("52590ed818ad11e8a259c85b76ce5f6b");
		detection.setDetectDate(new Date());
		detection.setDetectState(1);
		detection.setMaterialId("96b019aa187f11e8a259c85b76ce5f6b");
		detection.setRemark("检测12");
		detection.setUseState(1);
		detectionService.updateByPrimaryKey(detection);
		
	}
	
	@Test
	public void testDelete(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DetectionService detectionService = (DetectionServiceImpl)ctx.getBean("detectionService");
		detectionService.deleteByPrimaryKey("68b15c2418ae11e8a259c85b76ce5f6b");
		
	}
	
	@Test
	public void testSelect(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DetectionService detectionService = (DetectionServiceImpl)ctx.getBean("detectionService");
		List<Detection> list = detectionService.selectAllRecord();
		for(Detection m : list){
			System.out.println(JSONObject.toJSONString(m));
		}
		
	}
	
	@Test
	public void testSelectPaging(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DetectionService detectionService = (DetectionServiceImpl)ctx.getBean("detectionService");
		PageData<Detection> pageData = new PageData<Detection>();
		pageData.setPageNum(1); 
		pageData.setNumPerPage(1);
		pageData.setOrderField("createTime");
		pageData.setOrderDirection("desc");
		detectionService.selectByPaging(pageData);
		System.out.println(pageData.getTotalCount() + "," + pageData.getTotalPages()); 
		for(Detection m : pageData.getResult()){
			System.out.println(JSONObject.toJSONStringWithDateFormat(m, "yyyy-MM-dd HH:mm:ss"));
		}
		
	}
	
}
