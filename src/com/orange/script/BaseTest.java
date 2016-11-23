package com.orange.script;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public abstract class BaseTest
{
	public WebDriver driver;
	@BeforeMethod
	public void preCondition()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
}
