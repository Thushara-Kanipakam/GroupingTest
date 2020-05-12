package com.testng.TestNGgroup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParellelExecution 
{
	@Test
public void test1()
{
	System.setProperty("webdriver.chrome.driver","C:\\THUSHARA\\ECLIPSEPROJECTS\\testNg\\src\\test\\java\\testExefiles\\chromedriverU.exe" );
    WebDriver driver = new ChromeDriver();
    driver.get("http://demo.guru99.com/V4/");
    //find user name text box and fill it
    driver.findElement(By.name("uid")).sendKeys("Driver 1");
}
	@Test
public void test2()
{
	System.setProperty("webdriver.chrome.driver","C:\\THUSHARA\\ECLIPSEPROJECTS\\testNg\\src\\test\\java\\testExefiles\\chromedriverU.exe" );
    WebDriver driver = new ChromeDriver();
    driver.get("http://demo.guru99.com/V4/");
    //find user name text box and fill it
    driver.findElement(By.name("uid")).sendKeys("Driver 2");
}
}
