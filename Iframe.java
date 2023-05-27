package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		//set the property of chrome browser and path of chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		
		//launching chrome browser instance
		WebDriver driver=new ChromeDriver();
		
		//launching app
		driver.get("https://letcode.in/frame/");
		
		
		//size of all frames
      List<WebElement> allframe=driver.findElements(By.tagName("iframe"));
      System.out.println(allframe.size());
      
     //Swicth to main frame(parent)
      driver.switchTo().frame("firstFr");
      
      driver.findElement(By.name("fname")).sendKeys("ajay");
      
      //SWITCH TO CHILD FRAME
      WebElement d=driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div/iframe"));
      
      driver.switchTo().frame(d);
      
      driver.findElement(By.name("email")).sendKeys("abc");
      
      //Swith to parent frame
      driver.switchTo().parentFrame();
      
      driver.findElement(By.name("lname")).sendKeys("jahaha");
      
      //Swith to main page
      driver.switchTo().defaultContent();
		

	}

}
