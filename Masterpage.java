package com.facebook.genericpage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Masterpage {
	
	//Define Globally webdriver,properties file CLT
	
	public static WebDriver driver;
	
	public Properties prop; 
	public Properties or; 
	public Properties td;
	
	//constructor
	public Masterpage() throws Exception {
		
		//calling configuration properies file
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\facebook\\repository\\configuration.properties");
	
        prop=new Properties();
        
        prop.load(fis);
        

		//calling locators properies file
		FileInputStream rs=new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\facebook\\repository\\locators.properties");
	
        or=new Properties();
        
        or.load(rs);
        

		//calling testdata properies file
		FileInputStream jk=new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\facebook\\repository\\testdata.properties");
	
        td=new Properties();
        
        td.load(jk);
        
        if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
        	 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\chromedriver.driver\\chromedriver.exe");
             
        	 driver=new ChromeDriver();
        
        }
        
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        driver.get(prop.getProperty("url"));
	
	
	}

}
