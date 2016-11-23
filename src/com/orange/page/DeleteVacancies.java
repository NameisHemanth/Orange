package com.orange.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteVacancies extends BasePage
{
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	private WebElement recruitment;
	
	@FindBy(id="menu_recruitment_viewJobVacancy")
	private WebElement vacancies;
	
	@FindBy(xpath="//a[text()='Java And Selenium']/../..//input")
	private WebElement checkBox;
	
	@FindBy(id="btnDelete")
	private WebElement delete;
	
	@FindBy(id="dialogDeleteBtn")
	private WebElement okButton;
	
	@FindBy(className="btn cancel")
	private WebElement cancelButton;

	
	public DeleteVacancies(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickRecruitment()
	{
		recruitment.click();
	}
	
	public void clickvacancies()
	{
		vacancies.click();
	}
	
	public void selectCheckBox()
	{
		checkBox.click();
	}
	
	public void clickDelete()
	{
		delete.click();
	}
	
	public void clickOk()
	{
		okButton.click();
	}
	
	public void clickNo()
	{
		cancelButton.click();
	}	

			
}
