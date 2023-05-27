package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkboxDropdown {

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
		
		//Check box and click
		driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[3]")).click();
	
		//sendkeys into textbox using id locator.
		driver.findElement(By.id("subject")).sendKeys("Hbk");
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.id("q1")).sendKeys("anything");
		
		//dropdown(droplist)
		// 1st way
		driver.findElement(By.id("q3")).sendKeys("Second option");
		
		//2nd way
		WebElement dd=driver.findElement(By.id("q3"));
		 
		dd.click();
		
		//3rd way==Using Select class <Recommended>
		Thread.sleep(2000);
		Select ss=new Select(dd);
		
		Thread.sleep(2000);
		ss.selectByIndex(3);
		
		Thread.sleep(2000);
		ss.selectByVisibleText("First Option");
		
		Thread.sleep(2000);
		ss.selectByValue("Fourth Option");
		
	    //3rd way
		Thread.sleep(2000);
		WebElement dd1=driver.findElement(By.id("q3"));
		dd1.sendKeys("First Option");
		
		//print current selected option
	    System.out.println(ss.getFirstSelectedOption().getText());
	    
	    
		
		
		
		
	
	
	
	
	}

}
