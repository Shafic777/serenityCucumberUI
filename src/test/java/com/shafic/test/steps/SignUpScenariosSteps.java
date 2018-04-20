package com.shafic.test.steps;

import com.shafic.test.pages.HomePage;
import com.shafic.test.pages.ImdbSignInPage;
import com.shafic.test.pages.RegistrationPage;
import com.shafic.test.pages.SignUpPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.sql.Timestamp;
import java.util.HashMap;

public class SignUpScenariosSteps {

    @Steps
    UserSteps user;
    HomePage homePage;
    RegistrationPage regpage;
    SignUpPage signUpPage;
    ImdbSignInPage imdbSignInPage;

    HashMap map= new HashMap();


    @Given("^I have user details for sign up (.*) (.*) (.*)$")
    public void iHaveUserDetailsForSignUpEmailPasswordName(String Email,String password,String Name) throws Throwable {
        map.put("email",Email+getRandomNumber()+"@gmail.com");
        map.put("password",password);
        map.put("name", Name);

        user.opens_home_page();
    }

    @When("^I input the user details and submit$")
    public void iInputTheUserDetailsAndSubmit() throws Throwable {
        homePage.clickOtherSignInOptionsLink();
        regpage.clickCreateANewAccountLink();
        signUpPage.fillAndSubmit(map);
    }

    @Then("^I should be able to see my account page$")
    public void iShouldBeAbleToSeeMyAccountPage() throws Throwable {
        homePage.verifyAccountDetails(map.get("name").toString());
        homePage.clickLogOutLink();
    }

    @And("^I should be able to relogin to my account adn logout$")
    public void iShouldBeAbleToReloginToMyAccountAdnLogout() throws Throwable {
       wait(10000);
        homePage.clickOtherSignInOptionsLink();
        regpage.clickSignInWithImdbLink();
        imdbSignInPage.fillAndSubmit(map);
        homePage.verifyAccountDetails(map.get("name").toString());
        homePage.clickLogOutLink();

    }


   public static String getRandomNumber() {
       Timestamp timestamp = new Timestamp(System.currentTimeMillis());
       long randomLong=timestamp.getTime();
       return String.valueOf(randomLong);
   }


}
