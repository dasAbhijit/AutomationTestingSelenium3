package tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.AboutUsPage;
import pageObjects.BlogPage;
import pageObjects.ContactPage;
import pageObjects.DemoDragablePage;
import pageObjects.DemoTabsPage;
import pageObjects.HomePage;
import pageObjects.ServicesPage;
import utilities.Initialization;

public class HomePageTest {
	
	WebDriver driver;
	Boolean condition;
	HomePage hp;
	
	
	
	@BeforeClass
	public void setUp() {
		driver = Initialization.getDriver();
		driver.get(Initialization.prop.getProperty("url"));
		hp = new HomePage(driver);
	}
	
	@Test
	public void verifyHomePageNavigation() {
		//hp = new HomePage(driver);
		condition = hp.verifyPageLoaded();
		Assert.assertTrue(condition);
		condition = hp.verifyPageUrl();
		Assert.assertTrue(condition); 	
	}
	
	@Test
	public void verifyAboutUsLink() {
		AboutUsPage aup= new AboutUsPage(driver);
		hp.clickAboutUsLink();
		Assert.assertTrue(aup.verifyPageLoaded());
		Assert.assertTrue(aup.verifyPageUrl());
		//Initialization.logScreenshot("About Us Page Verified");
		driver.navigate().back();
	}
	
	@Test
	public void verifyServicesLink() {
		hp = new HomePage(driver);
		ServicesPage sp = new ServicesPage(driver);
		sp = hp.clickServicesLink();
		Assert.assertTrue(sp.verifyPageLoaded());
		Assert.assertTrue(sp.verifyPageUrl());
		
		driver.navigate().back();
	}
	
	@Test
	public void verifyDemoDragableLink() {
		hp = new HomePage(driver);
		hp.clickDemoLink();
		DemoDragablePage ddp = new DemoDragablePage(driver);
		ddp = hp.clickDemoDraggableLink();
		Assert.assertTrue(ddp.verifyPageLoaded());
		Assert.assertTrue(ddp.verifyPageUrl());
		driver.navigate().back();
	}
	
	@Test
	public void verifyDemoTabsLink() {
		hp = new HomePage(driver);
		hp.clickDemoLink();
		DemoTabsPage dtp = new DemoTabsPage(driver);
		dtp = hp.clickDemoTabsLink();
		Assert.assertTrue(dtp.verifyPageLoaded());
		Assert.assertTrue(dtp.verifyPageUrl());
		driver.navigate().back();
	}
	
	@Test
	public void verifyBlogLink() {
		hp = new HomePage(driver);
		BlogPage bp = new BlogPage(driver);
		bp = hp.clickBlogLink();
		Assert.assertTrue(bp.verifyPageLoaded());
		Assert.assertTrue(bp.verifyPageUrl());
		driver.navigate().back();
	}
	
	@Test
	public void verifyContactLink() {
		hp = new HomePage(driver);
		ContactPage cp = new ContactPage(driver);
		cp = hp.clickContactLink();
		Assert.assertTrue(cp.verifyPageLoaded());
		Assert.assertTrue(cp.verifyPageUrl());
		driver.navigate().back();
	}
	
	
	@AfterClass
	public void afterClassDriver() {
		
	}

}
