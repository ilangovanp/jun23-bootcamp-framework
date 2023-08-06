package com.bootcamp.framework.pages.cor;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.bootcamp.framework.object.repositories.LoginPageObject;

public class LoginPage {

	private RemoteWebDriver driver;
	private LoginPageObject obj;

	public LoginPage(RemoteWebDriver driver) {
		obj = ConfigFactory.create(LoginPageObject.class);
		this.driver = driver;
	}

	public LoginPage enterUserName(String uName) {
		driver.findElement(By.id(obj.usernameElementById())).sendKeys(uName);
		System.out.println("#Enter given user name " + uName + " in the " + driver.findElement(By.id(obj.usernameElementById()))
				+ " input field");
		return this;
	}

	public LoginPage enterPassword(String pwd) {
		driver.findElement(By.id(obj.passwordElementById())).sendKeys(pwd);
		System.out.println("#Enter given password in the " + driver.findElement(By.id(obj.passwordElementById())) + " input field");
		return this;
	}

	public LandingPage clickOnTheLoginBtn() {
		System.out.println("#Clik on the " + driver.findElement(By.id(obj.loginBtnElementById())) + " login button");
		driver.findElement(By.id(obj.loginBtnElementById())).click();
		return new LandingPage(driver);
	}

}