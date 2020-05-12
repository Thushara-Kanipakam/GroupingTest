package com.testng.TestNGgroup;

import org.testng.annotations.Test;
public class  GroupingTest 
{
	@Test(groups = {"Tom"})
	
public void test1()
{
	System.out.println("Test1 passed");
}
	@Test(groups = {"Tom","Jerry"})
public void test2()
{
	System.out.println("Test2 passed");
}
	@Test(groups = {"Tom","Dora"})
public void test3()
{
	System.out.println("Test3 passed");
}
	@Test
public void test4()
{
	System.out.println("Test4 passed");
}
}
