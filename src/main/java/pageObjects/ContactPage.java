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

public class ContactPage {
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

    @FindBy(name = "your-name")
    @CacheLookup
    private WebElement framesAndWindowsframesAndWindows1;

    @FindBy(name = "your-email")
    @CacheLookup
    private WebElement framesAndWindowsframesAndWindows2;

    @FindBy(name = "your-subject")
    @CacheLookup
    private WebElement framesAndWindowsframesAndWindows3;

    @FindBy(name = "your-message")
    @CacheLookup
    private WebElement framesAndWindowsframesAndWindows4;

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

    private final String pageUrl = "/contact/";

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

    @FindBy(css = "input.wpcf7-form-control.wpcf7-submit")
    @CacheLookup
    private WebElement send;

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

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    	PageFactory.initElements(driver,this);

    }

    public ContactPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public ContactPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Us Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on Accordion Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickAccordionLink() {
        accordion.click();
        return this;
    }

    /**
     * Click on Autocomplete Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickAutocompleteLink() {
        autocomplete.click();
        return this;
    }

    /**
     * Click on Blog Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickBlogLink() {
        blog.click();
        return this;
    }

    /**
     * Click on Contact Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickContactLink() {
        contact.click();
        return this;
    }

    /**
     * Click on Datepicker Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickDatepickerLink() {
        datepicker.click();
        return this;
    }

    /**
     * Click on Demo Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickDemoLink() {
        demo.click();
        return this;
    }

    /**
     * Click on Draggable Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickDraggable1Link() {
        draggable1.click();
        return this;
    }

    /**
     * Click on Draggable Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickDraggable2Link() {
        draggable2.click();
        return this;
    }

    /**
     * Click on Droppable Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickDroppableLink() {
        droppable.click();
        return this;
    }

    /**
     * Click on Frames And Windows Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickFramesAndWindowsLink() {
        framesAndWindows.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickHome1Link() {
        home1.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickHome2Link() {
        home2.click();
        return this;
    }

    /**
     * Click on Menu Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickMenuLink() {
        menu.click();
        return this;
    }

    /**
     * Click on Powered By Oneiric Tech Solutions Pvt. Ltd. Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickPoweredByOneiricTechSolutionsPvtLink() {
        poweredByOneiricTechSolutionsPvt.click();
        return this;
    }

    /**
     * Click on Registration Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickRegistrationLink() {
        registration.click();
        return this;
    }

    /**
     * Click on Resizable Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickResizableLink() {
        resizable.click();
        return this;
    }

    /**
     * Click on Selectable Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickSelectableLink() {
        selectable.click();
        return this;
    }

    /**
     * Click on Send Button.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickSendButton() {
        send.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickServicesLink() {
        services.click();
        return this;
    }

    /**
     * Click on Slider Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickSliderLink() {
        slider.click();
        return this;
    }

    /**
     * Click on Sortable Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickSortableLink() {
        sortable.click();
        return this;
    }

    /**
     * Click on Tabs Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickTabs1Link() {
        tabs1.click();
        return this;
    }

    /**
     * Click on Tabs Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickTabs2Link() {
        tabs2.click();
        return this;
    }

    /**
     * Click on Toggle Navigation Button.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickToggleNavigationButton() {
        toggleNavigation.click();
        return this;
    }

    /**
     * Click on Toolsqa Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickToolsqaLink() {
        toolsqa.click();
        return this;
    }

    /**
     * Click on Tooltip Link.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage clickTooltipLink() {
        tooltip.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage fill() {
        setFramesAndWindowsframesAndWindows1EmailField();
        setFramesAndWindowsframesAndWindows2EmailField();
        setFramesAndWindowsframesAndWindows3TextField();
        setFramesAndWindowsframesAndWindows4TextareaField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Frames And Windowsframes And Windows Email field.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage setFramesAndWindowsframesAndWindows1EmailField() {
        return setFramesAndWindowsframesAndWindows1EmailField(data.get("FRAMES_AND_WINDOWSFRAMES_AND_WINDOWS_1"));
    }

    /**
     * Set value to Frames And Windowsframes And Windows Email field.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage setFramesAndWindowsframesAndWindows1EmailField(String framesAndWindowsframesAndWindows1Value) {
        framesAndWindowsframesAndWindows1.sendKeys(framesAndWindowsframesAndWindows1Value);
        return this;
    }

    /**
     * Set default value to Frames And Windowsframes And Windows Email field.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage setFramesAndWindowsframesAndWindows2EmailField() {
        return setFramesAndWindowsframesAndWindows2EmailField(data.get("FRAMES_AND_WINDOWSFRAMES_AND_WINDOWS_2"));
    }

    /**
     * Set value to Frames And Windowsframes And Windows Email field.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage setFramesAndWindowsframesAndWindows2EmailField(String framesAndWindowsframesAndWindows2Value) {
        framesAndWindowsframesAndWindows2.sendKeys(framesAndWindowsframesAndWindows2Value);
        return this;
    }

    /**
     * Set default value to Frames And Windowsframes And Windows Text field.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage setFramesAndWindowsframesAndWindows3TextField() {
        return setFramesAndWindowsframesAndWindows3TextField(data.get("FRAMES_AND_WINDOWSFRAMES_AND_WINDOWS_3"));
    }

    /**
     * Set value to Frames And Windowsframes And Windows Text field.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage setFramesAndWindowsframesAndWindows3TextField(String framesAndWindowsframesAndWindows3Value) {
        framesAndWindowsframesAndWindows3.sendKeys(framesAndWindowsframesAndWindows3Value);
        return this;
    }

    /**
     * Set default value to Frames And Windowsframes And Windows Textarea field.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage setFramesAndWindowsframesAndWindows4TextareaField() {
        return setFramesAndWindowsframesAndWindows4TextareaField(data.get("FRAMES_AND_WINDOWSFRAMES_AND_WINDOWS_4"));
    }

    /**
     * Set value to Frames And Windowsframes And Windows Textarea field.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage setFramesAndWindowsframesAndWindows4TextareaField(String framesAndWindowsframesAndWindows4Value) {
        framesAndWindowsframesAndWindows4.sendKeys(framesAndWindowsframesAndWindows4Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the ContactPage class instance.
     */
    public ContactPage submit() {
        clickSendButton();
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
