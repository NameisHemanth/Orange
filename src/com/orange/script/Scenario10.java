package com.orange.script;
import org.testng.annotations.Test;
import com.orange.excellibrary.LoginExcel;
import com.orange.page.DeleteCandidatesPage;
import com.orange.page.LoginPage;
public class Scenario10 extends BaseTest
{
	@Test
	public void testScenario10()
	{
		LoginExcel excelData=new LoginExcel("F:/TestData.xlsx","Login");
		driver.get(excelData.getData(1,0));
		
		LoginPage login=new LoginPage(driver);
		login.setUserName(excelData.getData(1,1));
		login.setPassword(excelData.getData(1,2));
		login.clickLogin();
		
		DeleteCandidatesPage candidates=new DeleteCandidatesPage(driver);
		candidates.clickRecruitment();
		candidates.clickCandidates();
		candidates.clickcheck();
		candidates.clickDelete();
		candidates.clickOk();
		candidates.clickWelcome();
		candidates.clickLogout();		
	}
}
