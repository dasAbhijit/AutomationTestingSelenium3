package tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AboutUsPage;
import utilities.Initialization;

public class AboutUsPageTest {
	
	WebDriver driver;
	Boolean condition;
	AboutUsPage aup;
	
	@BeforeClass
	public void setUp() {
		driver = Initialization.getDriver();
		aup = new AboutUsPage(driver);
		String URI = Initialization.prop.getProperty("url") + aup.getPageUrl();
		driver.get(URI);
	}
	
	@Test
	public void verifyAboutUsPageNavigation() {
		condition = aup.verifyPageLoaded();
		Assert.assertTrue(condition);
		condition = aup.verifyPageUrl();
		Assert.assertTrue(condition); 	
	}
	
	
	
	@AfterClass
	public void afterClassDriver() {
		
	}

}
