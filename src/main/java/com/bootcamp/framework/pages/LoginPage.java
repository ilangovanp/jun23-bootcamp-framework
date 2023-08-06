package com.bootcamp.framework.pages;

import org.openqa.selenium.WebElement;
import com.bootcamp.framework.testng.api.base.TestNGHooks;

public class LoginPage extends TestNGHooks {

	public LoginPage() {
		
	}

	public void enterUserName(String uName) {
		/*driver.findElement(By.id("username")).sendKeys(uName);
		System.out.println("#Enter given user name " + uName + " in the " + driver.findElement(By.id("username"))
				+ " input field");*/
		WebElement locator = getLocator("id=username");
		type(locator, uName);
	}
	
	public void enterPassword(String pwd) {
		/*driver.findElement(By.id("password")).sendKeys(pwd);
		System.out.println("#Enter given password in the "+driver.findElement(By.id("username"))+" input field");*/
		type(getLocator("id=password"), pwd);
	}
	
	public void clickOnTheLoginBtn() {
		/*System.out.println("#Clik on the "+driver.findElement(By.id("Login"))+" login button");
		driver.findElement(By.id("Login")).click();*/	
		click(getLocator("id=Login"));
	}

}