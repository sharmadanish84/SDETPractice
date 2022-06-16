package com.abcd.tyss.testNG;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name = "ticketData")
public Object[][] bookticketDataProvider()
    {
	Object[][] objarr=new Object[5][3];
	objarr[0][0]="Bangaluru";
	objarr[0][1]="Goa";
	objarr[0][2]=10;
	
	objarr[1][0]="Bangaluru";
	objarr[1][1]="Mumbai";
	objarr[1][2]=20;
	
	objarr[2][0]="Bangaluru";
	objarr[2][1]="Delhi";
	objarr[2][2]=15;
	
	objarr[3][0]="Bangaluru";
	objarr[3][1]="Kolkata";
	objarr[3][2]=8;
	
	objarr[4][0]="Bangaluru";
	objarr[4][1]="Chennai";
	objarr[4][2]=13;
	
	return objarr;
	}

}
