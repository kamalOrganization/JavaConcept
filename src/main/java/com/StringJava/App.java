package com.StringJava;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	@BeforeClass
    public static void hello( )
    {
        System.out.println( "Hello World!" );
        new FirefoxDriver();
    }
	@Test
	public static void method2()
    {
		System.out.println("harish");
    }
	
}
