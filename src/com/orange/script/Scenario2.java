package com.orange.script;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.orange.excellibrary.LoginExcel;
import com.orange.page.AddEmployeePage;
import com.orange.page.LoginPage;
public class Scenario2 extends BaseTest
{
	@Test
	public void testScenario2() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginExcel excelData=new LoginExcel("F:/TestData.xlsx","Login");		
		driver.get(excelData.getData(1,0));		
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName(excelData.getData(1,1));
		loginPage.setPassword(excelData.getData(1,2));
		loginPage.clickLogin();
		
		AddEmployeePage add=new AddEmployeePage(driver);
			
		excelData.setSheetName("Add Employee");
		
		add.clickPIM();
		add.clickAddEmployee();
		add.setFirstName(excelData.getData(1,0));
		add.setMiddleName(excelData.getData(1,1));
		add.setLastName(excelData.getData(1,2));
		Thread.sleep(2000);
		add.clickSave();
		add.clickWelcome();
		add.clickLogout();
	}
}
