package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.ro.Si;
import org.junit.Assert;

public class LoginTestPage {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @And("^I click on Sign in link$")
    public void iClickOnSignInLink() {
        new HomePage().clickOnSignIn();
    }


    @Then("^verify that 'AUTHENTICATION' message is displayed$")
    public void verifyThatAUTHENTICATIONMessageIsDisplayed() {
        Assert.assertEquals("Not on sign in page", "AUTHENTICATION", new SignInPage().getTextAuthentication());
    }


    @And("^I click on sign in button$")
    public void iClickOnSignInButton() {
        new SignInPage().clickOnSignButton();
    }

    @Then("^Verify the Error message \"([^\"]*)\"$")
    public void verifyTheErrorMessage(String message) {
        Assert.assertEquals("Error message verification failed", message, new SignInPage().getErrorText());

    }

    @And("^Enter \"([^\"]*)\" in email field$")
    public void enterInEmailField(String email) {
        new SignInPage().setEmail(email);
    }

    @And("^Enter \"([^\"]*)\" in password field$")
    public void enterInPasswordField(String password) {
        new SignInPage().setPassword(password);
    }

    @Then("^Verify that Sign In link is displayed$")
    public void verifyThatSignInLinkIsDisplayed() {
        Assert.assertTrue(new HomePage().signInLinkDisplayed());
    }

    @And("^I enter Email address$")
    public void iEnterEmailAddress() {
        new SignInPage().setCreateEmail("umipatel123@gmail.com");
    }

    @And("^Click on 'Create an account' button$")
    public void clickOnCreateAnAccountButton() {
        new SignInPage().clickOnCreateNewAccount();
    }
}