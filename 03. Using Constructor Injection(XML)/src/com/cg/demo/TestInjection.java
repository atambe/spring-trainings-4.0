package com.cg.demo;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestInjection {
	public static void main(String args[]){
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("beanConfig.xml");
		Employee e = ctx.getBean("employee",Employee.class);
		System.out.println(e);
	}
}
