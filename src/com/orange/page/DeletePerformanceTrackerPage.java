package com.orange.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class DeletePerformanceTrackerPage extends BasePage 
{
	public DeletePerformanceTrackerPage(WebDriver driver) 
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
	
	@FindBy(xpath="//a[text()='Robert Craig']/../..//input")
	private WebElement check;	
	public void selectCheck()
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
