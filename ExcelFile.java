package basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFile {

	public static void main(String[] args) throws Exception {
		//set the property of chrome browser and path of chrome driver
	    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
				
		//launching chrome browser instance
		WebDriver driver=new ChromeDriver();
				
		//launching app
		driver.get("https://www.mycontactform.com/");
		
		//craete file class object
		File src=new File("C:\\Users\\Umesh Patil\\Desktop\\JAVA.xlsx");
				
		//create FileInputstream class object
		FileInputStream fis =new FileInputStream(src);
		
		XSSFWorkbook bs=new XSSFWorkbook(fis);
		
		XSSFSheet sh=bs.getSheet("sheet1");
		
		String k=sh.getSheetName();
		System.out.println(k);
		
		System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
		
		System.out.println(sh.getPhysicalNumberOfRows());
		
		System.out.println(sh.getRow(1).getPhysicalNumberOfCells());

	}

}
