package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WomenCategoryPage extends Utility {
    private static final Logger log = LogManager.getLogger(WomenCategoryPage.class.getName());
    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Women']")
    WebElement verifyWomenWord;
    @CacheLookup
    @FindBy(xpath = "//a[@class='subcategory-name'][normalize-space()='Tops']")
    WebElement topsLink;
    @CacheLookup
    @FindBy(xpath = "//a[@class='subcategory-name'][normalize-space()='Dresses']")
    WebElement dressesLink;
    @CacheLookup
    @FindBy(id = "selectProductSort")
    WebElement selectProductSort;
    @CacheLookup
    @FindBy(xpath = "//i[@class='icon-th-list']")
    WebElement selectListView;
    @CacheLookup
    @FindBy(id = "center_column")
    WebElement selectProduct;
    @CacheLookup
    @FindBy(id = "group_1")
    WebElement selectSize;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Add to cart']")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Product successfully added to your shopping cart'][1]")
    WebElement confirmationText;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close window']")
    WebElement closeWindow;
    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement qtyfield;

    public String verifyWomenText() {
        log.info("get WOMEN text"+verifyWomenWord.getText());
        return getTextFromElement(verifyWomenWord);
    }


    public void setSelectProduct(String product) {
        log.info("Select product"+product);
        clickOnElement(By.xpath("//a[normalize-space()='" + product + "']"));
    }

    public void enterQty(String quantity) {
        log.info("update the quantity"+quantity);
        qtyfield.clear();
        sendTextToElement(qtyfield, quantity);
    }

    public void setSelectSize(String size) {
        log.info("Select the new size"+size);
        selectByVisibleTextFromDropDown(selectSize, size);
    }

    public void setSelectColour(String colour) {
        log.info("select colour"+colour);
        clickOnElement(By.xpath("//a[@title='" + colour + "']"));
    }

    public void setAddToCartButton() {
        log.info("click on add to cart"+addToCartButton.getText());
        clickOnElement(addToCartButton);
    }

    public String setConfirmationText() throws InterruptedException {
        log.info("get confirmation text"+confirmationText.getText());
        return getTextFromElement(confirmationText);
    }

    public void setCloseWindow() {
        log.info("Close pop up"+closeWindow.getText());
        clickOnElement(closeWindow);
    }


}