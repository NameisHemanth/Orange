package com.orange.script;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.orange.excellibrary.LoginExcel;
import com.orange.page.DeleteVacancies;
import com.orange.page.LoginPage;
public class Scenario6 extends BaseTest
{
	@Test
	public void testScenario5() throws EncryptedDocumentException, InvalidFormatException, IOException
	{	
		LoginExcel excelData=new LoginExcel("F:/TestData.xlsx","Login");
		driver.get(excelData.getData(1,0));
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName(excelData.getData(1,1));
		loginPage.setPassword(excelData.getData(1,2));
		loginPage.clickLogin();

		
		DeleteVacancies delete=new DeleteVacancies(driver);
	
		delete.clickRecruitment();
		delete.clickvacancies();
		delete.selectCheckBox();
		delete.clickDelete();
		delete.clickOk();		
		delete.clickWelcome();
		delete.clickLogout();
	}
}
