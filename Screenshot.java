package basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		//set the property of chrome browser and path of chrome driver
	    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
				
		//launching chrome browser instance
		WebDriver driver=new ChromeDriver();
				
		//launching app
		driver.get("https://www.mycontactform.com/");
		
		//T f f F 
		TakesScreenshot tc=(TakesScreenshot) driver;
		
		File srs=tc.getScreenshotAs(OutputType.FILE);
		
		File folder=new File("C:\\Users\\Umesh Patil\\Desktop\\resume\\name.jpeg");
	
	    FileHandler.copy(srs, folder);
		
		

	}

}
