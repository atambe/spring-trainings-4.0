package com.cg.demo;

public class ReplacementTarget {
	public String formatMessage(String msg){
		
		return msg.toUpperCase();
	}
	
	public String formatMessage(Object o){
		return "Formatted message :: "+o;
	}
}
