package com.orange.script;
import org.testng.annotations.Test;
import com.orange.excellibrary.LoginExcel;
import com.orange.page.LoginPage;
import com.orange.page.LogoutPage;
public class Scenario1 extends BaseTest
{
	@Test
	public void testScenario1() throws Throwable
	{		
		LoginExcel excelData=new LoginExcel("F:/TestData.xlsx","Login");
		driver.get(excelData.getData(1,0));
		
		LoginPage login=new LoginPage(driver);
		login.setUserName(excelData.getData(1,1));
		login.setPassword(excelData.getData(1,2));
		login.clickLogin();
		
		LogoutPage logout=new LogoutPage(driver);
		Thread.sleep(4000);
		logout.clickWelcome();
		Thread.sleep(2000);
		logout.clickLogout();
	}
	
}
