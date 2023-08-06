package com.bootcamp.framework.testng.api.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.bootcamp.framework.ui.selenium.api.base.SeleniumBase;
import com.bootcamp.framework.utils.DateHandler;

public class TestNGHooks extends SeleniumBase {
	
	protected RemoteWebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {}
	
	@BeforeClass
	public void beforeClass() {}	
	
    @Parameters({"url"})
	@BeforeMethod
	public void beforeMethod(String aut) {
		launchBrowser("chrome");
		goTo(aut);
	}

	@AfterMethod
	public void afterMethod(ITestResult result) {

		if (!result.isSuccess()) {
			File src = driver.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(src, new File("./images/" + DateHandler.randomNumberGeneration() + ".png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		driver.close();
		System.out.println("#Successfully closed the chrome browser");
	}

}