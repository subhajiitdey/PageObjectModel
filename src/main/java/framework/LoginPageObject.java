package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;


public class LoginPageObject{
	
	
	public WebDriver driverLP;
	
	By uname = By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input");
	By upass = By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input");
	By loginbtn = By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]");
	By resetbtn = By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[2]");
	
	
	public LoginPageObject(WebDriver driver) {
		this.driverLP = driver;
	}

	public WebElement getUname()
	{
		return driverLP.findElement(uname);
	}
	
	public WebElement getPass()
	{
		return driverLP.findElement(upass);
	}
	
	public WebElement getLoginBtn()
	{
		return driverLP.findElement(loginbtn);
	}
	
	
	public WebElement getResetBtn()
	{
		return driverLP.findElement(resetbtn);
	}
	

}
