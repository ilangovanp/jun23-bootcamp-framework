package com.bootcamp.framework.testsuties;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bootcamp.framework.testng.api.base.TestNGDataProvider;

public class TestCase001 extends TestNGDataProvider {
	
	@BeforeTest
	public void beforeTest() {
		fileName = "Login";
	}
	
	@Test(dataProvider = "UserLoginData")
	public void testcase001(String uName, String pwd) {
		System.out.println(uName +" | "+ pwd);
		Assert.assertEquals(driver.getTitle(), "Login  Salesforce");
	}
	
	@Test(dataProvider = "RegisterUserData")
	public void testcase002(String name, String role, String teamName) {
		System.out.println(name +" | "+ role +" | "+ teamName);
		Assert.assertEquals(driver.getTitle(), "Login | Salesforce");
	}	

}