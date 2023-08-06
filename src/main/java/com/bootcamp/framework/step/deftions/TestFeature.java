package com.bootcamp.framework.step.deftions;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.bootcamp.framework.pages.cor.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFeature {
	
	private RemoteWebDriver driver;
	private String aut = "https://login.salesforce.com/";
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    System.out.println("Browser and url launch");
	}
	
	@When("I complete action")
	public void i_complete_action() {
		System.out.println("test action");
	}
	
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    System.out.println("Validation");
	}
	
	@Given("Salesforce user want to login in to the appliction to do cretain task")
	public void salesforce_user_want_to_login_in_to_the_appliction_to_do_cretain_task() {
		try {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			System.out.println("#Successfully opened chrome browser");
			driver.manage().window().maximize();
			System.out.println("#Maximized the opened chrome browser");
			driver.get(aut);
			System.out.println("#Launched the give aut "+aut+" link in the opened chrome browser");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			System.out.println("#Added the 30 seconds of implicit wait to all your findElement and findElements");
		} catch (Exception e) {
			throw new RuntimeException("Unable to open chrome browser and launch application due to " + e.getMessage());
		}
	}
	@When("they enter valid crendentials in login page and click the login button")
	public void they_enter_valid_crendentials_in_login_page_and_click_the_login_button() {
	    new LoginPage(driver).enterUserName("hari.radhakrishnan@qeagle.com")
	    .enterPassword("Leaf@1234").clickOnTheLoginBtn();
	}
	@Then("they should able to redriect landing page successfully")
	public void they_should_able_to_redriect_landing_page_successfully() {
		String actual = driver.getCurrentUrl();
	    Assert.assertEquals(actual, "https://qeagle-dev-ed.lightning.force.com/lightning/setup/SetupOneHome/home");
	}
	
	@Given("^I want to write a step with (.*)$")
	public void i_want_to_write_a_step_with_name(String arg) {		
	    System.out.println(arg);
	}
	@When("^I check for the (.*) in step$")
	public void i_check_for_the_value_in_step(String arg) {
		Assert.assertEquals(true, false);
		System.out.println(arg);		
	}
	@Then("^I verify the (.*) in step$")
	public void i_verify_the_status_in_step(String arg) {
		System.out.println(arg);
	}
	
	

}