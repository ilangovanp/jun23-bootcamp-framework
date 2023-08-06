package com.bootcamp.framework.testsuties;

import org.testng.annotations.Test;

import com.bootcamp.framework.pages.factory.LoginPage;
import com.bootcamp.framework.testng.api.base.TestNGHooks;

public class TestCase003 extends TestNGHooks {
	
	@Test
	public void testcase001() {		
		
		LoginPage lPage = new LoginPage(driver);
		
		lPage.enterUserName("hari.radhakrishnan@qeagle.com");
		lPage.enterPassword("Leaf@1234");
		lPage.clickOnTheLoginBtn();		
		
	}

}