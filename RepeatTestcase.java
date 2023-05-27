package TestNG;

import org.testng.annotations.Test;

public class RepeatTestcase {
	//how to repeat test case==by invocationcount=2,3.
	
	//now this test will excute 3 times
	@Test(invocationCount=3)                  //3 times
	public void T1() {
		System.out.println("1ST TESTCASE");
	}
	
	@Test
	public void T2() {                       //1 time
		System.out.println("2nd TESTCASE");
	}
	
	

}
