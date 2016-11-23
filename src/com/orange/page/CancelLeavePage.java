package com.orange.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
public class CancelLeavePage extends BasePage
{
	public CancelLeavePage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(id="menu_leave_viewLeaveModule")
	private WebElement leave;
	public void clickLeave()
	{
		leave.click();
	}
	
	@FindBy(id="menu_leave_viewLeaveList")
	private WebElement leaveList;
	public void clickLeaveList()
	{
		leaveList.click();
	}
	
	@FindBy(id="leaveList_chkSearchFilter_checkboxgroup_allcheck")
	private WebElement all;
	public void clickAll()
	{
		all.click();
	}
	
	@FindBy(id="btnSearch")
	private WebElement search;
	public void clickSearch()
	{
		search.click();
	}
	
	@FindBy(id="select_leave_action_4")
	private WebElement selectAction;
	public void clickselectAction()
	{
		Select select=new Select(selectAction);
		select.selectByVisibleText("Cancel");
	}
	
	@FindBy(id="btnSave")
	private WebElement save;
	public void clickSave()
	{
		save.click();
	}	
}
