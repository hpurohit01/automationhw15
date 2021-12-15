package com.automation.cucumber.steps;

import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SinInSteps {

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on sign in link$")
    public void iClickOnSignInLink() {
        new HomePage().clickOnSignInLinkOnHomePage();
    }

    @Then("^I navigate to sign in page successfully$")
    public void iNavigateToSignInPageSuccessfully() {
        String expectedMessage = "AUTHENTICATION";
        String actualMessage = new SignInPage().getAuthenticationText();
        Assert.assertEquals("This is not login page", expectedMessage, actualMessage);
    }

    @And("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username) {
        new SignInPage().enterYouremail(username);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new SignInPage().enterYourPassword(password);
    }

    @Then("^I should see the error message\"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String errormsg) {
        Assert.assertEquals("Error msg is different", errormsg, new SignInPage().verifyTextSuccessfully());
    }

    @And("^I click on signin button$")
    public void iClickOnSigninButton() {
        new SignInPage().clickOnSignInButton();
    }

    @Then("^I can see signout link$")
    public void iCanSeeSignoutLink() {
        new SignInPage().verifySignOutButtonIsDisplayed();
    }

    @Then("^I can see sign in link again$")
    public void iCanSeeSignInLinkAgain() {
        new HomePage().verifySignInLinkIsDisplayed();
    }

    @And("^I click on signout button$")
    public void iClickOnSignoutButton() {
        new SignInPage().clickOnSignOutButton();
    }

    @And("^I enter email for create account \"([^\"]*)\"$")
    public void iEnterEmailForCreateAccount(String email)  {
        new SignInPage().enterEmailfornewacountcreation(email);

    }

    @And("^I click on create new account button$")
    public void iClickOnCreateNewAccountButton() {
        new SignInPage().clickOnCreateAnAccountButton();
    }

}
