package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTABLE {

	public static void main(String[] args) {
		//set the property of chrome browser and path of chrome driver
	    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
				
		//launching chrome browser instance
		WebDriver driver=new ChromeDriver();
				
		//launching app
		driver.get("https://letcode.in/table/");
		
		//print all head in rows
		WebElement d=driver.findElement(By.xpath("//table[@id='simpletable']"));
		
		List<WebElement> k=d.findElements(By.tagName("th"));
		
		for(WebElement m:k) {
			String txt=m.getText();
			System.out.println(txt);
			
		}
		
		//print all rows of 
		List<WebElement> j=d.findElements(By.tagName("tr"));
		
		for(WebElement p:j) {
			String txt1=p.getText();
			System.out.println(txt1);
			
			
		}

	}

}
