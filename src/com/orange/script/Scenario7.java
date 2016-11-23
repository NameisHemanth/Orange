package com.orange.script;
import org.testng.annotations.Test;

import com.orange.excellibrary.LoginExcel;
import com.orange.page.AssignLeavePage;
import com.orange.page.LoginPage;
public class Scenario7 extends BaseTest
{
	@Test
	public void testScenario7() throws InterruptedException
	{
		LoginExcel excelData=new LoginExcel("F:/TestData.xlsx","Login");
		driver.get(excelData.getData(1,0));
		LoginPage login=new LoginPage(driver);
		login.setUserName(excelData.getData(1,1));
		login.setPassword(excelData.getData(1,2));
		login.clickLogin();
		
			
		AssignLeavePage assign=new AssignLeavePage(driver);
		assign.clickOnLeave();
		assign.clickOnAssignLeave();
		assign.setEmployeeName("Mohan Raj Bhojaraja");
		assign.clickOnLeaveType();
		assign.selectFromDatePicker();
		assign.selectFromDate();
		Thread.sleep(5000);
		assign.selectToDatePicker();
		assign.selectToDate();
		Thread.sleep(5000);
		assign.selectPartialDays();
		assign.selectTime();
		assign.selectFromTime();
		assign.selectToTime();
		assign.clickOnSave();
		assign.confirmOk();
		assign.clickWelcome();
		assign.clickLogout();
	}
}
