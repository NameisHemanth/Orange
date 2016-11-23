package com.orange.script;
import org.testng.annotations.Test;
import com.orange.excellibrary.LoginExcel;
import com.orange.page.LoginPage;
import com.orange.page.AddPerformanceTrackerPage;
public class Scenario11 extends BaseTest 
{
	@Test
	public void testScenario11()
	{
		LoginExcel excelData=new LoginExcel("F:/TestData.xlsx","Login");
		driver.get(excelData.getData(1,0));
		
		LoginPage login=new LoginPage(driver);
		login.setUserName(excelData.getData(1,1));
		login.setPassword(excelData.getData(1,2));
		login.clickLogin();
		
		AddPerformanceTrackerPage performance=new AddPerformanceTrackerPage(driver);
		performance.clickPerformance();
		performance.clickConfigure();
		performance.clickTrackers();
		performance.clickAddTracker();
		performance.setTrackerName("Track1");
		performance.setEmployeeName("Robert Craig");
		performance.selectavailableReviewers("Fiona Grace","John Smith");
		performance.clickAddReviewers();
		performance.clickSave();
		performance.clickWelcome();
		performance.clickLogout();
	}
}
