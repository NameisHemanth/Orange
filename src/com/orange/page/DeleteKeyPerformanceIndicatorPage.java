package com.orange.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class DeleteKeyPerformanceIndicatorPage extends BasePage
{
	public DeleteKeyPerformanceIndicatorPage(WebDriver driver) 
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
	
	@FindBy(id="menu_performance_searchKpi")
	private WebElement kpis;	
	public void clickKpis()
	{
		kpis.click();
	}
	
	@FindBy(xpath="//a[text()='Test Cases']/../..//input")
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
