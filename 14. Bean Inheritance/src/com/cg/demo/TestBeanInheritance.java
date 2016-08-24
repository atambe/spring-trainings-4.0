package com.cg.demo;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestBeanInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("beanConfig.xml");
		
		Employee parent = ctx.getBean("parent", Employee.class);
		Employee child = ctx.getBean("child",Employee.class);
		
		System.out.println("Parent :: "+parent);
		System.out.println("Child  :: "+child);
	}

}
