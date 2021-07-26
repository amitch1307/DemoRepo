package com.maven.demo.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {

	@Test
	public void demo1mul()
	{
		System.out.println("total mul on demo1 add");
		int a=20;
		int b=10;
		Assert.assertEquals(200, a*b);
		
		
	}
	@Test
	public void demo1div()
	{
		System.out.println("total div on demo1 sub");
		int a=20;
		int b=10;
		Assert.assertEquals(2, a/b);	
	}
	
	
	
}
