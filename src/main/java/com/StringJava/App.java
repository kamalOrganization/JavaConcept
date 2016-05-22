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
        FirefoxDriver driver= new FirefoxDriver();
        driver.get("http://google.com");
        String title=driver.getTitle();
        System.out.println("welcome");
    }
	@Test
	public static void method2()
    {
		System.out.println("harish");
    }
	
}
