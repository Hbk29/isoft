package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

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
		
		Thread.sleep(3000);
		//1st way
		driver.findElement(By.xpath("//input[@value='First Option']")).click();
		
		Thread.sleep(3000);
		//2nd way
		List<WebElement>ref=driver.findElements(By.id("q4"));
		ref.get(2).click();
		
		//print total no of radio buttons
		System.out.println(ref.size());
		
		Thread.sleep(3000);
		//by cssselector= unique attr other than locators
		driver.findElement(By.cssSelector("Second Option")).click();
		
		//3rd way==unique way
		Thread.sleep(3000);
		
		String k="Fourth Option";
		
		List<WebElement> jk=driver.findElements(By.name("q4"));
		
		for(int i=0;i<jk.size();i++) 
		{
			if(jk.get(i).getText().equalsIgnoreCase(k)) 
			{
				jk.get(i).click();
			
			}
		}
		

	}

}
