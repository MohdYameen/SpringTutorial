package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionConfig.xml");
		
		Emp emp1 =(Emp) context.getBean("emp1");
		System.out.println(emp1);
		

	}

}
