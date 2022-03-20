package framework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import utilities.base;

public class LoginPageTests extends base{
	
	public WebDriver driver;
	
	@BeforeTest
	public void beforeTest() throws IOException
	{
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
	}

	
	@Test(dataProvider="getLoginData")
	public void loginApp(String uname, String upass) throws IOException
	{
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
		
		LoginPageObject lpObj = new LoginPageObject(driver);
		lpObj.getUname().sendKeys(uname);
		lpObj.getPass().sendKeys(upass);
		lpObj.getLoginBtn().click();
		
		
		HomePageObject hpObj = new HomePageObject(driver);
	
		Assert.assertEquals(hpObj.getWelcomeTxt().getText(), "Welcome To Manager's Page of Guru99 Bank");
		

		
	}
	
	@DataProvider
	public Object[][] getLoginData()
	{
		
		Object[][] obj = new Object[2][2];
		
		obj[0][0]="mngr391577";
		obj[0][1]="bEjebyd";
		
		
		obj[1][0]="mngr391577";
		obj[1][1]="bEjebyd";
		
		
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
