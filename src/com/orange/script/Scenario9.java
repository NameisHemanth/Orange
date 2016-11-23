package com.orange.script;
import org.testng.annotations.Test;
import com.orange.excellibrary.LoginExcel;
import com.orange.page.CandidatePage;
import com.orange.page.LoginPage;
public class Scenario9 extends BaseTest
{
	@Test
	public void testScenario9()
	{
		LoginExcel excelData=new LoginExcel("F:/TestData.xlsx","Login");
		driver.get(excelData.getData(1,0));
		
		LoginPage login=new LoginPage(driver);
		login.setUserName(excelData.getData(1,1));
		login.setPassword(excelData.getData(1,2));
		login.clickLogin();
		
		CandidatePage candidate=new CandidatePage(driver);
		candidate.clickRecruitment();
		candidate.clickCandidates();
		candidate.clickAdd();
		candidate.setFirstName("Bharath");
		candidate.setLastName("Shetty");
		candidate.setEmail("bharath@gmail.com");
		candidate.clickSave();
		
		candidate.clickWelcome();
		candidate.clickLogout();
		
	}
}
