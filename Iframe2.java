package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {

	public static void main(String[] args) {
		//set the property of chrome browser and path of chrome driver
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
				
				//launching chrome browser instance
				WebDriver driver=new ChromeDriver();
				
				//launching app
				driver.get("https://letcode.in/frame/");
				
				//total list of frames
				List<WebElement> a=driver.findElements(By.tagName("iframe"));
				
				System.out.println(a.size());
				
				driver.switchTo().frame("firstFr");
				
				driver.findElement(By.name("fname")).sendKeys("ajay");
				
				driver.findElement(By.name("lname")).sendKeys("jadeja");
				
				WebElement k=driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div/iframe"));
				
			
				driver.switchTo().frame(k);
			    
				driver.findElement(By.name("email")).sendKeys("hbkhbk");
				
				//swith to parent frame
				driver.switchTo().parentFrame();
				
				//switch to main page
				driver.switchTo().defaultContent();
				
				//using int frame
				
				List<WebElement> b=driver.findElements(By.tagName("iframe"));
				
				for(int i=0;i<b.size();i++);
				driver.switchTo().frame(4);
			
				
				
				
				

	}

}
