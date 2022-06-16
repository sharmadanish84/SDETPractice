package com.abcd.tyss.testNG;

import org.testng.annotations.Test;
//read the data from different class by@dataProvider annotation
public class DataProviderInAnotherClass 
{
    @Test(dataProvider = "ticketData",dataProviderClass = DataProviderClass.class)
	public void bookTicketTest(String src, String dst, int tickets)
   {
	  System.out.println("execute source=> " +src + ", Destination =>" +dst);
   }
}
