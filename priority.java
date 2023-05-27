package TestNG;

import org.testng.annotations.Test;

public class priority {
	//for excution of testcase as per our demand we can give priority or sequce
	//by default its excuted as per alpha numeric===Filling,login,sign in, submit
	@Test(priority=3)
	public void loginTest() 
	{
      System.out.println("login in");
    }
	
	@Test(priority=1)
	public void signinTest() 
	{
      System.out.println("sign in");
    }
	
	@Test(priority=7)
	public void fillingTest() 
	{
      System.out.println("filling form");
    }
	
	
	@Test(priority=8)
	public void submit() 
	{
      System.out.println("submit");
    }

//after given priority its excuted by ascending order.===1,3,7,8
}