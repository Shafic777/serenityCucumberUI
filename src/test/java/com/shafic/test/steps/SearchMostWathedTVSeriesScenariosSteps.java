package com.shafic.test.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchMostWathedTVSeriesScenariosSteps  {

    @Steps
    UserSteps user;

    String seriesName;

    @Given("^Tv shows name to look into most watched list is \"([^\"]*)\"$")
    public void tvShowsNameToLookIntoMostWatchedListIs(String name) throws Throwable {
      this.seriesName=name;
    }

    @When("^I search in the most watched list$")
    public void iSearchInTheMostWatchedList() throws Throwable {
        user.opens_home_page();
        user.navigate_to_mostPopularTVShows();

    }

    @Then("^I should be able to find and see details of the series$")
    public void iShouldBeAbleToFindAndSeeDetailsOfTheSeries() throws Throwable {
        user
    }
}
