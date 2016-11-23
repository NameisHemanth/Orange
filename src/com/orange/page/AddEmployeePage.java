package com.orange.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AddEmployeePage extends BasePage
{
	@FindBy(id="menu_pim_viewPimModule")
	private WebElement pim;
	
	@FindBy(id="menu_pim_addEmployee")
	private WebElement addEmployee;
	
	@FindBy(id="firstName")
	private WebElement fullName;

	@FindBy(id="middleName")
	private WebElement middleName;

	@FindBy(id="lastName")
	private WebElement lastName;
		
	@FindBy(id="btnSave")
	private WebElement saveButton;

	
	public AddEmployeePage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void clickPIM()
	{
		pim.click();
	}
	
	public void clickAddEmployee()
	{
		addEmployee.click();
	}
	
	public void setFirstName(String fn)
	{
		fullName.sendKeys(fn);
	}
	
	public void setMiddleName(String mn)
	{
		middleName.sendKeys(mn);
	}
	
	public void setLastName(String ln)
	{
		lastName.sendKeys(ln);
	}
	
	public void clickSave()
	{
		saveButton.click();
	}	
}




