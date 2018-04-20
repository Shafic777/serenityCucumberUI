package com.shafic.test.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;

public class ImdbSignInPage extends PageObject {

    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "ap_email")
    @CacheLookup
    private WebElement email;

    @FindBy(id = "ap_password")
    @CacheLookup
    private WebElement password;

    @FindBy(id = "signInSubmit")
    @CacheLookup
    private WebElement signInSubmit;


    public ImdbSignInPage() {
    }

    public ImdbSignInPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public ImdbSignInPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public ImdbSignInPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }


    /**
     * Set value to Email Email field.
     *
     * @return the ImdbSignInPage class instance.
     */
    public ImdbSignInPage setEmaiField(String emailValue) {
        email.sendKeys(emailValue);
        return this;
    }

    /**
     * Click on Password Button.
     *
     * @return the ImdbSignInPage class instance.
     */
    public ImdbSignInPage setPasswordvalue(String passwordValue) {
        password.sendKeys(passwordValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the ImdbSignInPage class instance.
     */
    public ImdbSignInPage submit() {
        signInSubmit.submit();
        return this;
    }
    /**
     * Fill every fields in the page.
     *
     * @return the ImdbSignInPage class instance.
     */
    public ImdbSignInPage fill(HashMap data) {
        setEmaiField(data.get("email").toString());
        setPasswordvalue(data.get("password").toString());
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the ImdbSignInPage class instance.
     */
    @Step
public ImdbSignInPage fillAndSubmit(HashMap data) {
        fill(data);
        return submit();
    }
}
