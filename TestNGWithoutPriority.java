package com.testng.TestNGgroup;

import org.testng.annotations.Test;

public class TestNGWithoutPriority 
{
	@Test(priority = 1)
	public void test1()
	{
		System.out.println("A");
	}
	@Test(priority = 4)
	public void test2()
	{
		System.out.println("Z");
	}
	@Test(priority = 3)
	public void test3()
	{
		System.out.println("T");
	}
	@Test(priority = 2)
	public void test4()
	{
		System.out.println("E");
	}
	
}
