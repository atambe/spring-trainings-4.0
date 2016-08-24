package com.cg.demo;

public class StandardLookupBean implements DemoBean {
	private MyHelper myHelper;
	
	public void doSomeOperation() {
		// TODO Auto-generated method stub
			myHelper.doSomethingHelpful();
	}

	public MyHelper getMyHelper() {
		// TODO Auto-generated method stub
		return myHelper;
	}

	public void setMyHelper(MyHelper myHelper){
		this.myHelper = myHelper;
	}
}
