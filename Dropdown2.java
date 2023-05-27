package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown2 {

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
		
		//3rd way===creating List
		List<WebElement> kk=driver.findElements(By.xpath("//select[@name='q9']/option"));
		
		Thread.sleep(2000);
		kk.get(50);      //ref.size();
		
		//size of dropdown
		System.out.println(kk.size());
		
		Thread.sleep(2000);
		//5th way= Unique way
		String p="India";
		
		for(int i=0;i<kk.size();i++)
		{
			if(kk.get(i).getText().equalsIgnoreCase(p)) 
			{
				kk.get(i).click();
			}
		}

	}

}
