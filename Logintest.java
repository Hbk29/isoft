package com.facebook.Test;

import org.testng.annotations.Test;

import com.facebook.pages.loginPage;

public class Logintest {
	
	@Test
	public void LogInTest() throws Exception {
		loginPage tst=new loginPage();        //object of loginpage
		
		tst.ClickonEmailorPhone();
		
		tst.enteremail();

		tst.ClickonPassword();
		
		tst.enterpassword();
		
		tst.Screenshot();
		
		tst.clickloginbutton();
		
		tst.Scrrenshot();
	
		
	}

	

}



