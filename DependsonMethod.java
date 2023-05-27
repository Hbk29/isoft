package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonMethod {
	
	@Test                
	public void T3() {
		Assert.assertFalse(3>11);                //cond is true
			System.out.println("3RT TESTCASE");
		}
		
	@Test(dependsOnMethods="T3")                //it will excute
	public void T4() {                       
			System.out.println("4TH TESTCASE");
		}
	@Test                              //its fail testcase THEN NEXT WILL skip
	public void T1() {
		Assert.assertTrue(3>11);
		System.out.println("1ST TESTCASE");
	}
	
	@Test(dependsOnMethods="T1")       //skip
	public void T2() {                       
		System.out.println("2nd TESTCASE");
		
		//4 Testcase
		//T3 PASS===SO T4 CHECK
		//T1 FAIL===SO T2 SKIP
		
		//REPORT   2 PASS 1 FAIL 1 SKIP
		

		
	}
	

}
