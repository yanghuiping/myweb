package com.yhp.myweb.test.demo;

import com.yhp.myweb.service.demo.UserService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/** 
 * @ClassName: TestBean 
 * @Description: TODO
 * @author 
 * @date 2014-8-27 обнГ1:20:04 
 *  
 */

public class TestBean
{

	/** 
	 * @Title: main 
	 * @Description: 
	 * @param args    
	 */

	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService)ctx.getBean("userService");
		
	}

}
