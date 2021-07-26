package com.maven.demo.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Demo3chromebrowser {

	
	@Test
	public void chromebrowser()
	{
		ChromeDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
	driver.get("http://172.16.1.32/ALiSNJDOH2TESTING11.0.114/LoginNJDOH.aspx");
	String gettitle = driver.getTitle();
	System.out.println("Title of Alispage ::" +gettitle);
	
		
	}

}
