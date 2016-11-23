package com.orange.script;
import org.testng.annotations.Test;

import com.orange.excellibrary.LoginExcel;
import com.orange.page.AddTrackerLogForEmployee;
import com.orange.page.LoginPage;

public class Scenario15 extends BaseTest 
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
		
		AddTrackerLogForEmployee log=new AddTrackerLogForEmployee(driver);
		log.clickPerformance();
		log.clickEmployeeTracker();
		log.clickNameLink();
		log.clickAdd();
		log.setLog("Log2");
		log.selectPerformance();
		log.setComment("Needs to Change!!");
		log.clickSave();
		log.clickWelcome();
		log.clickLogout();
		
	}
	
}
