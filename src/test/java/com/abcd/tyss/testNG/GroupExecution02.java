package com.abcd.tyss.testNG;

import org.testng.annotations.Test;

public class GroupExecution02 {
	 @Test(groups = "Smoketesting")
		public void g2testCase_01Test() {
			System.out.println("testcase_01 executed");
		}
	   @Test(groups = "Regressiontesting")
		public void g2testCase_02Test() {
			System.out.println("testcase_02 executed");
		}
	   @Test(groups = "ADHOCtesting")
		public void g2testCase_03Test() {
			System.out.println("testcase_03 executed");
		}
	   @Test(groups = "Integretiontesting")
		public void g2testCase_04Test() {
			System.out.println("testcase_04 executed");
		}
}
