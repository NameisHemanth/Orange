package com.orange.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class SearchVacancyPage extends BasePage
{
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	private WebElement recruitment;
	
	@FindBy(id="menu_recruitment_viewJobVacancy")
	private WebElement vacancies;
	
	@FindBy(id="vacancySearch_jobTitle")
	private WebElement searchTitle;
	
	@FindBy(id="vacancySearch_jobVacancy")
	private WebElement vacancy;
	
	@FindBy(id="vacancySearch_hiringManager")
	private WebElement hiringManager;
		
	@FindBy(id="vacancySearch_status")
	private WebElement status;
	
	@FindBy(id="btnSrch")
	private WebElement search;
	
	@FindBy(id="//td//a[text()='Java And Selenium']")
	private WebElement searchElement;
	
	
	public SearchVacancyPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickRecruitment()
	{
		recruitment.click();
	}
	
	public void clickVacancies()
	{
		vacancies.click();
	}
	
	public void clickSearchTitle()
	{
		searchTitle.click();
	}	
	
	public void selectTilteOption()
	{
		Select title=new Select(searchTitle);
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		title.selectByVisibleText("IT Manager");
	}
	
	public void clickVacancy()
	{
		vacancy.click();
	}
	
	public void selectVacancyOption()
	{
		Select value=new Select(vacancy);
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		value.selectByVisibleText("Java And Selenium");
		
	}
	
	public void clickHiringManager()
	{
		hiringManager.click();
	}
	
	public void selectHiringManagerOption()
	{
		Select value=new Select(hiringManager);
		value.selectByVisibleText("Robert Craig");
	}
	
	public void clickStatus()
	{
		status.click();
	}
	
	public void selectStatusOption()
	{
		Select value=new Select(status);
		value.selectByVisibleText("Active");
	}
	
	public void clickSearch()
	{
		search.click();
	}
	
	public void search()
	{
		if(searchElement.isDisplayed())
		{
			System.out.println("Search Element Found");
		}
		else
		{
			System.out.println("Search Element Not Found");
		}
	}
}
