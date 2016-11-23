package com.orange.script;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.orange.excellibrary.LoginExcel;
import com.orange.page.DeleteEmployeePage;
import com.orange.page.LoginPage;
public class Scenario3 extends BaseTest
{
	@Test
	public void testScenario3() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginExcel excelData=new LoginExcel("F:/TestData.xlsx","Login");
		driver.get(excelData.getData(1,0));
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName(excelData.getData(1,1));
		loginPage.setPassword(excelData.getData(1,2));
		loginPage.clickLogin();

		DeleteEmployeePage delete=new DeleteEmployeePage(driver);

		delete.clickPIM();
		delete.clickEmployeeList();
		Thread.sleep(2000);
		delete.selectCheckBoxToDelete();
		delete.clickDelete();
		Thread.sleep(2000);
		delete.clickOk();			
		Thread.sleep(2000);
		delete.clickWelcome();
		delete.clickLogout();
	}
}



