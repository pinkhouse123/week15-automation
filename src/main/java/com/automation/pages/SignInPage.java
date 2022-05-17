package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPage extends Utility {

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    private static final Logger log = Logger.getLogger(SignInPage.class.getName());

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"passwd\"]")
    WebElement Password;
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
    WebElement signInButton;
    @CacheLookup
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    WebElement createanaccountbutton;
    @CacheLookup
    @FindBy(xpath = "//h3[contains(text(),'Create an account')]")
    WebElement creatanaccountText;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement authentication;
    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement createEmail;
    @CacheLookup
    @FindBy(xpath = "//ol//li")
    WebElement errorText;


    public void setCreateEmail(String email) {
        log.info("set created email" + email);
        sendTextToElement(createEmail, email);
    }

    public String getErrorText() {
        log.info("get error text" + errorText.getText());
        return getTextFromElement(errorText);
    }

    public void setEmail(String str) {
        log.info("set Email" + str);
        sendTextToElement(email, str);
    }

    public void setPassword(String str) {
        log.info("set password" + str);
        sendTextToElement(Password, str);
    }

    public void clickOnSignButton() {
        log.info("Click on sign in button" + signInButton);
        clickOnElement(signInButton);
    }


    public void clickOnCreateNewAccount() {
        log.info("click on create new account" + createanaccountbutton.getText());
        clickOnElement(createanaccountbutton);
    }

    public String getTextAuthentication() {
        log.info("get AUTHENTICATION text" + authentication.getText());
        return getTextFromElement(authentication);
    }


}