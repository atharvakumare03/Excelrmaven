package pom_pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseclass {

	static WebDriver driver;
	static String uname = "user@phptravels.com";
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		
		PageFactory.initElements(driver, objclass.class);
		objclass.userName.sendKeys("user@phptravels.com");
		objclass.password.sendKeys("demouser");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(objclass.LoginButton));

		objclass.LoginButton.click();
		
	}

}
