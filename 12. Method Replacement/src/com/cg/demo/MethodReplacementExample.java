package com.cg.demo;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class MethodReplacementExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("beanConfig.xml");
		ctx.refresh();
		
		ReplacementTarget replacementTarget = ctx.getBean("replacementTarget", ReplacementTarget.class);
		ReplacementTarget standardTarget = ctx.getBean("standardTarget", ReplacementTarget.class);
		
		System.out.println("Invoking replaced method ");
		displayInfo(replacementTarget);
		System.out.println("Invoking original method ");
		displayInfo(standardTarget);
		
	}

	private static void displayInfo(ReplacementTarget target) {
		// TODO Auto-generated method stub
		System.out.println(target.formatMessage("Hello World!"));
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		for(int x=0; x<100000; x++){
			target.formatMessage("foo");
		}
		
		stopWatch.stop();
		
		System.out.println("100000 invocation took :: "+stopWatch.getTotalTimeMillis()+" ms");
	}

}
