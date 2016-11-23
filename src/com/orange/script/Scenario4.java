package com.orange.script;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.orange.excellibrary.LoginExcel;
import com.orange.page.AddVacanciesPage;
import com.orange.page.LoginPage;
public class Scenario4 extends BaseTest
{
	@Test
	public void testScenario4() throws EncryptedDocumentException, InvalidFormatException, IOException
	{		
		LoginExcel excelData=new LoginExcel("F:/TestData.xlsx","Login");
		driver.get(excelData.getData(1,0));		
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName(excelData.getData(1,1));
		loginPage.setPassword(excelData.getData(1,2));
		loginPage.clickLogin();

		
		AddVacanciesPage add=new AddVacanciesPage(driver);
		excelData.setSheetName("Add Vacancy");
		add.clickRecruitment();
		add.clickvacancies();
		add.clickAdd();
		add.selectOption(excelData.getData(1,0));
		add.setVacancyName(excelData.getData(1,1));
		add.setHiringManager(excelData.getData(1,2));
		add.clickSave();
		add.clickWelcome();
		add.clickLogout();
	}
}
