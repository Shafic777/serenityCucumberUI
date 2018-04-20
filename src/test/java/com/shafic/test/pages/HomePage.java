package com.shafic.test.pages;
import java.util.Map;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.imdb.com/")
public class HomePage extends PageObject {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;



    @FindBy(id = "nblogin")
    @CacheLookup
    private WebElement otherSignInOptions;

    @FindBy(id = "nbusername")
    @CacheLookup
    private WebElement accountName;

    @FindBy(xpath = "//*[@id=\"navUserMenu\"]/span")
    @CacheLookup
    private WebElement userMenu;

    @FindBy(id = "nblogout")
    @CacheLookup
    private WebElement logOut;

    @FindBy(id = "navTitleMenu")
    @CacheLookup
    private WebElement moviesAndTvShowsMenu;

  /*  @FindBy(linkText = "Most Popular TV Shows")
    @CacheLookup
    private WebElement mostPopularTvShowsLink;*/

    @FindBy(xpath = "//*[@id=\"navMenu1\"]/div[3]/ul[1]/li[3]/a")
    @CacheLookup
    private WebElement mostPopularTvShowsLink;


    private final String pageLoadedText = "Find showtimes, watch trailers, browse photos, track your Watchlist and rate your favorite movies and TV shows on your phone or tablet";
    private final String pageUrl = "https://www.imdb.com/";

    public HomePage() {
    }

    public HomePage(WebDriver driver) {
        this();
        this.driver = driver;
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
     * Click on Other Sign In Options Link.
     *
     * @return the HomePage class instance.
     * @param driver
     */
    public HomePage accessMoivesAndTvShowsMenu(WebDriver driver) {
        Actions action = new Actions(driver);
        action.moveToElement(moviesAndTvShowsMenu).build().perform();
        mostPopularTvShowsLink.click();
        return this;
    }

    public HomePage accessMoivesAndTvShowsMenu() {
        Actions action = new Actions(this.driver);
        action.moveToElement(moviesAndTvShowsMenu).build().perform();
        mostPopularTvShowsLink.click();
        return this;
    }

    /**
     * Click on Other Sign In Options Link.
     *
     * @return the HomePage class instance.
     * @param driver
     */
    public HomePage clickOnMostPopularTvShows(WebDriver driver) {

        accessMoivesAndTvShowsMenu(driver);

        return this;
    }

    /**
     * Click on Other Sign In Options Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickUsermenu() {
        userMenu.click();

        return this;
    }

    /**
     * Click on Other Sign In Options Link.
     *
     * @return the HomePage class instance.
     */
    @Step
    public HomePage clickOtherSignInOptionsLink() {
        otherSignInOptions.click();
        return this;
    }
    /**
     * Get on Asda Link.
     *
     * @return the SignUpPage123 class instance.
     * @param accountDetails
     */
    @Step
    public HomePage verifyAccountDetails(String accountDetails) {
        accountName.getText().contains(accountDetails);
        return this;
    }

    /**
     * Click on Log Out Link.
     *
     * @return the HomePage class instance.
     */
    @Step
   public HomePage clickLogOutLink() {
        clickUsermenu();
        logOut.click();
        waitForAngularRequestsToFinish();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the HomePage class instance.
     */
    public HomePage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the HomePage class instance.
     */
    public HomePage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

