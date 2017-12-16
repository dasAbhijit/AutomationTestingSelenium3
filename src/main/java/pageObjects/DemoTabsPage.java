package pageObjects;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoTabsPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[title='About us']")
    @CacheLookup
    private WebElement aboutUs;

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
    private WebElement home1;

    @FindBy(css = "#breadcrumbs li:nth-of-type(1) a")
    @CacheLookup
    private WebElement home2;

    @FindBy(css = "a[href='http://demoqa.com/menu/']")
    @CacheLookup
    private WebElement menu;

    private final String pageLoadedText = "The Selenium project produces various tools for automation testing such as Selenium IDE, Selenium Remote Control (RC), Selenium Grid and Selenium 2";

    private final String pageUrl = "/tabs/";

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


    public DemoTabsPage(WebDriver driver) {
        this.driver = driver;
    	PageFactory.initElements(driver,this);

    }

    public DemoTabsPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public DemoTabsPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Us Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on Accordion Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickAccordionLink() {
        accordion.click();
        return this;
    }

    /**
     * Click on Autocomplete Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickAutocompleteLink() {
        autocomplete.click();
        return this;
    }

    /**
     * Click on Blog Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickBlogLink() {
        blog.click();
        return this;
    }

    /**
     * Click on Contact Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickContactLink() {
        contact.click();
        return this;
    }

    /**
     * Click on Datepicker Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickDatepickerLink() {
        datepicker.click();
        return this;
    }

    /**
     * Click on Demo Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickDemoLink() {
        demo.click();
        return this;
    }

    /**
     * Click on Draggable Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickDraggable1Link() {
        draggable1.click();
        return this;
    }

    /**
     * Click on Draggable Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickDraggable2Link() {
        draggable2.click();
        return this;
    }

    /**
     * Click on Droppable Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickDroppableLink() {
        droppable.click();
        return this;
    }

    /**
     * Click on Frames And Windows Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickFramesAndWindowsLink() {
        framesAndWindows.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickHome1Link() {
        home1.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickHome2Link() {
        home2.click();
        return this;
    }

    /**
     * Click on Menu Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickMenuLink() {
        menu.click();
        return this;
    }

    /**
     * Click on Powered By Oneiric Tech Solutions Pvt. Ltd. Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickPoweredByOneiricTechSolutionsPvtLink() {
        poweredByOneiricTechSolutionsPvt.click();
        return this;
    }

    /**
     * Click on Registration Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickRegistrationLink() {
        registration.click();
        return this;
    }

    /**
     * Click on Resizable Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickResizableLink() {
        resizable.click();
        return this;
    }

    /**
     * Click on Selectable Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickSelectableLink() {
        selectable.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickServicesLink() {
        services.click();
        return this;
    }

    /**
     * Click on Slider Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickSliderLink() {
        slider.click();
        return this;
    }

    /**
     * Click on Sortable Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickSortableLink() {
        sortable.click();
        return this;
    }

    /**
     * Click on Tab 1 Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickTab1Link() {
        tab1.click();
        return this;
    }

    /**
     * Click on Tab 2 Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickTab2Link() {
        tab2.click();
        return this;
    }

    /**
     * Click on Tab 3 Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickTab3Link() {
        tab3.click();
        return this;
    }

    /**
     * Click on Tabs Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickTabs1Link() {
        tabs1.click();
        return this;
    }

    /**
     * Click on Tabs Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickTabs2Link() {
        tabs2.click();
        return this;
    }

    /**
     * Click on Toggle Navigation Button.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickToggleNavigationButton() {
        toggleNavigation.click();
        return this;
    }

    /**
     * Click on Toolsqa Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickToolsqaLink() {
        toolsqa.click();
        return this;
    }

    /**
     * Click on Tooltip Link.
     *
     * @return the DemoTabsPage class instance.
     */
    public DemoTabsPage clickTooltipLink() {
        tooltip.click();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the boolean class instance.
     */
    public boolean verifyPageLoaded() {
                return driver.getPageSource().contains(pageLoadedText);
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the boolean class instance.
     */
    public boolean verifyPageUrl() {
                return driver.getCurrentUrl().contains(pageUrl);
    }
}
