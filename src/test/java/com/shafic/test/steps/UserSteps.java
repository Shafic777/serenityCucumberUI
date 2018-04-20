package com.shafic.test.steps;

import com.shafic.test.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class UserSteps {
    HomePage homePage;



    @Step
    public void opens_home_page() {
        homePage.open();
    }

    @Step
    public void navigate_to_mostPopularTVShows() {
        //homePage.clickOnMostPopularTvShows(homePage.getDriver());
        homePage.accessMoivesAndTvShowsMenu(homePage.getDriver());
    }

    @Step
    public void find_tvshows_In_mostPopularTVShows() {
        //homePage.clickOnMostPopularTvShows(homePage.getDriver());
        homePage.accessMoivesAndTvShowsMenu(homePage.getDriver());
    }
}
