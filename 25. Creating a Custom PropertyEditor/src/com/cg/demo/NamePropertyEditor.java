package com.cg.demo;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {
	public void setAsText(String text) throws IllegalArgumentException{
		String name[] = text.split("\\s");
		Name result = new Name(name[0], name[1]);
		setValue(result);
	}
}
