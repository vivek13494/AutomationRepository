package com.objectrepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class guruhomepage {

		WebDriver d;
	   public guruhomepage(WebDriver d){
		   this.d =d;
	   }
	 @FindBy(how=How.XPATH,using="//td[text()='Manger Id : mngr262074']")
	WebElement mgrid;
	
	public String verifytext(){
		String textfromUI= mgrid.getText();
		String mgrid = textfromUI.substring(12, 22);
		return mgrid;
	}
}


