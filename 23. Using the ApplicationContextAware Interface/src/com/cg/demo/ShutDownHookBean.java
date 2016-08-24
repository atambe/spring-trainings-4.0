package com.cg.demo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericApplicationContext;

public class ShutDownHookBean  implements ApplicationContextAware{

	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		// TODO Auto-generated method stub
			if(ctx instanceof GenericApplicationContext){
				((GenericApplicationContext)ctx).registerShutdownHook();
			}
	}
}
