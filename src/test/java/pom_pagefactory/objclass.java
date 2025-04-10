package pom_pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class objclass {

	@FindBy(name = "email")
	public static WebElement userName;
	
	@FindBy(name = "password")
	public static WebElement password;
	
	@FindBy(id = "submitBTN")
	public static WebElement LoginButton;
	
	

}
