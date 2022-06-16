package com.trello.tyss.pomrepositorylibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(linkText = "Log in")
private WebElement loginLinkText;
@FindBy(id = "user")
private WebElement userName_TextField;
@FindBy(id = "login")
private WebElement loginWithAtlassian;
@FindBy(id = "password")
private WebElement password_TextField;
@FindBy(id = "login-submit")
private WebElement loginButton;

public WebDriver getDriver() {
	return driver;
}
public WebElement loginLinkText(){
	return loginLinkText;
}
public WebElement userName_TextField() {
	return userName_TextField;
}
public WebElement loginWithAtlassian() {
	return loginWithAtlassian;
}
public WebElement password_TextField() {
	return password_TextField;
}
public WebElement loginButton() {
	return loginButton;
}

public void loginStep_01(String username) {
	loginLinkText.click();
	userName_TextField.sendKeys(username);
	loginWithAtlassian.click();
}
public void loginStep_02(String password) {
	password_TextField.sendKeys(password);
	loginButton.click();
}
}
