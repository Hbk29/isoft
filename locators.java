package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws Exception {
		//set the property of chrome browser and path of chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		
		//launching chrome browser instance
		WebDriver driver=new ChromeDriver();
		
		//launching app
		driver.get("https://www.mycontactform.com/");
		
		//how to use linktext==its locators, identified by a=ancher link, its open another page
        //we take word which above link
		
		Thread.sleep(3000);
	    driver.findElement(By.linkText("Sample Forms")).click();	
	    
	    //by id===first prefrence
	    driver.findElement(By.id("subject")).click();
	    
		Thread.sleep(3000);
	    driver.findElement(By.id("email")).click();
	    
	    //sendkeys
		Thread.sleep(3000);
	    driver.findElement(By.id("subject")).sendKeys("ajay");
	   
	    
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("email");
		
		//by xpath
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		driver.findElement(By.id("q2")).sendKeys("hi i am vijay");
	
	}

}
