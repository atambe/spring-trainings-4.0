package com.cg.demo;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.regex.Pattern;

public class PropertyEditorBean {
	private byte[] bytes;
	
	private Class cls;
	
	private Boolean trueOrFalse;
	
	private List<String> stringList;
	
	private Date date;
	
	private Float floatValue;
	
	private File file;
	
	private InputStream stream;
	
	private Locale locale;
	
	private Pattern pattern;
	
	private Properties properties;
	
	private String trimString;
	
	private URL url;

	public void setBytes(byte[] bytes) {
		System.out.println("Adding "+bytes.length+" bytes");
		this.bytes = bytes;
	}

	public void setCls(Class cls) {
		System.out.println("Setting Class :: "+cls.getName());
		this.cls = cls;
	}

	public void setTrueOrFalse(Boolean trueOrFalse) {
		System.out.println("Setting Boolean :: "+trueOrFalse);
		this.trueOrFalse = trueOrFalse;
	}

	public void setStringList(List<String> stringList) {
		System.out.println("Setting String list :: "+stringList);
		this.stringList = stringList;
	}

	public void setDate(Date date) {
		System.out.println("Setting Date :: "+date);
		this.date = date;
	}

	public void setFloatValue(Float floatValue) {
		System.out.println("Setting float Value :: "+floatValue);
		this.floatValue = floatValue;
	}

	public void setFile(File file) {
		System.out.println("Setting file :: "+file.getName());
		this.file = file;
	}

	public void setStream(InputStream stream) {
		System.out.println("Setting Stream :: "+stream);
		this.stream = stream;
	}

	public void setLocale(Locale locale) {
		System.out.println("Setting Locale :: "+locale.getDisplayName());
		this.locale = locale;
	}

	public void setPattern(Pattern pattern) {
		System.out.println("Setting Pattern :: "+pattern);
		this.pattern = pattern;
	}

	public void setProperties(Properties properties) {
		System.out.println("Setting Properties :: "+properties);
		this.properties = properties;
	}

	public void setTrimString(String trimString) {
		System.out.println("Setting trim String :: "+trimString);
		this.trimString = trimString;
	}

	public void setUrl(URL url) {
		System.out.println("Setting URL :: "+url.toExternalForm());
		this.url = url;
	}
}
