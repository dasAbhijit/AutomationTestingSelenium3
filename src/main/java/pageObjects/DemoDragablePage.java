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

public class DemoDragablePage {
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

    @FindBy(id = "ui-id-2")
    @CacheLookup
    private WebElement constrainMovement;

    @FindBy(css = "a[title='Contact']")
    @CacheLookup
    private WebElement contact;

    @FindBy(id = "ui-id-3")
    @CacheLookup
    private WebElement cursorStyle;

    @FindBy(css = "a[href='http://demoqa.com/datepicker/']")
    @CacheLookup
    private WebElement datepicker;

    @FindBy(id = "ui-id-1")
    @CacheLookup
    private WebElement defaultFunctionality;

    @FindBy(css = "a.dropdown-toggle")
    @CacheLookup
    private WebElement demo;

    @FindBy(css = "a[title='Draggable']")
    @CacheLookup
    private WebElement draggable1;

    @FindBy(css = "#menu-item-140 a")
    @CacheLookup
    private WebElement draggable2;

    @FindBy(id = "ui-id-5")
    @CacheLookup
    private WebElement draggableSortable;

    @FindBy(css = "a[href='http://demoqa.com/droppable/']")
    @CacheLookup
    private WebElement droppable;

    @FindBy(id = "ui-id-4")
    @CacheLookup
    private WebElement events;

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

    private final String pageUrl = "/draggable/";

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

    public DemoDragablePage(WebDriver driver) {
        this.driver = driver;
    	PageFactory.initElements(driver,this);
    }

    public DemoDragablePage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public DemoDragablePage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Us Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on Accordion Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickAccordionLink() {
        accordion.click();
        return this;
    }

    /**
     * Click on Autocomplete Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickAutocompleteLink() {
        autocomplete.click();
        return this;
    }

    /**
     * Click on Blog Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickBlogLink() {
        blog.click();
        return this;
    }

    /**
     * Click on Constrain Movement Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickConstrainMovementLink() {
        constrainMovement.click();
        return this;
    }

    /**
     * Click on Contact Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickContactLink() {
        contact.click();
        return this;
    }

    /**
     * Click on Cursor Style Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickCursorStyleLink() {
        cursorStyle.click();
        return this;
    }

    /**
     * Click on Datepicker Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickDatepickerLink() {
        datepicker.click();
        return this;
    }

    /**
     * Click on Default Functionality Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickDefaultFunctionalityLink() {
        defaultFunctionality.click();
        return this;
    }

    /**
     * Click on Demo Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickDemoLink() {
        demo.click();
        return this;
    }

    /**
     * Click on Draggable Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickDraggable1Link() {
        draggable1.click();
        return this;
    }

    /**
     * Click on Draggable Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickDraggable2Link() {
        draggable2.click();
        return this;
    }

    /**
     * Click on Draggable Sortable Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickDraggableSortableLink() {
        draggableSortable.click();
        return this;
    }

    /**
     * Click on Droppable Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickDroppableLink() {
        droppable.click();
        return this;
    }

    /**
     * Click on Events Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickEventsLink() {
        events.click();
        return this;
    }

    /**
     * Click on Frames And Windows Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickFramesAndWindowsLink() {
        framesAndWindows.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickHome1Link() {
        home1.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickHome2Link() {
        home2.click();
        return this;
    }

    /**
     * Click on Menu Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickMenuLink() {
        menu.click();
        return this;
    }

    /**
     * Click on Powered By Oneiric Tech Solutions Pvt. Ltd. Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickPoweredByOneiricTechSolutionsPvtLink() {
        poweredByOneiricTechSolutionsPvt.click();
        return this;
    }

    /**
     * Click on Registration Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickRegistrationLink() {
        registration.click();
        return this;
    }

    /**
     * Click on Resizable Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickResizableLink() {
        resizable.click();
        return this;
    }

    /**
     * Click on Selectable Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickSelectableLink() {
        selectable.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickServicesLink() {
        services.click();
        return this;
    }

    /**
     * Click on Slider Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickSliderLink() {
        slider.click();
        return this;
    }

    /**
     * Click on Sortable Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickSortableLink() {
        sortable.click();
        return this;
    }

    /**
     * Click on Tabs Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickTabs1Link() {
        tabs1.click();
        return this;
    }

    /**
     * Click on Tabs Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickTabs2Link() {
        tabs2.click();
        return this;
    }

    /**
     * Click on Toggle Navigation Button.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickToggleNavigationButton() {
        toggleNavigation.click();
        return this;
    }

    /**
     * Click on Toolsqa Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickToolsqaLink() {
        toolsqa.click();
        return this;
    }

    /**
     * Click on Tooltip Link.
     *
     * @return the DemoDragablePage class instance.
     */
    public DemoDragablePage clickTooltipLink() {
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
