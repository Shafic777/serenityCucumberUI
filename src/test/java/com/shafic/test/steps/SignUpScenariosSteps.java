package com.shafic.test.steps;

import com.shafic.test.pages.HomePage;
import com.shafic.test.pages.SignUpPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SignUpScenariosSteps {

    @Steps
    UserSteps user;
    HomePage homePage;
    SignUpPage signUpPage;

    @Given("^I have user details for sign up$")
    public void givenSignUpDetails()
    {
        user.opens_home_page();
    }

    @When("^I input the user details and submit$")
    public void iInputTheUserDetailsAndSubmit() throws Throwable {
        homePage.clickOtherSignInOptionsLink();
        signUpPage.clickCreateANewAccountLink();
        signUpPage.fillAndSubmit();
    }

    @Then("^I should be able to see my account page$")
    public void iShouldBeAbleToSeeMyAccountPage() throws Throwable {
        homePage.verifyAccountDetails();
    }

    @Given("^I have user details for sign up (.*) (.*) (.*)$")
    public void iHaveUserDetailsForSignUpEmailPasswordName(String Email,String password,String Name) throws Throwable {
        System.out.println(Email);
    }

   /* @Given("^I have user details for sign up '<Email>' '<Password>' '<Name>'$")
    public void iHaveUserDetailsForSignUpEmailPasswordName() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }*/
}
