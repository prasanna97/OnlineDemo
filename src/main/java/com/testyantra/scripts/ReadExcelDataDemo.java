package com.testyantra.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcelDataDemo 
{
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		
//		FileInputStream fin = new FileInputStream("D:\\selenium\\Book.xlsx");
//		Workbook workbook = WorkbookFactory.create(fin);//Object of the file
//		Sheet sheet = workbook.getSheet("Sheet1");
//		String username = sheet.getRow(1).getCell(1).getStringCellValue();
//		String password = sheet.getRow(1).getCell(2).getStringCellValue();
//		System.out.println("The Username is :"+username );
//		System.out.println("The Password is :"+password );
		
//		String filePath = "D:\\selenium\\Book.xlsx";
//		System.out.println("The Username is :"+GenericLib.readFromExcel(filePath, "Sheet1",1,1));
//		System.out.println("The Username is :"+GenericLib.readFromExcel(filePath, "Sheet1",1,2));
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		GenericLib.saveScreenShot(driver, "D:\\selenium\\Seleniumdemo\\Screenshot\\ss1.png");
		Thread.sleep(2000);
    	driver.close();
	}
}
