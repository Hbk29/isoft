package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Droplist {

	public static void main(String[] args) throws Exception {
	    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Sample Forms")).click();
		
		//1st option
		driver.findElement(By.id("q9")).sendKeys("India");
		
		Thread.sleep(3000);
		//2nd method ==by creating list of common xpath and ref.get(Index).click()
        
		List<WebElement> kk=driver.findElements(By.xpath("//select[@name='q9']/option"));
		System.out.println(kk.size());  //size of all element
		kk.get(5).click();              //ref.get(Index).click();
		
		kk.get(10).isSelected();        //false
		
		
		Thread.sleep(3000);
		//3rd method
		WebElement a=driver.findElement(By.id("q9"));
		a.sendKeys("Egypt");
		
		
		Thread.sleep(3000);
		//4th method===Recommended  by using Select class
		WebElement b=driver.findElement(By.id("q9"));
		
		//create select classs object
		Select s=new Select(b);
		
		Thread.sleep(3000);
		
		//select by index
		s.selectByIndex(2);
		
		
		Thread.sleep(3000);
		
		//Select by value
		s.selectByValue("Angola");
		
		
		Thread.sleep(3000);
		
		//select by visible text
		s.selectByVisibleText("Bahama");
		
		System.out.println(s.getFirstSelectedOption().getText());
		

		
		
		
		
	}

}
