package com.bootcamp.framework.testsuties;

import org.testng.annotations.Test;

import com.bootcamp.framework.pages.cor.LoginPage;
import com.bootcamp.framework.testng.api.base.TestNGHooks;

public class TestCase004 extends TestNGHooks {
	
	@Test
	public void testcase001() {
		new LoginPage(driver)
		.enterUserName("hari.radhakrishnan@qeagle.com")
		.enterPassword("Leaf@1234")
		.clickOnTheLoginBtn();
	}

}
