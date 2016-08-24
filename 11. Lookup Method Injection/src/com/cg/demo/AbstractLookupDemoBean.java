package com.cg.demo;

public abstract class AbstractLookupDemoBean implements DemoBean {

	
	public void doSomeOperation() {
		// TODO Auto-generated method stub
		getMyHelper().doSomethingHelpful();
	}


	abstract public MyHelper getMyHelper();

}
