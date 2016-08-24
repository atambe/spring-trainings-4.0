package com.cg.demo;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestPropertyEditor {

	public static void main(String args[]){
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("beanConfig.xml");
		ctx.refresh();
		
		PropertyEditorBean peb = ctx.getBean("builtInSimple", PropertyEditorBean.class);
	}
}
