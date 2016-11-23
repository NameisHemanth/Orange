package com.orange.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
public class AddTrackerLogForEmployee extends BasePage 
{
	public AddTrackerLogForEmployee(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(id="menu__Performance")
	private WebElement performance;	
	public void clickPerformance()
	{
		performance.click();
	}

	@FindBy(id="menu_performance_viewEmployeePerformanceTrackerList")
	private WebElement employeeTracker;	
	public void clickEmployeeTracker()
	{
		employeeTracker.click();
	}
	
	
	@FindBy(linkText="Bharth Shetty")
	private WebElement nameLink;	
	public void clickNameLink()
	{
		nameLink.click();
	}
	
	@FindBy(id="btnAdd")
	private WebElement add;	
	public void clickAdd()
	{
		add.click();
	}
	
	@FindBy(id="addperformanceTrackerLog_log")
	private WebElement log;	
	public void setLog(String text)
	{
		log.sendKeys(text);
	}
	
	@FindBy(id="addperformanceTrackerLog_achievement")
	private WebElement selectPerformance;	
	public void selectPerformance()
	{
		Select select=new Select(selectPerformance);
		select.selectByVisibleText("Negative");
	}
	
	@FindBy(id="addperformanceTrackerLog_comment")
	private WebElement comment;	
	public void setComment(String text)
	{
		comment.sendKeys(text);
	}
	
	@FindBy(id="saveBtn")
	private WebElement save;	
	public void clickSave()
	{
		save.click();
	}
	
}
