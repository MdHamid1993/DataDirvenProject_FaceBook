package com.fbRegistrationTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.FB_Utilities.ExcelUtiles;
import com.fbRegistrationPage.Fb_RegistrationPage;

import BaseTEST.BaseTest;

public class FB_RegistrationTest extends BaseTest {

	WebDriver driver;
	
	@BeforeTest
	public void init() {
		
		driver= openApp();
		//driver=openChrome();
		//driver=openEdge();
		//driver= openFirefox()
		
	}
	
	
	@Test
	public void registation() throws InterruptedException {
		
		String filePath = "src/test/resources/data.xlsx";
		String sheetName = "sheet1";
		ExcelUtiles ex = new ExcelUtiles(filePath, sheetName);
		
		  
		Fb_RegistrationPage r = new Fb_RegistrationPage(driver);
		r.getcreateAccount();
		r.getFirstname(ex.getstringCellData(1, 0));
		r.getLastName(ex.getstringCellData(1, 1));
		r.getmobileNumber(ex.getstringCellData(1, 2));
		r.getmoREbileNumber(ex.getstringCellData(1, 3));
		r.getPass(ex.getstringCellData(1, 4));
		r.getDay(ex.getstringCellData(1, 5));
		r.getMonth(ex.getstringCellData(1, 6));
		r.getYear(ex.getstringCellData(1, 7));
		r.getMale();
		
	}
	
	
}
