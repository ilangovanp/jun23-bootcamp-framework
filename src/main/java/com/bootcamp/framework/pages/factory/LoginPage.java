package com.bootcamp.framework.pages.factory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {	
	
	@FindBy(id = "username")
	WebElement userNameInput;
	
	@FindBy(id = "password")
	WebElement passwordInput;
	
	@FindBy(id = "Login")
	WebElement loginBtn;

	public LoginPage(RemoteWebDriver driver) {	
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String uName) {
		try {
			userNameInput.sendKeys(uName);
			System.out.println("#Enter given user name " + uName + " in the " + userNameInput + " input field");
		} catch (Exception e) {
			throw new RuntimeException("Unable to type username due to "+e.getMessage());
		}
	}
	
	public void enterPassword(String pwd) {
		passwordInput.sendKeys(pwd);
		System.out.println("#Enter given password in the "+passwordInput+" input field");
	}
	
	public void clickOnTheLoginBtn() {
		System.out.println("#Clik on the "+loginBtn+" login button");
		loginBtn.click();	
	}

}