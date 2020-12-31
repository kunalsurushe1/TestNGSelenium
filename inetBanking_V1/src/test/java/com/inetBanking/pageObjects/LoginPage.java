package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath = "//input[@name='uid']")
	WebElement txtUserName;

	@FindBy(xpath = "//input[@name='password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@name='btnLogin']")
	WebElement btnLogin;
	
	@FindBy(xpath = "//a[text()='Log out']")
	WebElement btnLogout;

	public void setUserName(String uname) {

		txtUserName.sendKeys(uname);

	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);

	}

	public void clickLogin() {
		btnLogin.click();
	}
	
	public void clickLogout() {
		btnLogout.click();
	}

}
