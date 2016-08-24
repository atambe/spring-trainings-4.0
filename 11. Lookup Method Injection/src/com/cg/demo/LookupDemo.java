package com.cg.demo;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class LookupDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("beanConfig.xml");
		
		DemoBean abstractBean = (DemoBean)ctx.getBean("abstractLookupBean");
		/* The instantiation of abstract class is supported only when using method lookup injection, in which
		 * spring will use CGLIB (Code Generation Library) to generate a subclass of the AbstractLookupDemoBean
		 * class that overrides the method dynamically.
		 */
		System.out.println(abstractBean.getClass().getName());
		
		DemoBean standardBean = (DemoBean)ctx.getBean("standardLookupBean");
		System.out.println(standardBean.getClass().getName());
		
		displayInfo(standardBean);
		displayInfo(abstractBean);
	}

	private static void displayInfo(DemoBean bean) {
		// TODO Auto-generated method stub
		MyHelper helper1 =  bean.getMyHelper();
		MyHelper helper2 = bean.getMyHelper();
		
		System.out.println("Helper instances the same? :: "+(helper1==helper2));
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start("lookupDemo");
		
		for(int x=0; x< 100000; x++){
			MyHelper helper = bean.getMyHelper();
			helper.doSomethingHelpful();
		}
		
		stopWatch.stop();
		
		System.out.println("100000 gets took :: "+stopWatch.getTotalTimeMillis()+" ms");
	}

}
