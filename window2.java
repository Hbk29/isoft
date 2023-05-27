package basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window2 {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://letcode.in/windows/");
		 
		 driver.findElement(By.id("home")).click();
		 
		 driver.findElement(By.id("multi")).click();
		 
		 Set<String> pl=driver.getWindowHandles();
		 System.out.println(pl);
			
		 Iterator<String> hbk=pl.iterator();
			String window11=hbk.next();  //parent
			String window21=hbk.next();
			String window31=hbk.next();
			
			driver.switchTo().window(window21);
			driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/footer")).click();
			
			driver.switchTo().defaultContent();
			
			driver.switchTo().window(window31);
			
            
			driver.findElement(By.xpath("//a[text()='Sign up']")).click();
	}

}
