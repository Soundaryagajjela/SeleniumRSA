package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageObjMdl {
//data------->web element
	WebDriver driver;
	@FindBy(how=How.NAME,using="userName")
	WebElement userName;
	@FindBy(how=How.NAME,using="password")
	WebElement password;
	@FindBy(how=How.NAME,using="login")
	WebElement signIn;
	public String clickSignIn(){
	userName.sendKeys("mercury");
	password.sendKeys("mercury");
	signIn.click();
	return driver.getTitle();
	}
	public PageObjMdl(WebDriver driver) {
		super();
		this.driver = driver;
	}
}
