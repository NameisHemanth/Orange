package com.orange.script;
import org.testng.annotations.Test;

import com.orange.excellibrary.LoginExcel;
import com.orange.page.LoginPage;
import com.orange.page.SearchVacancyPage;
public class Scenario5 extends BaseTest
{
	@Test
	public void testScenario6()
	{
		LoginExcel excelData=new LoginExcel("F:/TestData.xlsx","Login");
		driver.get(excelData.getData(1,0));
			
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName(excelData.getData(1,1));
		loginPage.setPassword(excelData.getData(1,2));
		loginPage.clickLogin();

		SearchVacancyPage search=new SearchVacancyPage(driver);
	
		search.clickRecruitment();
		search.clickVacancies();
		search.clickSearchTitle();
		search.selectTilteOption();
		search.clickVacancy();
		search.selectVacancyOption();
		search.clickHiringManager();
		search.selectHiringManagerOption();
		search.clickStatus();
		search.selectStatusOption();
		search.clickSearch();
		search.clickWelcome();
		search.clickLogout();
	}
}
