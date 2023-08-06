package com.bootcamp.framework.ui.selenium.api.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.bootcamp.framework.ui.selenium.api.design.ISeleniumBase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBase implements ISeleniumBase {

	protected RemoteWebDriver driver;

	@Override
	public RemoteWebDriver launchBrowser(String browserName) {
		switch (browserName.toUpperCase()) {
		case "CHROME":
			try {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				options.addArguments("--remote-allow-origins=*");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(options);
				System.out.println("#Successfully opened chrome browser");
				driver.manage().window().maximize();
				System.out.println("#Maximized the opened chrome browser");
			} catch (Exception e) {
				throw new RuntimeException("Unable to open chrome browser due to " + e.getMessage());
			}
			break;
		case "FIREFOX":
			try {
				FirefoxOptions options = new FirefoxOptions();
				options.addArguments("--disable-notifications");
				options.addArguments("--remote-allow-origins=*");
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver(options);
				System.out.println("#Successfully opened firefox browser");
				driver.manage().window().maximize();
				System.out.println("#Maximized the opened firefox browser");
			} catch (Exception e) {
				throw new RuntimeException("Unable to open firefox browser due to " + e.getMessage());
			}
			break;
		case "EDGE":
			try {
				EdgeOptions options = new EdgeOptions();
				options.addArguments("--disable-notifications");
				options.addArguments("--remote-allow-origins=*");
				WebDriverManager.firefoxdriver().setup();
				driver = new EdgeDriver(options);
				System.out.println("#Successfully opened edge browser");
				driver.manage().window().maximize();
				System.out.println("#Maximized the opened edge browser");
			} catch (Exception e) {
				throw new RuntimeException("Unable to open edge browser due to " + e.getMessage());
			}
			break;

		default:
			throw new RuntimeException("Currently our framework support Chrome, Firefox and Edge Browser only");
		}
		return driver;
	}

	@Override
	public void goTo(String url) {
		driver.get(url);

	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void quitBrowser() {
		// TODO Auto-generated method stub

	}

	@Override
	public WebElement getLocator(String domEle) {
		WebElement element = null;
		String[] split = domEle.split("=", 2);
		switch (split[0].toUpperCase()) {
		case "ID":
			try {
				element = driver.findElement(By.id(split[1]));
			} catch (Exception e) {
				// TODO: handle exception
			}
			break;
		case "NAME":
			element = driver.findElement(By.name(split[1]));
			break;
		case "CLASSNAME":
			element = driver.findElement(By.className(split[1]));
			break;
		case "TAGNAME":
			element = driver.findElement(By.tagName(split[1]));
			break;
		case "LINKTEXT":
			element = driver.findElement(By.linkText(split[1]));
			break;
		case "PARTIALLINKTEXT":
			element = driver.findElement(By.partialLinkText(split[1]));
			break;
		case "CSSSELECTOR":
			element = driver.findElement(By.cssSelector(split[1]));
			break;
		case "XPATH":
			element = driver.findElement(By.xpath(split[1]));
		default:
			throw new RuntimeException("Invaild Locator option");
		}
		return element;
	}

	@Override
	public List<WebElement> getLocators(String domEle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void type(WebElement locator, String value) {
		locator.sendKeys(value);

	}

	@Override
	public void click(WebElement locator) {
		locator.click();

	}

	@Override
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToWindow(String title) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToFrame(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToFrame(WebElement locator) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToFrame(String idOrName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void defaultContent() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isTitleExpected(WebElement locator, String expectedTitle) {
		boolean bReturn = false;
		if (driver.getTitle().equals(expectedTitle)) {
			bReturn = true;
		}
		return bReturn;
	}

	@Override
	public boolean isTextExpected(WebElement locator, String expectedText) {
		boolean bReturn = false;
		if (locator.getText().equals(expectedText)) {
			bReturn = true;
		}
		return bReturn;
	}

	@Override
	public boolean isTextContains(WebElement locator, String contiansText) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isUrlExpected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isUrlContains() {
		// TODO Auto-generated method stub
		return false;
	}

}