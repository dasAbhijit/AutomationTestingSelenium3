package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	
	WebDriver driver;
	
	By brandIMG = By.xpath("//img[@class='brand']");
	By headerLBL = By.xpath("//h2[@class='wow fadeIn cw text-center animated']");
	By belowheaderLBL = By.xpath("//p[@class='wow fadeIn cw text-center animated']");

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getBrandIMG() {
		return driver.findElement(brandIMG);
	}

	public WebElement getHeaderLBL() {
		return driver.findElement(headerLBL);
	}

	public WebElement getBelowheaderLBL() {
		return driver.findElement(belowheaderLBL);
	}
	
}
