package com.trello.tyss.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

import com.trello.tyss.pomrepositorylibrary.LoginPage;
import com.trello.tyss.pomrepositorylibrary.LogoutPage;

public class BaseClass {
 public WebDriver driver;
 public static WebDriver webdriver;
 public FileUtility filelib=new FileUtility();
 public WebDriverUtility weblib= new WebDriverUtility();
 
 @BeforeClass
 public void configBeforeClass() throws Throwable{
	String browserName= filelib.propertyFile("browser");
	//runtime pollymorPhism. choosing browser dynamically
	if (browserName.equals("chrome")) {
		driver=new ChromeDriver();
		webdriver=driver;
	} else if(browserName.equals("edge")){
       driver=new EdgeDriver();
       webdriver=driver;
	}
	driver.manage().window().maximize();
	weblib.implicitlywait(driver);
	String URL=filelib.propertyFile("url");
	driver.get(URL);
	
}
 public void configBeforeMethod() throws IOException{
	 String userName = filelib.propertyFile("username");
	 LoginPage loginpage = new LoginPage(driver);
	 loginpage.loginStep_01(userName);
 }
 public void configAfterMethod() throws IOException,Throwable{
	 LoginPage loginpage = new LoginPage(driver);
	 String passWord = filelib.propertyFile("password");
	 Thread.sleep(5000);
	 loginpage.loginStep_02(passWord);
	 String homePageTitle = driver.getTitle();
	 System.out.println("home Page Title is "+ homePageTitle);
	 LogoutPage logoutpage=new LogoutPage(driver);
	 logoutpage.logout();
 }
 public void configAfterClass() {
	 driver.quit();
 }
}
