package framework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.base;

public class HomePageTests extends base{
	
	public WebDriver driver;
	
	@BeforeTest
	public void beforeTest() throws IOException
	{
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test(dataProvider = "getLoginData")
	public void addNewCusomter(String uname, String upass) throws IOException
	{
		
		LoginPageObject lpObj = new LoginPageObject(driver);
		lpObj.getUname().sendKeys(uname);
		lpObj.getPass().sendKeys(upass);
		lpObj.getLoginBtn().click();
		
		
		HomePageObject hpObj = new HomePageObject(driver);
		
		Assert.assertTrue(hpObj.getAddCusomter().isDisplayed());
		
		//Click on Add Customer and Add customer logic will be added later
		
		
	}
	
	@DataProvider
	public Object[][] getLoginData()
	{
		
		Object[][] obj = new Object[1][2];
		
		obj[0][0]="mngr391577";
		obj[0][1]="bEjebyd";
		
		
		return obj;
		
	}
	
	@AfterTest
	public void tearDown()
	{
		if(driver!=null)
		{
		driver.quit();
		}
	}
	
}
