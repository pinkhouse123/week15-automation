package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Sign out")
    WebElement signOutLink;

    public boolean verifySignOutLink() {
        log.info("verify sign out displayed" + signOutLink.getText());
        return signOutLink.isDisplayed();
    }

    public void clickOnSignOut() {
        log.info("click on signout" + signOutLink.getText());
        clickOnElement(signOutLink);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement maleRadio;

    public void selectMrRadio() {
        log.info("select Gender radio buttton" + maleRadio.getText());
        clickOnElement(maleRadio);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstnameField;

    public void setFirstnameField(String first) {
        log.info("Set firstName field" + first);
        sendTextToElement(firstnameField, first);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastnameField;

    public void setLastnameField(String last) {
        log.info("Set lastName field" + last);
        sendTextToElement(lastnameField, last);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;

    public void setPasswordField(String password) {
        log.info("Set password field" + password);
        sendTextToElement(passwordField, password);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement firstname1;

    public void setFirstnameAdd(String firstAdd) {
        sendTextToElement(firstname1, firstAdd);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lastname1;

    public void setLastnameAdd(String lastAdd) {
        sendTextToElement(lastname1, lastAdd);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressField;

    public void setAddress(String address) {
        log.info("Set address field" + address);
        sendTextToElement(addressField, address);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='city']")
    WebElement city;

    public void setCityField(String cityField) {
        log.info("Set cityName field" + cityField);
        sendTextToElement(city, cityField);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement state;

    public void selectState(String stateName) {
        log.info("Set state" + stateName);
        selectByVisibleTextFromDropDown(state, stateName);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement country;

    public void selectCountry(String countryName) {
        log.info("Set country field" + countryName);
        selectByVisibleTextFromDropDown(country, countryName);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobileNum;

    public void setMobileNum(String number) {
        log.info("Set mob number field" + number);
        sendTextToElement(mobileNum, number);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement zipCode;

    public void setZipCode(String zip) {
        log.info("Set zip field" + zip);
        sendTextToElement(zipCode, zip);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='alias']")
    WebElement futureReference;

    public void setFutureReference(String add) {
        log.info("Set futureRef. field" + add);
        sendTextToElement(futureReference, add);
    }

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    WebElement registerButton;

    public void clickOnRegisterButton() {
        log.info("click on register button" + registerButton.getText());
        clickOnElement(registerButton);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id=\"center_column\"]/h1")
    WebElement myAccount;

    public String getMyAccountText() {
        log.info("get MY Account text" + myAccount.getText());
        return getTextFromElement(myAccount);
    }


}