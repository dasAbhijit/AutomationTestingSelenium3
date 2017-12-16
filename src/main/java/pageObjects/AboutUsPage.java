package pageObjects;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutUsPage {
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

    private final String pageLoadedText = " is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry’s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.";

    private final String pageUrl = "/about-us/";

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

   
    public AboutUsPage(WebDriver driver) {
        this.driver = driver;
    	PageFactory.initElements(driver,this);

    }

    public AboutUsPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public AboutUsPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Us Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on Accordion Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickAccordionLink() {
        accordion.click();
        return this;
    }

    /**
     * Click on Autocomplete Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickAutocompleteLink() {
        autocomplete.click();
        return this;
    }

    /**
     * Click on Blog Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickBlogLink() {
        blog.click();
        return this;
    }

    /**
     * Click on Contact Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickContactLink() {
        contact.click();
        return this;
    }

    /**
     * Click on Datepicker Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickDatepickerLink() {
        datepicker.click();
        return this;
    }

    /**
     * Click on Demo Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickDemoLink() {
        demo.click();
        return this;
    }

    /**
     * Click on Draggable Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickDraggable1Link() {
        draggable1.click();
        return this;
    }

    /**
     * Click on Draggable Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickDraggable2Link() {
        draggable2.click();
        return this;
    }

    /**
     * Click on Droppable Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickDroppableLink() {
        droppable.click();
        return this;
    }

    /**
     * Click on Frames And Windows Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickFramesAndWindowsLink() {
        framesAndWindows.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickHome1Link() {
        home1.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickHome2Link() {
        home2.click();
        return this;
    }

    /**
     * Click on Menu Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickMenuLink() {
        menu.click();
        return this;
    }

    /**
     * Click on Powered By Oneiric Tech Solutions Pvt. Ltd. Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickPoweredByOneiricTechSolutionsPvtLink() {
        poweredByOneiricTechSolutionsPvt.click();
        return this;
    }

    /**
     * Click on Registration Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickRegistrationLink() {
        registration.click();
        return this;
    }

    /**
     * Click on Resizable Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickResizableLink() {
        resizable.click();
        return this;
    }

    /**
     * Click on Selectable Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickSelectableLink() {
        selectable.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickServicesLink() {
        services.click();
        return this;
    }

    /**
     * Click on Slider Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickSliderLink() {
        slider.click();
        return this;
    }

    /**
     * Click on Sortable Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickSortableLink() {
        sortable.click();
        return this;
    }

    /**
     * Click on Tabs Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickTabs1Link() {
        tabs1.click();
        return this;
    }

    /**
     * Click on Tabs Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickTabs2Link() {
        tabs2.click();
        return this;
    }

    /**
     * Click on Toggle Navigation Button.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickToggleNavigationButton() {
        toggleNavigation.click();
        return this;
    }

    /**
     * Click on Toolsqa Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickToolsqaLink() {
        toolsqa.click();
        return this;
    }

    /**
     * Click on Tooltip Link.
     *
     * @return the AboutUsPage class instance.
     */
    public AboutUsPage clickTooltipLink() {
        tooltip.click();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the AboutUsPage class instance.
     */
    public boolean verifyPageLoaded() {
                return driver.getPageSource().contains(pageLoadedText);
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the AboutUsPage class instance.
     */
    public boolean verifyPageUrl() {
                return driver.getCurrentUrl().contains(pageUrl);
    }
}
