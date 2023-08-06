package com.bootcamp.framework.testsuties;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bootcamp.framework.testng.api.base.TestNGHooks;

public class TestCase002 extends TestNGHooks {
	
	@Parameters({"username","password"})
	@Test
	public void testcase001(String uName, String pwd) {		
		driver.findElement(By.id("username")).sendKeys(uName);	
		System.out.println("#Enter given user name "+uName+" in the "+driver.findElement(By.id("username"))+" input field");
		driver.findElement(By.id("password")).sendKeys(pwd);
		System.out.println("#Enter given password in the "+driver.findElement(By.id("username"))+" input field");
		System.out.println("#Clik on the "+driver.findElement(By.id("Login"))+" login button");
		driver.findElement(By.id("Login")).click();		
	}

}