package Parent;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import com.unicodetechnologies.xlsConnectivity.XLSDatatable_Connectivity;

public class BaseInit {

	public static Logger log = null;
	public static Properties prop = null;
	public static WebDriver driver = null;
	public static XLSDatatable_Connectivity Test_Suite = null;
	public static XLSDatatable_Connectivity Test_Cases = null;
	public static XLSDatatable_Connectivity Test_Data = null;


	public void startup() throws IOException 
	{
		if(driver==null) 
		{
			log = Logger.getLogger("devpinoyLogger");
			log.info("Properties Files is Loading");
			prop = new Properties();

			FileInputStream f1 = new FileInputStream(System.getProperty("user.dir")+"//src//Properties//General_Xpath.properties");
			FileInputStream f2 = new FileInputStream(System.getProperty("user.dir")+"//src//Properties//Training_Functionality.properties");
			FileInputStream f3 = new FileInputStream(System.getProperty("user.dir")+"//src//Properties//Manage_System.properties");
			prop.load(f1);
			prop.load(f2);
			prop.load(f3);
			log.info("Properties files loaded succussfully");

			log.info("Browser Launching start");
			if(prop.getProperty("browser").equalsIgnoreCase("IE"))
			{
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\Files\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			//	driver = new EdgeDriver();
				log.info("Browser launching done");
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("edge"))
			{
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\src\\Files\\MicrosoftWebDriver.exe");
				driver = new EdgeDriver();
				log.info("Browser launching done");
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\Files\\chromedriver.exe");
				driver = new ChromeDriver();
				log.info("Browser launching done");
			}
			
			
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		Test_Suite = new XLSDatatable_Connectivity(System.getProperty("user.dir")+"//src//XLSFiles//TestSuite.xlsx");
		Test_Cases = new XLSDatatable_Connectivity(System.getProperty("user.dir")+"//src//XLSFiles//TestCase.xlsx");
		Test_Data = new XLSDatatable_Connectivity(System.getProperty("user.dir")+"//src//XLSFiles//TestData.xlsx");	
	}

	public static WebElement CheckXpath(String key)
	{
		try 
		{
			return driver.findElement(By.xpath(prop.getProperty(key)));
		}
		catch (Throwable t)
		{
			t.getMessage();
			return null;
		}
	}

	public static WebElement CheckCss(String key)
	{
		try 
		{
			return driver.findElement(By.cssSelector(prop.getProperty(key)));
		}
		catch(Throwable t)
		{
			t.getMessage();
			return null;
		}
	}

	public static WebElement CheckID(String key)
	{
		try 
		{
			return driver.findElement(By.id(prop.getProperty(key)));
		}
		catch(Throwable t)
		{
			t.getMessage();
			return null;
		}
	}
	
	public static WebElement CheckLink(String key)
	{
		try 
		{
			return driver.findElement(By.linkText(prop.getProperty(key)));
		}
		catch(Throwable t)
		{
			t.getMessage();
			return null;
		}
	}

}
