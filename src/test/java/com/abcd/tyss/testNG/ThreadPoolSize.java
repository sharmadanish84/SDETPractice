package com.abcd.tyss.testNG;

import org.testng.annotations.Test;

public class ThreadPoolSize {
@Test(invocationCount = 3,threadPoolSize = 03)
public void testThreadPool() {
	System.out.printf("thread id:%s%n",Thread.currentThread().getId());
	System.out.println("threads of java allows a program to operate more efficiently by doing multiple things at same time");
}
@Test(invocationCount = 03)
public void WithOutThreadPool() {
	System.out.println("check my exception time in html report");
}
}
