package com.shafic.test.steps;

import com.shafic.test.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class BaseSteps {
    HomePage homePage;



    @Step
    public void opens_home_page() {
        homePage.open();
    }
}
