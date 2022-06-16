package com.trello.tyss.pomrepositorylibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	WebDriver driver;
	public LogoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@title='pft pft (pftpft1)']")
	private WebElement logoutMenu;
	@FindBy(xpath = "//button/span[text()='Log out']")
	private WebElement logoutOption;
	@FindBy(id = "logout-submit")
	private WebElement logoutButton;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement logoutMenu() {
		return logoutMenu;
	}
	public WebElement logoutOption() {
		return logoutOption;
	}
	public WebElement logoutButton() {
		return logoutButton;
	}
	
	public void logout() {
		logoutMenu.click();
		logoutOption.click();
		logoutButton.click();
	}
}
