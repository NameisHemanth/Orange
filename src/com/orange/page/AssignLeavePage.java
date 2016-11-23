package com.orange.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
public class AssignLeavePage extends BasePage
{
	@FindBy(id="menu_leave_viewLeaveModule")
	private WebElement leave;

	@FindBy(id="menu_leave_assignLeave")
	private WebElement assignLeave;
	
	@FindBy(id="assignleave_txtEmployee_empName")
	private WebElement employeeName;
	
	@FindBy(id="assignleave_txtLeaveType")
	private WebElement leaveType;
		
	@FindBy(id="assignleave_txtFromDate")
	private WebElement fromDatePicker;
	
	@FindBy(xpath="//a[text()='23']")
	private WebElement fromDate;
	
	@FindBy(id="assignleave_txtToDate")
	private WebElement toDatePicker;
	
	@FindBy(xpath="//a[text()='29']")
	private WebElement toDate;	

	@FindBy(id="assignleave_partialDays")
	private WebElement partialDays;
	
	@FindBy(id="assignBtn")
	private WebElement save;
	
	@FindBy(id="assignleave_firstDuration_duration")
	private WebElement selectTime;
	
	@FindBy(id="assignleave_firstDuration_time_from")
	private WebElement from;
	
	@FindBy(id="assignleave_firstDuration_time_to")
	private WebElement to;
	
	@FindBy(id="confirmOkButton")
	private WebElement confirmOkButton;
	
	public void selectToTime()
	{
		Select select=new Select(to);
		select.selectByIndex(15);
	}
	
	public void selectFromTime()
	{
		Select select=new Select(from);
		select.selectByIndex(10);
	}
	public void selectTime()
	{
		Select select=new Select(selectTime);
		select.selectByVisibleText("Specify Time");
	}
	
	public AssignLeavePage(WebDriver driver)
	{
		super(driver);
	}
	
	public void clickOnLeave()
	{
		leave.click();
	}
	
	public void clickOnAssignLeave()
	{
		assignLeave.click();
	}
	
	public void setEmployeeName(String name)
	{
		employeeName.sendKeys(name);
	}
	
	public void clickOnLeaveType()
	{
		Select select=new Select(leaveType);
		select.selectByVisibleText("Vacation US");
	}
	
	public void selectFromDatePicker()
	{
		fromDatePicker.click();
	}
	
	public void selectFromDate()
	{
		fromDate.click();
	}
	
	public void selectToDatePicker()
	{
		toDatePicker.click();
	}
	
	public void selectToDate()
	{
		toDate.click();
	}
	
	public void selectPartialDays()
	{
		Select select=new Select(partialDays);
		select.selectByVisibleText("Start Day Only");
	}
	
	public void clickOnSave()
	{
		save.click();
	}
	
	public void confirmOk()
	{
		confirmOkButton.click();
	}
	

}
