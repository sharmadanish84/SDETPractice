package com.selenium.popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUps {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//unhandeledAlertException - seleNium -unchecked exception
	//without handling it we cannot exceed further
	driver.get("file:///C:/Users/sharm/Desktop/popups/alertpopup.html");
	//handling alert popUps
	//driver.switchTo().alert().accept();
	String alertPopUpText = driver.switchTo().alert().getText();
	System.out.println(alertPopUpText);
	driver.switchTo().alert().dismiss();
	driver.manage().window().maximize();
	
}
}
