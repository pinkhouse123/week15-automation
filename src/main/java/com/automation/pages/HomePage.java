package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.LogManager;

public class HomePage extends Utility {
    private static final Logger log = Logger.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    WebElement women;
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    WebElement dresses;
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    WebElement tshirts;
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    WebElement signInLinks;
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
    WebElement logo;


    public void clickOnWomen() {
        clickOnElement(women);
    }


    public void clickOnSignIn() {
        log.info("click on sign in link" + signInLinks.getText());
        clickOnElement(signInLinks);
    }

    public boolean signInLinkDisplayed() {
        log.info("check sign in link displayed" + signInLinks.getText());

        return signInLinks.isDisplayed();
    }


}