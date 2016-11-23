package com.orange.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DeleteEmployeePage extends BasePage 
{
	@FindBy(id="menu_pim_viewPimModule")
	private WebElement pim;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	private WebElement employeeList;

	@FindBy(xpath="//a[text()='Mohan Raj']/../..//input")
	private WebElement checkBox;

	@FindBy(id="btnDelete")
	private WebElement delete;
	
	@FindBy(id="dialogDeleteBtn")
	private WebElement okButton;
	
	@FindBy(className="btn cancel")
	private WebElement cancelButton;

	public DeleteEmployeePage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void clickPIM()
	{
		pim.click();
	}
	
	public void clickEmployeeList()
	{
		employeeList.click();
	}
	
	public void selectCheckBoxToDelete()
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
