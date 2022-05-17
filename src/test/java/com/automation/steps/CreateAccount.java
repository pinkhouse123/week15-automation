package com.automation.steps;

import com.automation.pages.CreateAccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class CreateAccount {
    @And("^I click on sign out button$")
    public void iClickOnSignOutButton() {
        new CreateAccountPage().clickOnSignOut();
    }

    @Then("^Verify that Sign Out link is displayed$")
    public void verifyThatSignOutLinkIsDisplayed() {
        Assert.assertTrue(new CreateAccountPage().verifySignOutLink());
    }

    @And("^Fill all mandatory fields$")
    public void fillAllMandatoryFields() {
        new CreateAccountPage().selectMrRadio();
        new CreateAccountPage().setFirstnameField("Umi");
        new CreateAccountPage().setLastnameField("Patel");
        new CreateAccountPage().setPasswordField("umi123");
        new CreateAccountPage().setAddress("14 Queen Road");
        new CreateAccountPage().setCityField("Maryland");
        new CreateAccountPage().selectState("Ohio");
        new CreateAccountPage().setZipCode("12340");
        new CreateAccountPage().selectCountry("United States");
        new CreateAccountPage().setMobileNum("0145789658");
        new CreateAccountPage().setFutureReference("tuipy");


    }

    @And("^I Click on 'Register' button$")
    public void iClickOnRegisterButton() {
        new CreateAccountPage().clickOnRegisterButton();
    }


    @Then("^Verify message 'My Account'$")
    public void verifyMessageMyAccount() {
        Assert.assertEquals("Account not created","MY ACCOUNT",new CreateAccountPage().getMyAccountText());
    }
}