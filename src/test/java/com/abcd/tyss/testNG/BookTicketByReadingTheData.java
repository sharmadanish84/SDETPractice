package com.abcd.tyss.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BookTicketByReadingTheData 
{
//run the test case multiple times with different test data
	@Test(dataProvider = "dataprovider_bookTicketTest")
	public void bookTicketTest(String src, String dst) 
	{
		System.out.println("Book Ticket From " + src + " to " + dst);
	}
	//this annotation will always return two dimensional object array
	//so that we can pass any data
	//this annotation helps to create data driven framework for banking and eCommerce
	@DataProvider
	public Object[][] dataprovider_bookTicketTest()
	{
		//row count= 5 represent no of test has to run
		//column count=2 represent the no of argument for each iteration has to be passed
		Object[][] objarr=new Object[5][2];
		objarr[0][0]="Bangaluru";
		objarr[0][1]="Goa";
		
		objarr[1][0]="Bangaluru";
		objarr[1][1]="Mumbai";
		
		objarr[2][0]="Bangaluru";
		objarr[2][1]="Delhi";
		
		objarr[3][0]="Bangaluru";
		objarr[3][1]="Chennai";
		
		objarr[4][0]="Bangaluru";
		objarr[4][1]="Kolkata";
		return objarr;
		
	}
}
