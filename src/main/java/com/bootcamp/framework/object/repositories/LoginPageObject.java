package com.bootcamp.framework.object.repositories;

import org.aeonbits.owner.Config;

@Config.Sources("file:src/main/resources/ObjectRepositories/LoginPage.properties")
public interface LoginPageObject extends Config {
	
	@Key("username.input.id")
	String usernameElementById();
	
	@Key("password.input.id")
	String passwordElementById();
	
	@Key("login.button.id")
	String loginBtnElementById();

}