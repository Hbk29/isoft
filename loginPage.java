package com.facebook.pages;

import com.facebook.genericpage.commonMethods;

public class loginPage extends commonMethods{

	public loginPage() throws Exception {
		super();

	}
	
	public void ClickonEmailorPhone() {
		click("EmailorPhone");
	}
	
	public void enteremail() {
		enterdata("EmailorPhone","Testdata1");
	}
	
	public void ClickonPassword() {
		click("Password");
	}

	public void enterpassword() {
		enterdata("Password","Testdata2");
		
	}
	
	public void clickloginbutton() {
		click("Loginbutton");
	}
	
	public void Scrrenshot() throws Exception {
		Screenshot();
	}
	
	
}
