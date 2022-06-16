package com.abcd.tyss.testNG;

import org.testng.annotations.Test;

public class DisableMethodFromExecution {
	@Test
public void atestCase_01Test() {
	System.out.println("testcase_01 executed");
}
	@Test
public void btestCase_02Test() {
	System.out.println("testcase_02 executed");
}
	@Test(enabled = false)
public void ctestCase_03Test() {
	System.out.println("testcase_03 executed");
}
	@Test
public void dtestCase_04Test() {
	System.out.println("testcase_04 executed");
}
}
