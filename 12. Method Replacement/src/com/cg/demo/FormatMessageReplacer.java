package com.cg.demo;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class FormatMessageReplacer implements MethodReplacer {

	
	public Object reimplement(Object object, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		if(isFormattedMessageMethod(method)){
			String msg = (String)args[0];
			return msg.toLowerCase();
		}
		else{
			throw new IllegalArgumentException("Unable to reimplement Method"+method.getName());
		}
	}

	private boolean isFormattedMessageMethod(Method method) {
		// TODO Auto-generated method stub
		if(method.getParameterTypes().length != 1){
			return false;
		}
		if(!("formatMessage".equals(method.getName()))){
				return false;
		}
		if(method.getReturnType() != String.class){
			return false;
		}
		if(method.getParameterTypes()[0] != String.class){
			return false;
		}
		return true;
	}

}
