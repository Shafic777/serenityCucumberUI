package com.shafic.test.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;

public class SignUpPage extends PageObject {

    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "ap_customer_name")
    @CacheLookup
    private WebElement yourName;

    @FindBy(id = "ap_email")
    @CacheLookup
    private WebElement email;

    @FindBy(id = "ap_password")
    @CacheLookup
    private WebElement password;

    @FindBy(id = "ap_password_check")
    @CacheLookup
    private WebElement reenterPassword1;

    @FindBy(id = "continue")
    @CacheLookup
    private WebElement createNewAccount;

    //td[@class='titleColumn']/a[text()='The Terror']

    public SignUpPage() {
    }

    public SignUpPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public SignUpPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public SignUpPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }


    /**
     * Set default value to Reenter Password Password field.
     *
     * @return the SignUpPage class instance.
     */
    public SignUpPage setReEnterPassword() {
        return setReEnterPassword("PASSWORD");
    }

    /**
     * Click on Reenter Password Button.
     *
     * @return the SignUpPage class instance.
     */
    public SignUpPage setReEnterPassword(String reenterPasswordValue) {
        reenterPassword1.sendKeys(reenterPasswordValue);
        return this;
    }

    /**
     * Click on Reenter Password Button.
     *
     * @return the SignUpPage class instance.
     */
    @Step
    public SignUpPage clickSubmit() {
        createNewAccount.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the SignUpPage class instance.
     * @param map
     */
    @Step
    public SignUpPage fill(HashMap map) {
        setYourNameTextField(map.get("name").toString());
        setEmailEmailField(map.get("email").toString());
        setPasswordPasswordField(map.get("password").toString());
        setReEnterPassword(map.get("password").toString());
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the SignUpPage class instance.
     * @param map
     */
    @Step
    public SignUpPage fillAndSubmit(HashMap map) {
        fill(map);
        return clickSubmit();
    }

    /**
     * Set default value to Email Email field.
     *
     * @return the SignUpPage class instance.
     */
    public SignUpPage setEmailEmailField() {
        return setEmailEmailField("EMAIL123456@gmail.com");
    }

    /**
     * Set value to Email Email field.
     *
     * @return the SignUpPage class instance.
     */
    public SignUpPage setEmailEmailField(String emailValue) {
        email.sendKeys(emailValue);
        return this;
    }

    /**
     * Set default value to Password Password field.
     *
     * @return the SignUpPage class instance.
     */
    public SignUpPage setPasswordPasswordField() {
        return setPasswordPasswordField("PASSWORD");
    }

    /**
     * Set value to Password Password field.
     *
     * @return the SignUpPage class instance.
     */
    public SignUpPage setPasswordPasswordField(String passwordValue) {
        password.sendKeys(passwordValue);
        return this;
    }

    /**
     * Set default value to Your Name Text field.
     *
     * @return the SignUpPage class instance.
     */
    public SignUpPage setYourNameTextField() {
        return setYourNameTextField("Shafic_Cucumber");
    }

    /**
     * Set value to Your Name Text field.
     *
     * @return the SignUpPage class instance.
     */
    public SignUpPage setYourNameTextField(String yourNameValue) {
        yourName.sendKeys(yourNameValue);
        return this;
    }



}
