package TestNG;

public class Assertions {
	
	//Assertions are checkpoint or Validation point
	//Assertions are used to check whether testcase is paased or failed for given condition
	//Assertion has boolean confition.
	//check at this , testcase is passes or fails
	
	//2 types of assertions
	//1. hard assertion===if testcase not satisfy the condition then next logic not excute
	//it gives error message
	
   //Assert.assertTrue(Boolean condition)
   //Assert.assertFalse(Boolean condition)
 //Assert.assertEqual(Boolean condition)
//Assert.assertNull(Boolean condition)
	
	//2.Soft assertion===when we want excute 2nd logic even 1st logic fails then 
	//we use soft asssertion
	
	//create object of soft assert
	
	//@Test
	//SoftAssert ref=new SoftAssert();      //objejct
	
    //ref.assertTrue(Boolean cond)
	//ref.assertFalse(Boolean cond)
	//ref.assertEqual(Boolean cond)
	
	//at the end
	//Softassert.assertAll()

}
