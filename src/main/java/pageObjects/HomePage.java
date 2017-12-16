package pageObjects;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Initialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[title='About us']")
    @CacheLookup
    public WebElement aboutUs;
    

    public WebElement getAboutUs() {
		return aboutUs;
	}

	public void setAboutUs(WebElement aboutUs) {
		this.aboutUs = aboutUs;
	}

	@FindBy(css = "a[href='http://demoqa.com/accordion/']")
    @CacheLookup
    private WebElement accordion;

    @FindBy(css = "a[href='http://demoqa.com/autocomplete/']")
    @CacheLookup
    private WebElement autocomplete;

    @FindBy(css = "a[title='Blog']")
    @CacheLookup
    private WebElement blog;

    @FindBy(css = "a[title='Contact']")
    @CacheLookup
    private WebElement contact;

    @FindBy(css = "a[href='http://demoqa.com/datepicker/']")
    @CacheLookup
    private WebElement datepicker;

    @FindBy(css = "a.dropdown-toggle")
    @CacheLookup
    private WebElement demo;
    
    @FindBy(css = "a[title='Draggable']")
    @CacheLookup
    private WebElement demoDraggable;
    
    @FindBy(css = "a[title='Tabs']")
    @CacheLookup
    private WebElement demoTabs;

    @FindBy(css = "a[title='Draggable']")
    @CacheLookup
    private WebElement draggable1;

    @FindBy(css = "#menu-item-140 a")
    @CacheLookup
    private WebElement draggable2;

    @FindBy(css = "a[href='http://demoqa.com/droppable/']")
    @CacheLookup
    private WebElement droppable;

    @FindBy(css = "a[href='http://demoqa.com/frames-and-windows/']")
    @CacheLookup
    private WebElement framesAndWindows;

    @FindBy(css = "a[title='Home']")
    @CacheLookup
    private WebElement home;

    @FindBy(css = "a[href='http://demoqa.com/menu/']")
    @CacheLookup
    private WebElement menu;
