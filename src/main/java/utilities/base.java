package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	
	
	public void getScreenshotPath(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source, new File(destinationFile));
	}

}
