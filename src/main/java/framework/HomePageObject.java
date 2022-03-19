package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {
	
	public WebDriver driverHP;
	
	By welcomeText = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee");
	By addCustomer = By.xpath("/html/body/div[3]/div/ul/li[2]/a");
	By editCustomer = By.xpath("/html/body/div[3]/div/ul/li[3]/a");
	By deleteCustomer = By.xpath("/html/body/div[3]/div/ul/li[4]/a");
	
	
	public HomePageObject(WebDriver driver)
	{
		this.driverHP=driver;
	}
	
	
	public WebElement getWelcomeTxt()
	{
		return driverHP.findElement(welcomeText);
	}
	
	public WebElement getAddCusomter()
	{
		return driverHP.findElement(addCustomer);
	}
	
	public WebElement getEditCustomer()
	{
		return driverHP.findElement(editCustomer);
	}
	
	public WebElement getDeleteCustomer()
	{
		return driverHP.findElement(deleteCustomer);
	}
	
	
}
