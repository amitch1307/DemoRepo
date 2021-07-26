package com.maven.demo.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void demo1add()
	{
		System.out.println("total sum on demo1 add");
		int a=20;
		int b=10;
		Assert.assertEquals(30, a+b);
		
		
	}
	@Test
	public void demo1sub()
	{
		System.out.println("total sub on demo1 sub");
		int a=20;
		int b=10;
		Assert.assertEquals(10, a-b);	
	}
	
	
	
}
