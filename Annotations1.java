package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations1 {
	
	//TestNG DOES NOT HAVE MAIN METHOD
	//@Test is test case==there are 2 testcase which excuted as per alpha numeric order
	// other annotation excuted as per order even its randomly placed
	//2 test case===2 pass, or 2 fail, or 1 pass n 1 fail, or skip
	//project==output folder===index.html or emailable report.html
	//report of testcase either pass, faill, skip
	@Test
	public void a()
	{
		System.out.println("testcase1");
	}
	
	@BeforeMethod
	public void b()
	{
		System.out.println(" b method");
	}
	
	@AfterMethod
	public void c()
	{
		System.out.println(" C method");
	}
	
	@BeforeSuite
	public void d()
	{
		System.out.println(" D method");
	}
	
	@BeforeClass
	public void e1()
	{
		System.out.println(" E method");
	}
	
	@AfterSuite
	public void f()
	{
		System.out.println(" F method");
	}
	
	@AfterClass
	public void g()
	{
		System.out.println(" G method");
	}

	@AfterTest
	public void h()
	{
		System.out.println(" H method");
	}

	@BeforeTest
	public void i()
	{
		System.out.println(" I method");
	}
	
	@Test
	public void e() {
		System.out.println("2ND TEST CASE");
	}

//d,i,e1,b,Testcase1,c,b,Testcase2,c,g,h,f
}
