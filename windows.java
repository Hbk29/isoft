package basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://letcode.in/windows/");
	 
	 driver.findElement(By.id("home")).click();
	 
	 //Every window has unique id==window id
	 String wh=driver.getWindowHandle();
	 System.out.println(wh);
	 
	 //title of window
	 System.out.println(driver.getTitle());
	 
	 //id of all active windows
	Set<String> op= driver.getWindowHandles();
	System.out.println(op);
	
	
	//size of windows
	int k=op.size();
	System.out.println(k);

	//set method doesnt have get index method, so we use Itrator class
	Iterator<String> bp= op.iterator();
	
	//storing window in string
	String window1=bp.next();
	String window2=bp.next();
	
	driver.switchTo().window(window2); 
	
	driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/footer")).click();
	
	//id of child window
	System.out.println(window2);
	
	//title of child window
	System.out.println(driver.getTitle());
	
	//back to parent window
	driver.switchTo().window(window1);
	
	//switch window using get index method
	List<String> wh1= new ArrayList <String>(op);
	driver.switchTo().window(wh1.get(2));
	driver.close();
	}

}
