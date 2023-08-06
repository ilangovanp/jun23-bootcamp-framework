package com.bootcamp.framework.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyHandler {

	public static String readConfigProperty(String key) {
		Properties prop = new Properties();
		String value = null;
		try {
			prop.load(new FileInputStream(new File("src/main/resources/config.properties")));
			value = prop.getProperty(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	
}