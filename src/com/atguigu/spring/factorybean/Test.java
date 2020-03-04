package com.atguigu.spring.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("factory-bean.xml");
		Object object = ac.getBean("factory");
		System.out.println(object);
		
	}
	
}
