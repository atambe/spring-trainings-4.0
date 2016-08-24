package com.cg.demo;

public class Phone {
	private String type;
	private String no;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "Phone [no=" + no + ", type=" + type + "]";
	}
	
	
}
