package com.orange.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class CandidatePage extends BasePage
{
	public CandidatePage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	private WebElement recruitment;
	public void clickRecruitment()
	{
		recruitment.click();
	}
	
	@FindBy(id="menu_recruitment_viewCandidates")
	private WebElement candidates;
	public void clickCandidates()
	{
		candidates.click();
	}
	
	@FindBy(id="btnAdd")
	private WebElement add;
	public void clickAdd()
	{
		add.click();
	}
	
	@FindBy(id="addCandidate_firstName")
	private WebElement firstName;
	public void setFirstName(String fn)
	{
		firstName.sendKeys(fn);
	}
	
	@FindBy(id="addCandidate_lastName")
	private WebElement lastName;
	public void setLastName(String ln)
	{
		lastName.sendKeys(ln);
	}
	
	@FindBy(id="addCandidate_email")
	private WebElement email;
	public void setEmail(String e)
	{
		email.sendKeys(e);
	}
	
	@FindBy(id="btnSave")
	private WebElement save;
	public void clickSave()
	{
		save.click();
	}
	
}
