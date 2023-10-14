package com.myprojectTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_1 {
	public void loggin_test() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver ();
		driver.manage().window().maximize();
		
		driver.get("https://github.com");
		
		Assert.assertEquals(driver.getTitle(),"GitHub");
		driver.close();
	}

}
