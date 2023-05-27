package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		//set the property of chrome browser and path of chrome driver
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
				
				//launching chrome browser instance
				WebDriver driver=new ChromeDriver();
				
				//launching app
				driver.get("https://www.mycontactform.com/");
				
				Thread.sleep(3000);
			    driver.findElement(By.linkText("Sample Forms")).click();
				
				driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[2]")).click();
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[3]")).click();
				
				//dropdown
				
				//1st method
				driver.findElement(By.id("q3")).sendKeys("Second option");
				
				//2nd method==unique way
				
				List<WebElement> ref=driver.findElements(By.id("q3"));
				
				System.out.println(ref.size());
	
				//3rd way
				WebElement rc=driver.findElement(By.id("q3"));
				
				Select tre=new Select(rc);
				
				tre.selectByIndex(0);
				Thread.sleep(3000);
				
				tre.selectByVisibleText("Second option");
				
				Thread.sleep(3000);
				tre.selectByValue("2");
		
				
				
				
		        
		        
				
				
				

	}

}
