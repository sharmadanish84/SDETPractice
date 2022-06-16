package com.selenium.popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sharm/Desktop/popups/confirmation.html");
		String confirmation = driver.switchTo().alert().getText();
		System.out.println(confirmation);
		driver.switchTo().alert().dismiss();
		driver.quit();
	}
}
