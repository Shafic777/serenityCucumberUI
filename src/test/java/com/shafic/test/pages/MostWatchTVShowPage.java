package com.shafic.test.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class MostWatchTVShowPage extends PageObject {

    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(xpath = "//td[@class='titleColumn']")
    @CacheLookup
    private List<WebElement> allvalues;

    /**
     * Click on Sign In With Imdb Link.
     *
     * @return the RegistrationPage class instance.
     */

    public MostWatchTVShowPage getdata() {
        allvalues.size();
        ListIterator<WebElement> litr = null;
        litr=allvalues.listIterator();
        while(litr.hasNext())
        {
            System.out.println("ShaficTest:"+litr.next().getText());
        }
        return this;
    }

    //td[@class='titleColumn']/a[text()='The Terror']

    public MostWatchTVShowPage() {
    }

    public MostWatchTVShowPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public MostWatchTVShowPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public MostWatchTVShowPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

}