//
    private final String pageLoadedText = "Aliquam hendrit rutrum iaculis nullam ondimentum maluada velit beum donec sit amet";

    private final String pageUrl = "http://demoqa.com/";
    
    public String getPageUrl() {
		return pageUrl;
	}

    @FindBy(css = "#post-9 div.entry-content div:nth-of-type(1) div.detail-entry p:nth-of-type(1) a")
    @CacheLookup
    private WebElement pattern141;

    @FindBy(css = "#post-9 div.entry-content div:nth-of-type(2) div.detail-entry p:nth-of-type(1) i.detail-icon.icons-shuffle a")
    @CacheLookup
    private WebElement pattern142;

    @FindBy(css = "#post-9 div.entry-content div:nth-of-type(3) div.detail-entry i.detail-icon.icons-shuffle a")
    @CacheLookup
    private WebElement pattern143;

    @FindBy(css = "a[href='http://oneiricindia.com/']")
    @CacheLookup
    private WebElement poweredByOneiricTechSolutionsPvt;

    @FindBy(css = "a[href='http://demoqa.com/registration/']")
    @CacheLookup
    private WebElement registration;

    @FindBy(css = "a[href='http://demoqa.com/resizable/']")
    @CacheLookup
    private WebElement resizable;

    @FindBy(css = "a[href='http://demoqa.com/selectable/']")
    @CacheLookup
    private WebElement selectable;

    @FindBy(css = "a[title='Services']")
    @CacheLookup
    private WebElement services;

    @FindBy(css = "a[href='http://demoqa.com/slider/']")
    @CacheLookup
    private WebElement slider;

    @FindBy(css = "a[href='http://demoqa.com/sortable/']")
    @CacheLookup
    private WebElement sortable;

    @FindBy(id = "ui-id-1")
    @CacheLookup
    private WebElement tab1;

    @FindBy(id = "ui-id-2")
    @CacheLookup
    private WebElement tab2;

    @FindBy(id = "ui-id-3")
    @CacheLookup
    private WebElement tab3;

    @FindBy(id = "ui-id-4")
    @CacheLookup
    private WebElement tab4;

    @FindBy(id = "ui-id-5")
    @CacheLookup
    private WebElement tab5;

    @FindBy(css = "a[title='Tabs']")
    @CacheLookup
    private WebElement tabs1;

    @FindBy(css = "#menu-item-98 a")
    @CacheLookup
    private WebElement tabs2;

    @FindBy(css = "button.navbar-toggle")
    @CacheLookup
    private WebElement toggleNavigation;

    @FindBy(css = "a[href='http://toolsqa.com/']")
    @CacheLookup
    private WebElement toolsqa;

    @FindBy(css = "a[href='http://demoqa.com/tooltip/']")
    @CacheLookup
    private WebElement tooltip;

    
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public HomePage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public HomePage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Us Link.
     *
     * @return the AboutUsPage class instance.
     */
    public void clickAboutUsLink() {
        aboutUs.click();
    }

    /**
     * Click on Accordion Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAccordionLink() {
        accordion.click();
        return this;
    }

    /**
     * Click on Autocomplete Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAutocompleteLink() {
        autocomplete.click();
        return this;
    }

    /**
     * Click on Blog Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickBlogLink() {
        blog.click();
        return new BlogPage(driver);
    }

    /**
     * Click on Contact Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickContactLink() {
        contact.click();
        return new ContactPage(driver);
    }

    /**
     * Click on Datepicker Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickDatepickerLink() {
        datepicker.click();
        return this;
    }

    /**
     * Click on Demo Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickDemoLink() {
        demo.click();
        return this;
    }
    /**
     * Click on Demo Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickDemoDraggableLink() {
        demoDraggable.click();
        return new DemoDragablePage(driver);
    }
    /**
     * Click on Demo Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickDemoTabsLink() {
        demoTabs.click();
        return new DemoTabsPage(driver);
    }

    /**
     * Click on Draggable Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickDraggable1Link() {
        draggable1.click();
        return this;
    }

    /**
     * Click on Draggable Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickDraggable2Link() {
        draggable2.click();
        return this;
    }

    /**
     * Click on Droppable Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickDroppableLink() {
        droppable.click();
        return this;
    }

    /**
     * Click on Frames And Windows Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickFramesAndWindowsLink() {
        framesAndWindows.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on Menu Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMenuLink() {
        menu.click();
        return this;
    }

    /**
     * Click on Pattern14 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPattern141Link() {
        pattern141.click();
        return this;
    }

    /**
     * Click on Pattern14 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPattern142Link() {
        pattern142.click();
        return this;
    }

    /**
     * Click on Pattern14 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPattern143Link() {
        pattern143.click();
        return this;
    }

    /**
     * Click on Powered By Oneiric Tech Solutions Pvt. Ltd. Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPoweredByOneiricTechSolutionsPvtLink() {
        poweredByOneiricTechSolutionsPvt.click();
        return this;
    }

    /**
     * Click on Registration Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickRegistrationLink() {
        registration.click();
        return this;
    }

    /**
     * Click on Resizable Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickResizableLink() {
        resizable.click();
        return this;
    }

    /**
     * Click on Selectable Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSelectableLink() {
        selectable.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the ServicesPage class instance.
     */
    public ServicesPage clickServicesLink() {
        services.click();
        return new ServicesPage(driver);
    }

    /**
     * Click on Slider Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSliderLink() {
        slider.click();
        return this;
    }

    /**
     * Click on Sortable Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSortableLink() {
        sortable.click();
        return this;
    }

    /**
     * Click on Tab 1 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTab1Link() {
        tab1.click();
        return this;
    }

    /**
     * Click on Tab 2 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTab2Link() {
        tab2.click();
        return this;
    }

    /**
     * Click on Tab 3 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTab3Link() {
        tab3.click();
        return this;
    }

    /**
     * Click on Tab 4 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTab4Link() {
        tab4.click();
        return this;
    }

    /**
     * Click on Tab 5 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTab5Link() {
        tab5.click();
        return this;
    }

    /**
     * Click on Tabs Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTabs1Link() {
        tabs1.click();
        return this;
    }

    /**
     * Click on Tabs Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTabs2Link() {
        tabs2.click();
        return this;
    }

    /**
     * Click on Toggle Navigation Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickToggleNavigationButton() {
        toggleNavigation.click();
        return this;
    }

    /**
     * Click on Toolsqa Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickToolsqaLink() {
        toolsqa.click();
        return this;
    }

    /**
     * Click on Tooltip Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTooltipLink() {
        tooltip.click();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the HomePage class instance.
     */
    public boolean verifyPageLoaded() {
    
                return driver.getPageSource().contains(pageLoadedText);

    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the HomePage class instance.
     */
    public boolean verifyPageUrl() {
                return driver.getCurrentUrl().contains(pageUrl);
    }
}
