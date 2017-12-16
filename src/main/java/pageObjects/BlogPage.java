package pageObjects;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlogPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[title='About us']")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(css = "a[href='http://demoqa.com/accordion/']")
    @CacheLookup
    private WebElement accordion;

    @FindBy(css = "#post-379 header.entry-header.page-header div.entry-meta.text-muted span:nth-of-type(2) span.author.vcard a.url.fn.n")
    @CacheLookup
    private WebElement admin1;

    @FindBy(css = "#post-377 header.entry-header.page-header div.entry-meta.text-muted span:nth-of-type(2) span.author.vcard a.url.fn.n")
    @CacheLookup
    private WebElement admin2;

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

    private final String pageLoadedText = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using ‘lorem ipsum’ is that it has a more-or-less normal distribution of letters, as opposed to using ‘This here is content’ or ‘Osama Bin Laden wanted dead or…";

    private final String pageUrl = "/blog/";
    
    public String getPageUrl() {
		return pageUrl;
	}

    @FindBy(css = "#post-379 div:nth-of-type(2) a.thumbnail")
    @CacheLookup
    private WebElement pattern141;

    @FindBy(css = "#post-379 div:nth-of-type(3) a.thumbnail")
    @CacheLookup
    private WebElement pattern142;

    @FindBy(css = "#post-377 div:nth-of-type(2) a.thumbnail")
    @CacheLookup
    private WebElement pattern143;

    @FindBy(css = "#post-377 div:nth-of-type(3) a.thumbnail")
    @CacheLookup
    private WebElement pattern144;

    @FindBy(css = "a[href='http://oneiricindia.com/']")
    @CacheLookup
    private WebElement poweredByOneiricTechSolutionsPvt;

    @FindBy(css = "#post-379 footer.entry-meta p:nth-of-type(1) a.btn.btn-primary.btn-block")
    @CacheLookup
    private WebElement readMore1;

    @FindBy(css = "#post-379 footer.entry-meta p:nth-of-type(2) a.btn.btn-primary")
    @CacheLookup
    private WebElement readMore2;

    @FindBy(css = "#post-377 footer.entry-meta p:nth-of-type(1) a.btn.btn-primary.btn-block")
    @CacheLookup
    private WebElement readMore3;

    @FindBy(css = "#post-377 footer.entry-meta p:nth-of-type(2) a.btn.btn-primary")
    @CacheLookup
    private WebElement readMore4;

    @FindBy(css = "a[href='http://demoqa.com/registration/']")
    @CacheLookup
    private WebElement registration;

    @FindBy(css = "a[href='http://demoqa.com/resizable/']")
    @CacheLookup
    private WebElement resizable;

    @FindBy(css = "#post-377 header.entry-header.page-header h2.entry-title a")
    @CacheLookup
    private WebElement samplePost;

    @FindBy(css = "#post-379 header.entry-header.page-header h2.entry-title a")
    @CacheLookup
    private WebElement samplePost2;

    @FindBy(css = "a[href='http://demoqa.com/selectable/']")
    @CacheLookup
    private WebElement selectable;

    @FindBy(css = "#post-379 header.entry-header.page-header div.entry-meta.text-muted span:nth-of-type(1) a")
    @CacheLookup
    private WebElement september920141;

    @FindBy(css = "#post-377 header.entry-header.page-header div.entry-meta.text-muted span:nth-of-type(1) a")
    @CacheLookup
    private WebElement september920142;

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

    public BlogPage(WebDriver driver) {
        this.driver = driver;
    	PageFactory.initElements(driver,this);

    }

    public BlogPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public BlogPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Us Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on Accordion Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickAccordionLink() {
        accordion.click();
        return this;
    }

    /**
     * Click on Admin Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickAdmin1Link() {
        admin1.click();
        return this;
    }

    /**
     * Click on Admin Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickAdmin2Link() {
        admin2.click();
        return this;
    }

    /**
     * Click on Autocomplete Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickAutocompleteLink() {
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
        return this;
    }

    /**
     * Click on Contact Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickContactLink() {
        contact.click();
        return this;
    }

    /**
     * Click on Datepicker Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickDatepickerLink() {
        datepicker.click();
        return this;
    }

    /**
     * Click on Demo Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickDemoLink() {
        demo.click();
        return this;
    }

    /**
     * Click on Draggable Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickDraggable1Link() {
        draggable1.click();
        return this;
    }

    /**
     * Click on Draggable Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickDraggable2Link() {
        draggable2.click();
        return this;
    }

    /**
     * Click on Droppable Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickDroppableLink() {
        droppable.click();
        return this;
    }

    /**
     * Click on Frames And Windows Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickFramesAndWindowsLink() {
        framesAndWindows.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickHome1Link() {
        home1.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickHome2Link() {
        home2.click();
        return this;
    }

    /**
     * Click on Menu Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickMenuLink() {
        menu.click();
        return this;
    }

    /**
     * Click on Pattern14 Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickPattern141Link() {
        pattern141.click();
        return this;
    }

    /**
     * Click on Pattern14 Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickPattern142Link() {
        pattern142.click();
        return this;
    }

    /**
     * Click on Pattern14 Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickPattern143Link() {
        pattern143.click();
        return this;
    }

    /**
     * Click on Pattern14 Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickPattern144Link() {
        pattern144.click();
        return this;
    }

    /**
     * Click on Powered By Oneiric Tech Solutions Pvt. Ltd. Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickPoweredByOneiricTechSolutionsPvtLink() {
        poweredByOneiricTechSolutionsPvt.click();
        return this;
    }

    /**
     * Click on Read More Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickReadMore1Link() {
        readMore1.click();
        return this;
    }

    /**
     * Click on Read More Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickReadMore2Link() {
        readMore2.click();
        return this;
    }

    /**
     * Click on Read More Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickReadMore3Link() {
        readMore3.click();
        return this;
    }

    /**
     * Click on Read More Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickReadMore4Link() {
        readMore4.click();
        return this;
    }

    /**
     * Click on Registration Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickRegistrationLink() {
        registration.click();
        return this;
    }

    /**
     * Click on Resizable Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickResizableLink() {
        resizable.click();
        return this;
    }

    /**
     * Click on Sample Post2 Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickSamplePost2Link() {
        samplePost2.click();
        return this;
    }

    /**
     * Click on Sample Post Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickSamplePostLink() {
        samplePost.click();
        return this;
    }

    /**
     * Click on Selectable Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickSelectableLink() {
        selectable.click();
        return this;
    }

    /**
     * Click on September 9 2014 Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickSeptember920141Link() {
        september920141.click();
        return this;
    }

    /**
     * Click on September 9 2014 Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickSeptember920142Link() {
        september920142.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickServicesLink() {
        services.click();
        return this;
    }

    /**
     * Click on Slider Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickSliderLink() {
        slider.click();
        return this;
    }

    /**
     * Click on Sortable Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickSortableLink() {
        sortable.click();
        return this;
    }

    /**
     * Click on Tabs Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickTabs1Link() {
        tabs1.click();
        return this;
    }

    /**
     * Click on Tabs Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickTabs2Link() {
        tabs2.click();
        return this;
    }

    /**
     * Click on Toggle Navigation Button.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickToggleNavigationButton() {
        toggleNavigation.click();
        return this;
    }

    /**
     * Click on Toolsqa Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickToolsqaLink() {
        toolsqa.click();
        return this;
    }

    /**
     * Click on Tooltip Link.
     *
     * @return the BlogPage class instance.
     */
    public BlogPage clickTooltipLink() {
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
