package com.abcd.tyss.testNG;

import org.testng.annotations.Test;

public class GroupExecution01 {
   @Test(groups = "ADHOCtesting")
	public void g1testCase_01Test() {
		System.out.println("testcase_01 executed");
	}
   @Test(groups = "Integretiontesting")
	public void g1testCase_02Test() {
		System.out.println("testcase_02 executed");
	}
   @Test(groups = "Smoketesting")
	public void g1testCase_03Test() {
		System.out.println("testcase_03 executed");
	}
   @Test(groups = "Regressiontesting")
	public void g1testCase_04Test() {
		System.out.println("testcase_04 executed");
	}
}
