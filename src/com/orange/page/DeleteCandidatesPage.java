package com.orange.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class DeleteCandidatesPage extends BasePage
{
	public DeleteCandidatesPage(WebDriver driver)
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
	
	@FindBy(xpath="//a[text()='Bharath  Shetty']/../..//input")
	private WebElement check;
	public void clickcheck()
	{
		check.click();
	}
	
	@FindBy(id="btnDelete")
	private WebElement delete;
	public void clickDelete()
	{
		delete.click();
	}
	
	@FindBy(id="dialogDeleteBtn")
	private WebElement ok;
	public void clickOk()
	{
		ok.click();
	}
	
}
