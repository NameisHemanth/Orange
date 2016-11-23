package com.orange.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LoginPage extends BasePage
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(id="txtUsername")
	private WebElement userName;
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	@FindBy(id="btnLogin")
	private WebElement login;

	public void setUserName(String un)
	{
		userName.sendKeys(un);
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		login.click();
	}
}
