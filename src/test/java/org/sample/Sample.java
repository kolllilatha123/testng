package org.sample;


import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.LogOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

public class Sample {

	WebDriver driver;
	

	@Test(groups= {"smoke","regression"})
private void logi() {
	// TODO Auto-generated method stub
		System.out.println("hello world");
//Assert.assertEquals(12, 13);

	}
	@Test(groups="adhoc")
	private void te() {
		// TODO Auto-generated method stub
		System.out.println("hello koli");
	}
	
	@Test(groups="smoke")
	private void te11() {
		// TODO Auto-generated method stub
		System.out.println("hello latha");
	}
	/*
	@Test
	private void startup() {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//String curl=driver.getCurrentUrl();
		//Assert.assertTrue(curl.contains("facebook.com"));
	}
	
	@Test(dependsOnMethods="startup")
	private void loginap() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kollilatha97@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("kollilatha");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	
	}
	*/
	@Test(groups="adhoc")
	private void logoutapp() {
		// TODO Auto-generated method stub
		//System.out.println("logout application");
	}
	

}
