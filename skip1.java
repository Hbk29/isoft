package TestNG;

import org.testng.annotations.Test;

public class skip1 {
 //how to skip test
//	1.@Test(enabled=false)   //	2.@Test(envocationCount=0)
//  3. throw new skipException("")     4.comment it
	
	//skip a,c,e,g method
	
	@Test(enabled=false)              //1st ways
	public void a() 
	{
      System.out.println("a method");
    }
	
	@Test
	public void b() 
	{
      System.out.println("b mehod");
    }
	
	@Test
	public void g() 
	{
      System.out.println("g method");
    }
	
	
	@Test
	public void f() 
	{
      System.out.println("f method");
    }

	//@Test
	public void e() 
	{
	
      System.out.println("e method");
    }
	
	@Test
	public void d() 
	{
      System.out.println("d method");
    }
	
	@Test(invocationCount=0)               //2nd way
	public void c() 
	{
      System.out.println("c method");
    }
	
	
	@Test
	public void h() 
	{
      System.out.println("h method");
    }
}
