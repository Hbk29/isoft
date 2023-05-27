package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class skip2 {
	//TASK=== SKIP 2ND TEST CASE
	@BeforeMethod
	public void envsetup() {
		
		System.out.println("setting proprty and browser open");
		
	}
	
	@Test(priority=1,enabled=false)        //it is skip...but not showing in report
	public void T2() {
		System.out.println("2nd testcase");
	}
	@Test(priority=-2)
	public void T1() {
		System.out.println("1ST TESTCASE");
	}
	
	
	@AfterMethod
	public void close() {
		
		System.out.println("app close");
		
	}
	
	@Test
	public void T3() {
		System.out.println("3rd testcase");
	}

}
