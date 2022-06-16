package com.selenium.popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPromptPopUp {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/sharm/Desktop/popups/prompt.html");
	driver.switchTo().alert().sendKeys("99");
	driver.switchTo().alert().accept();
	
}
}
