package com.rubber.material.material;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSONObject;
import com.rubber.common.vo.PageData;
import com.rubber.material.model.User;
import com.rubber.material.service.UserService;
import com.rubber.material.service.impl.UserServiceImpl;

public class TestUser {

	
	@Test
	public void testInsert(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserServiceImpl)ctx.getBean("userService");
		User user = new User();
		user.setUsername("fpc");
		user.setRealname("fengpc");
		user.setPassword("123");
		user.setCreateTime(new Date());
		userService.insert(user);
		
	}

	
	@Test
	public void testUpdate(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserServiceImpl)ctx.getBean("userService");
		User user = new User();
		user.setId("7adab62c18ac11e8a259c85b76ce5f6b");
		user.setUsername("fpc1");
		user.setRealname("fengpc1");
		user.setPassword("1231");
		user.setCreateTime(new Date());
		userService.updateByPrimaryKey(user);
	}
	
	@Test
	public void testDelete(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserServiceImpl)ctx.getBean("userService");
		userService.deleteByPrimaryKey("7adab62c18ac11e8a259c85b76ce5f6b"); 
	}
	
	@Test
	public void testSelect(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserServiceImpl)ctx.getBean("userService");
		List<User> list = userService.selectAllRecord();
		for(User m : list){
			System.out.println(JSONObject.toJSONString(m));
		}
	}
	
	@Test
	public void testSelectPaging(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserServiceImpl)ctx.getBean("userService");
		PageData<User> pageData = new PageData<User>();
		pageData.setPageNum(1); 
		pageData.setNumPerPage(1);
		pageData.setOrderField("createTime");
		pageData.setOrderDirection("desc");
		userService.selectByPaging(pageData);
		System.out.println(pageData.getTotalCount() + "," + pageData.getTotalPages()); 
		for(User m : pageData.getResult()){
			System.out.println(JSONObject.toJSONStringWithDateFormat(m, "yyyy-MM-dd HH:mm:ss"));
		}
	}
	
}
