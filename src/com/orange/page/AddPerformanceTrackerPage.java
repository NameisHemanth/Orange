package com.orange.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
public class AddPerformanceTrackerPage extends BasePage
{
	public AddPerformanceTrackerPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(id="menu__Performance")
	private WebElement performance;	
	public void clickPerformance()
	{
		performance.click();
	}
	
	@FindBy(id="menu_performance_Configure")
	private WebElement configure;	
	public void clickConfigure()
	{
		configure.click();
	}
	
	@FindBy(id="menu_performance_addPerformanceTracker")
	private WebElement trackers;	
	public void clickTrackers()
	{
		trackers.click();
	}
	
	@FindBy(id="btnAdd")
	private WebElement addTracker;	
	public void clickAddTracker()
	{
		addTracker.click();
	}	
	
	@FindBy(id="addPerformanceTracker_tracker_name")
	private WebElement trackerName;	
	public void setTrackerName(String name)
	{
		trackerName.sendKeys(name);
	}
	
	@FindBy(id="addPerformanceTracker_employeeName_empName")
	private WebElement employeeName;	
	public void setEmployeeName(String name)
	{
		employeeName.sendKeys(name);
	}
	
	@FindBy(id="addPerformanceTracker_availableEmp")
	private WebElement availableReviewers;	
	public void selectavailableReviewers(String... name)
	{
		Select select=new Select(availableReviewers);
		for(String s:name)
		{
			select.selectByVisibleText(s);
		}
	}
	
	@FindBy(id="btnAssignEmployee")
	private WebElement addReviewer;	
	public void clickAddReviewers()
	{
		addReviewer.click();
	}
	
	@FindBy(id="btnSave")
	private WebElement save;	
	public void clickSave()
	{
		save.click();
	}
	
}





