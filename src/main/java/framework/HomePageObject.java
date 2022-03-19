package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {
	
	public WebDriver driverHP;
	
	By welcomeText = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee");
	
	public HomePageObject(WebDriver driver)
	{
		this.driverHP=driver;
	}
	
	
	public WebElement getWelcomeTxt()
	{
		return driverHP.findElement(welcomeText);
	}
	

}
