package com.shafic.test;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features="src/test/resources/features/SignUp.feature")
@CucumberOptions(features="src/test/resources/features/Search_MostWatched_TVShows.feature")
public class searchPopularTVShows {
}
