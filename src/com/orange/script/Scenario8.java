package com.orange.script;
import org.testng.annotations.Test;
import com.orange.excellibrary.LoginExcel;
import com.orange.page.CancelLeavePage;
import com.orange.page.LoginPage;
public class Scenario8 extends BaseTest
{
	@Test
	public void testScenario8()
	{
		LoginExcel excelData=new LoginExcel("F:/TestData.xlsx","Login");
		driver.get(excelData.getData(1,0));
		
		LoginPage login=new LoginPage(driver);
		login.setUserName(excelData.getData(1,1));
		login.setPassword(excelData.getData(1,2));
		login.clickLogin();
		
		CancelLeavePage cancel=new CancelLeavePage(driver);
		cancel.clickLeave();
		cancel.clickLeaveList();
		cancel.clickAll();
		cancel.clickSearch();
		cancel.clickselectAction();
		cancel.clickSave();
		
		cancel.clickWelcome();
		cancel.clickLogout();
	}
}
