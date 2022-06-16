package com.abcd.tyss.testNG;

import org.testng.annotations.Test;

public class Forest {
	@Test(priority = 05)
	public static void lionTest() {
		System.out.println("lion is the king of the forest");
	}
	@Test(priority = 02)
	public static void tigerTest() {
		System.out.println("tiger is the king of the forest");
	}
	@Test(priority = 00)
	public static void buffaloTest() {
		System.out.println("buffalo is the king of the forest");
	}
	@Test(priority = 03)
	public static void rhinoTest() {
		System.out.println("rhino is the king of the forest");
	}
	@Test(priority = 01)
	public static void giraffeTest() {
		System.out.println("giraffe is the king of the forest");
	}
	@Test(priority = 04)
	public static void peacockTest() {
		System.out.println("peacock is the king of the forest");
	}
}
