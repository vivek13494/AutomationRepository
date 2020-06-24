package com.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class guruloginpage {

	WebDriver d;
	public guruloginpage(WebDriver d){
		this.d=d;
		
	}
	@FindBy(how=How.NAME,using="uid")
	WebElement userid;
	@FindBy(how=How.NAME,using="password")
	WebElement password;
	@FindBy(how=How.NAME,using="btnlogin")
	WebElement login;
	
	public String enteruserid(String id){
		userid.sendKeys(id);
		return id;
		
	}
	public void enterpassword(String pwd){
		userid.sendKeys(pwd);
	}
	public void clickbtn(){
		login.click();
	}
}
