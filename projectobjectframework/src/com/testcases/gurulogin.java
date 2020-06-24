package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.objectrepository.guruhomepage;
import com.objectrepository.guruloginpage;

public class gurulogin extends gurulogintest{
	@Test
	public void guruLoginAction()
	{
		guruloginpage glpage = PageFactory.initElements(d, guruloginpage.class);
		guruhomepage ghpage = PageFactory.initElements(d, guruhomepage.class);
		String userid = glpage.enteruserid("mngr262074");
		glpage.enterpassword("yzumese");
		glpage.clickbtn();
		String mgrid = ghpage.verifytext();
		Assert.assertEquals(userid, mgrid, "verifed the manager");
		
		
		
	}

}
