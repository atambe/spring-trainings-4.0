package com.cg.demo;

import java.sql.Date;
import java.util.GregorianCalendar;

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
		Employee e = new Employee();
		e.setFirstName("Sagar");
		e.setLastName("Kulkarni");
		e.setId(100);
		e.setHireDate(new Date((new GregorianCalendar(2013,06,3)).getTime().getTime()));
		dao.update(e);
	}

}
