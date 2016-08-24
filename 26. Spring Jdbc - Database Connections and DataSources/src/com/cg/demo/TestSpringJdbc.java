package com.cg.demo;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestSpringJdbc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("beanConfig.xml");
		ctx.refresh();
		
		JdbcDao dao = ctx.getBean("jdbcDao",JdbcDao.class);
		System.out.println("First Name :: "+dao.findFirstNameById(101));
		System.out.println("Last Name  :: "+dao.findLastNameById(101));
		System.out.println("Salary     :: "+dao.findSalaryById(101));
		
		/*System.out.println("*************************************");
		for(Employee e: dao.findAll()){
			System.out.println(e);
		}*/
		
		System.out.println("*************************************");
		for(Employee e: dao.findAllWithJobHistory()){
			System.out.println(e);
		}
	}

}
