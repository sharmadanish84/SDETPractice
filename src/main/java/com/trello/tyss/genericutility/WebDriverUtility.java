package com.trello.tyss.genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.trello.tyss.pomrepositorylibrary.LoginPage;

/**
 * This class is for WebDriver related reusable components such as 
 * implicit wait
 * explicit wait
 * fluent wait
 * @author Danish 
 *
 */
public class WebDriverUtility {
	/**
	 * this method is used for implicit wait
	 * @author Danish
	 * @param driver
	 */

	public void implicitlywait(WebDriver driver) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	/**
	 * Library method used for explicit wait
	 * @author Danish
	 * @param driver
	 */
	public void explicitlywait(WebDriver driver)
	{
		LoginPage loginpage= new LoginPage(driver);
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(loginpage.loginButton()));
	}
}
