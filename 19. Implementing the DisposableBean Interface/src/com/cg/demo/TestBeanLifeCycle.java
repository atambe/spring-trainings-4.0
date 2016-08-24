package com.cg.demo;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestBeanLifeCycle {
	private static GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx.load("beanConfig.xml");
		ctx.refresh();
		
		Employee e1 = getBean("employeeWithoutDepartment");
		Employee e2 = getBean("employeeWithoutName");
		Employee e3 = getBean("employeeWithAllPropertiesSet");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		ctx.destroy();
	}

	private static Employee getBean(String beanName) {
		// TODO Auto-generated method stub
		try{
			return ctx.getBean(beanName, Employee.class);
		}
		catch(BeanCreationException bce){
			System.out.println("Exception while initializing bean :: "+beanName);
			return null;
		}
		
	}

}
