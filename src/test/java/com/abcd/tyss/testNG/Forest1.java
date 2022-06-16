package com.abcd.tyss.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Forest1 {
	@BeforeClass
	public static void loginTest() {
		System.out.println("lion is the king of the forest");
	}
	@BeforeMethod
	public static void tigerTest() {
		System.out.println("tiger is the king of the forest");
	}
	@Test(priority = 01)
	public static void buffaloTest() {
		System.out.println("buffalo is the king of the forest");
	}
	@AfterMethod
	public static void rhinoTest() {
		System.out.println("rhino is the king of the forest");
	}
	@Test(priority = 00)
	public static void giraffeTest() {
		System.out.println("giraffe is the king of the forest");
	}
	@AfterClass
	public static void logoutTest() {
		System.out.println("peacock is the king of the forest");
	}
}
