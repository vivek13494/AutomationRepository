package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class gurulogintest {
	public static WebDriver d=null;
	@BeforeSuite
	public void initialize(){
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://demo.guru99.com/V4");
		
	}
	@AfterSuite
	public void closebrowser(){
		d.close();
	}
	

}
