package basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFile {

	public static void main(String[] args) throws Exception {
		//set the property of chrome browser and path of chrome driver
	    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
				
		//launching chrome browser instance
		WebDriver driver=new ChromeDriver();
				
		//launching app
		driver.get("https://www.facebook.com/");
		
		//craete file class object
		File src=new File("C:\\Users\\Umesh Patil\\eclipse-workspace\\ISOFTProject\\Object_repo.properies\\Testdata.properties");
		
		//create FileInputstream class object
		FileInputStream fis =new FileInputStream(src);
		
		//create propertis file class object
		Properties pro=new Properties();
		pro.load(fis);
		
		driver.get(pro.getProperty("URL"));
		
		driver.findElement(By.xpath(pro.getProperty("EMAIL"))).sendKeys(pro.getProperty("TESTDATA1"));
		
		driver.findElement(By.xpath(pro.getProperty("password"))).sendKeys(pro.getProperty("TESTDATA2"));
		
		driver.findElement(By.xpath(pro.getProperty("LOGINBUTTON"))).click();

	}

}
