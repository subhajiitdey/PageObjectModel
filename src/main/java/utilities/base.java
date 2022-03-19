package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	
	public WebDriver driver;
	public String browsername;
	public Properties prop;
	
	public WebDriver intializeDriver() throws IOException
	{
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("F:\\Cloned Eclipse Workspace\\Framework\\src\\main\\java\\utilities\\data.properties");
		prop.load(fis);
		
		
		browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","F:\\Cloned Eclipse Workspace\\Framework\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browsername.equals("firefox"))
		{
			
		}
		else if(browsername.equals("IE"))
		{
			
		}
		
		
		
		return driver;
		
	}

}
