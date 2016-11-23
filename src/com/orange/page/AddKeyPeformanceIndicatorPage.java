package com.orange.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
public class AddKeyPeformanceIndicatorPage extends BasePage
{
	public AddKeyPeformanceIndicatorPage(WebDriver driver) 
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
	
	@FindBy(id="btnAdd")
	private WebElement addKpis;	
	public void clickAddKpis()
	{
		addKpis.click();
	}
	
	@FindBy(id="defineKpi360_jobTitleCode")
	private WebElement jobTitle;	
	public void selectJobTitle(String text)//IT Manager
	{
		Select select=new Select(jobTitle);
		select.selectByVisibleText(text);
	}
	
	@FindBy(id="defineKpi360_keyPerformanceIndicators")
	private WebElement keyPerformanceIndicator;	
	public void setKeyPerformanceIndicator(String text)//Test Cases
	{
		keyPerformanceIndicator.sendKeys(text);
	}
	
	@FindBy(id="defineKpi360_minRating")
	private WebElement minimumRating;	
	public void setMinimumRating(String text)//3
	{
		minimumRating.sendKeys(text);
	}
	
	@FindBy(id="defineKpi360_maxRating")
	private WebElement maximumRating;	
	public void setMaximumRating(String text)//5
	{
		maximumRating.sendKeys(text);
	}
	
	@FindBy(id="saveBtn")
	private WebElement save;	
	public void clickSave()
	{
		save.click();
	}
	
}






