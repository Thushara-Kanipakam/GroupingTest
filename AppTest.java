package com.testng.testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest 
{
	public String baseUrl = "http://newtours.demoaut.com/mercurywelcome.php";
  @Test
  public void f() 
  {
      System.setProperty("webdriver.chrome.driver","C:\\THUSHARA\\ECLIPSEPROJECTS\\testNg\\src\\test\\java\\testExefiles\\chromedriverU.exe" );
      WebDriver driver = new ChromeDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }
}
