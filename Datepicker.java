package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) throws Exception {
		//set the property of chrome browser and path of chrome driver
	    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
				
		//launching chrome browser instance
		WebDriver driver=new ChromeDriver();
				
		//launching app
		driver.get("https://www.mycontactform.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Sample Forms")).click();
		
		driver.findElement(By.id("q7")).click();
		
		
		Thread.sleep(3000);
		
		//Creating List for date selection
		List<WebElement> dh=driver.findElements(By.tagName("a"));
		
		System.out.println(dh.size());
		
		dh.get(23);
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("29")).click();
		
		
		//creating List for Month selection
		List<WebElement> month=driver.findElements(By.xpath("//select[@class='ui-datepicker-month']/option"));

		month.get(5);
		
		int gh=month.size();
		System.out.println("TOTAL MONTH="+gh);
		
		Thread.sleep(3000);
		
		//Creating List for date selection
		List<WebElement> dh1=driver.findElements(By.tagName("a"));
		
		System.out.println(dh1.size());
		
		dh1.get(23);
		
		Thread.sleep(3000);
		
	
		//date change by common link text
		driver.findElement(By.linkText("29")).click();
		
		
		
	
	
	}

}
