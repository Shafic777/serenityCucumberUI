package com.shafic.test.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class RegistrationPage extends PageObject {

    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a.list-group-item.create-account")
    @CacheLookup
    private WebElement createANewAccount;

    @FindBy(xpath = "//span[text()='Sign in with IMDb']")
    @CacheLookup
    private WebElement signInWithImdb;

    public RegistrationPage() {
    }

    public RegistrationPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public RegistrationPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public RegistrationPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Create A New Account Link.
     *
     * @return the RegistrationPage class instance.
     */
    @Step
    public RegistrationPage clickCreateANewAccountLink() {
        createANewAccount.click();
        return this;
    }

    /**
     * Click on Sign In With Imdb Link.
     *
     * @return the RegistrationPage class instance.
     */
    @Step
    public RegistrationPage clickSignInWithImdbLink() {
        signInWithImdb.click();
        return this;
    }

}
