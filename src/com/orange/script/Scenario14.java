package com.orange.script;
import org.testng.annotations.Test;

import com.orange.excellibrary.LoginExcel;
import com.orange.page.DeleteKeyPerformanceIndicatorPage;
import com.orange.page.LoginPage;

public class Scenario14 extends BaseTest
{
	@Test
	public void testScenario14()
	{
		LoginExcel excelData=new LoginExcel("F:/TestData.xlsx","Login");
		driver.get(excelData.getData(1,0));
		
		LoginPage login=new LoginPage(driver);
		login.setUserName(excelData.getData(1,1));
		login.setPassword(excelData.getData(1,2));
		login.clickLogin();
		
		DeleteKeyPerformanceIndicatorPage performance=new DeleteKeyPerformanceIndicatorPage(driver);
		performance.clickPerformance();
		performance.clickConfigure();
		
		performance.clickKpis();
		performance.selectCheck();
		performance.clickDelete();
		performance.clickOk();
		performance.clickWelcome();
		performance.clickLogout();
	}
}
