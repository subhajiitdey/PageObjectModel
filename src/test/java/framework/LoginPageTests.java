package framework;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import utilities.base;

public class LoginPageTests extends base{

	
	@Test(dataProvider="getLoginData")
	public void loginApp(String uname, String upass) throws IOException
	{
		driver = intializeDriver();
		driver.get("https://www.demo.guru99.com/V4/");
		
		LoginPageObject lpObj = new LoginPageObject(driver);
		lpObj.getUname().sendKeys(uname);
		lpObj.getPass().sendKeys(upass);
		lpObj.getLoginBtn().click();
		
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

}
