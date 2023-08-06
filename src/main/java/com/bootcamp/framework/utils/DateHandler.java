package com.bootcamp.framework.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHandler {
	
	public static String randomNumberGeneration() {
		String pattern = "ddMMyyyyHHmmssSSSS";
		return new SimpleDateFormat(pattern).format(new Date());
	}

}