package com.bootcamp.framework.testng.api.base;

import org.testng.annotations.DataProvider;

import com.bootcamp.framework.utils.ExcelUtility;

public class TestNGDataProvider extends TestNGHooks {

	protected String fileName;
	
	@DataProvider(name = "RegisterUserData")
	public String[][] getUserData(){
		return new String[][] {
			{"Karthikeyan", "QA", "Nebula"},
			{"Ram", "Dev", "Nebula"},
			{"Whiteman", "PO", "Nebula"}
		};		
	}
	
	@DataProvider(name = "UserLoginData")
	public String[][] getLoginData() {
		return ExcelUtility.readExcelData(fileName);
	}	

}