package TestNG;

import org.testng.annotations.Test;

public class priority2 {
	
	@Test(priority=1)
	public void loginTest() 
	{
      System.out.println("sign in");
    }
	
	@Test(priority=-1)
	public void signinTest() 
	{
      System.out.println("submit");
    }
	
	@Test(priority=3)
	public void submit() 
	{
      System.out.println("login");
    }

	
	
	@Test(priority=2)
	public void fillingTest() 
	{
      System.out.println("filling");
    }
	

}
