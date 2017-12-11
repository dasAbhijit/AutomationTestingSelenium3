package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Initialization {
	public static final Logger LOGGER = Logger.getLogger(Initialization.class.getName());
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static Properties prop;

	
	public  static WebDriver getDriver() {
		if(driver==null) {
			initializeDriver();
		}
		return driver;
	}
	private static WebDriver initializeDriver() {
		
		//Logger configuration
		DOMConfigurator.configure(".\\src\\main\\resources\\utilities\\log4j.xml");
		//load property file
		setUpProperties();
		//select browser - Chrome , Firefox ,IE
		selectBrowser();
		//setting wait property
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LOGGER.debug("Implicit wait property set");
		//setup Extent Report
		setUpExtentReport();
		//return driver object
		return driver;
	}
	
	public static String getScreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") +"\\ErrorScreenshots\\"+result+".png";
		FileUtils.copyFile(src, new File(dest));
		return dest;
	}

	public static void selectBrowser() {
		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\utilities\\chromedriver.exe");		
			LOGGER.debug("Chrome Driver Property got set");
			driver = new ChromeDriver();
			LOGGER.debug("Chrome Driver Created");
		}
		if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\src\\main\\resources\\utilities\\geckodriver.exe");
			LOGGER.debug("Firefox Driver Property got set");
			driver = new FirefoxDriver();
			LOGGER.debug("Firefox Driver Created");
		}
		if (prop.getProperty("browser").equals("IE")) {
			System.setProperty("webdriver.ie.driver", ".\\src\\main\\resources\\utilities\\IEDriverServer.exe");
			LOGGER.debug("IE Driver Property got set");
			driver = new InternetExplorerDriver();
			LOGGER.debug("IE Driver Created");
		}
	}
	
	public static void setUpProperties() {
		prop = new Properties();
		FileInputStream file = null;
		try {
			file = new FileInputStream(".\\src\\main\\resources\\utilities\\Initialization.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			LOGGER.error("Properties File Not Found");
		}
		try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			LOGGER.error("Properties File Could not be loaded");
		}
	}
	
	public static void setUpExtentReport() {
		extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/STMExtentReport.html", true);
        extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		
	}
}
