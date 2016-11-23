package com.orange.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddVacanciesPage extends BasePage
{
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	private WebElement recruitment;
	
	@FindBy(id="menu_recruitment_viewJobVacancy")
	private WebElement vacancies;
	
	@FindBy(id="btnAdd")
	private WebElement add;
	
	@FindBy(id="addJobVacancy_jobTitle")
	private WebElement select;
	
	@FindBy(id="addJobVacancy_name")
	private WebElement vacancyName;
	
	@FindBy(id="addJobVacancy_hiringManager")
	private WebElement hiringManager;
	
	@FindBy(id="btnSave")
	private WebElement save;	
	
	public AddVacanciesPage(WebDriver driver) 
	{
		super(driver);
	}
	
	public void clickRecruitment()
	{
		recruitment.click();
	}
	
	public void clickvacancies()
	{
		vacancies.click();
	}
	
	public void clickAdd()
	{
		add.click();
	}
	
	public void selectOption(String text)
	{
		Select s=new Select(select);
		s.selectByVisibleText(text);
	}
	
	public void setVacancyName(String vn)
	{
		vacancyName.sendKeys(vn);
	}
	
	public void setHiringManager(String hm)
	{
		hiringManager.sendKeys(hm);
	}
	
	public void clickSave()
	{
		save.click();
	}
}
