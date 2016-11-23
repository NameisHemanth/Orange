package com.orange.script;
import org.testng.annotations.Test;
import com.orange.excellibrary.LoginExcel;
import com.orange.page.AddKeyPeformanceIndicatorPage;
import com.orange.page.LoginPage;

public class Scenario13 extends BaseTest
{
	@Test
	public void testScenario12()
	{
		LoginExcel excelData=new LoginExcel("F:/TestData.xlsx","Login");
		driver.get(excelData.getData(1,0));
		
		LoginPage login=new LoginPage(driver);
		login.setUserName(excelData.getData(1,1));
		login.setPassword(excelData.getData(1,2));
		login.clickLogin();
		
		AddKeyPeformanceIndicatorPage performance=new AddKeyPeformanceIndicatorPage(driver);
		performance.clickPerformance();
		performance.clickConfigure();
		
		performance.clickKpis();
		performance.clickAddKpis();
		performance.selectJobTitle("IT Manager");
		performance.setKeyPerformanceIndicator("Test Cases");
		performance.setMinimumRating("1");
		performance.setMaximumRating("5");
		performance.clickSave();
		
		performance.clickWelcome();
		performance.clickLogout();
	}
}
