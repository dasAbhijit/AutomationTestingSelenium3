package tests;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import utilities.Initialization;

public class TestDemo extends Initialization {
	public static Logger logger = Logger.getLogger(Initialization.class.getName());
	//dataProvider="loginData"  String login , String password
	@BeforeClass
	public void setUp() {
		driver = Initialization.getDriver();
		driver.get("http://phptravels.com/demo/");
		logger.info("Targer URL Reached");
	}
	
	@Test()
	public void demoPassTest() {
		LandingPage lp = new LandingPage(driver);
		String headerLabel = lp.getHeaderLBL().getText();
		//System.out.println(headerLabel);
		Assert.assertEquals(headerLabel, "Application Test Drive.");
	}
	@Test(enabled=false)
	public void demoSkipTest() {
		Assert.assertTrue(true);
	}
	
	@Test()
	public void basePageNavigation() {
		LandingPage lp = new LandingPage(driver);
		String belowHeaderLabel = lp.getBelowheaderLBL().getText();
		Assert.assertEquals(belowHeaderLabel, "Intentional Fail Scenario");
		//System.out.println(belowHeaderLabel);
	}
	
	@AfterTest
	public void teardown()
	{
	}
	
	@AfterClass
	public void afterSuitDriver() {
		driver.close();
		driver=null;
	}
	
	@DataProvider
	public Object[][] loginData() {
		Object[][] data= new Object[3][2];
		//1st set of data
		data[0][0]="mercury";
		data[0][1]="mercury";
		//2nd set of data
		data[1][0]="mercury";
		data[1][1]="admin";
		//3rd set of data
		data[2][0]="admin";
		data[2][1]="admin";
		return data;
	}
	
}