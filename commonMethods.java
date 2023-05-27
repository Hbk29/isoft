package com.facebook.genericpage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class commonMethods extends Masterpage {
	
	public commonMethods() throws Exception {
		super();
		
	}

	public void click(String xpath) {
		driver.findElement(By.xpath(or.getProperty(xpath))).click();
		
	}
	
	public void enterdata(String xpath,String Testdata) {
		driver.findElement(By.xpath(or.getProperty(xpath))).sendKeys(td.getProperty(Testdata));
	}
	
	public void clear(String xpath) {
		driver.findElement(By.xpath(xpath)).clear();
	}

	public void clickonListElement(String xpath, String Testdata) {
		List<WebElement> it=driver.findElements(By.xpath(or.getProperty(xpath)));
		it.size();
		
		for(int i=0;i<it.size();i++) {
			if(it.get(i).getText().equalsIgnoreCase(td.getProperty(Testdata))) {
				it.get(i).click();
				break;
			}
			
		}
	}
	public void MovetoElement(String xpath) {
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath(or.getProperty(xpath)))).build().perform();
		
	}
		public void Screenshot() throws Exception {
			TakesScreenshot sc=(TakesScreenshot)driver;
			
			File src=sc.getScreenshotAs(OutputType.FILE);
			
			File folder=new File("C:\\Users\\Umesh Patil\\Desktop\\resummeeeee\\New folder.jpeg");
			
			FileHandler.copy(src, folder);
			
			System.out.println("screenshot taken");
			
		}
}
