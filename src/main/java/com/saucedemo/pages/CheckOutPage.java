package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath="//input[@placeholder='First Name']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath="//input[@placeholder='Last Name']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath="//input[@placeholder='Zip/Postal Code']")
    WebElement zipPostalCode;

    @CacheLookup
    @FindBy(xpath="//*[@id=\"continue\"]")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath="//button[@name='finish']")
    WebElement finishButton;

    @CacheLookup
    @FindBy(xpath="//*[@id=\"checkout_complete_container\"]/h2")
    WebElement orderConfirmMessage;

    public void sendFirstName(String fname) {
        sendTextToElement(firstName, fname);
        log.info("Sending FirstName" + firstName.toString());
    }
    public void sendLastName(String lname) {
        sendTextToElement(lastName, lname);
        log.info("Sending Last Name" + lastName.toString());
    }
    public void sendZipPostalCode(String zpCode) {
        sendTextToElement(zipPostalCode,zpCode);
        log.info("Sending Zip / Postal Code" + zipPostalCode.toString());
    }
    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        log.info("Clicking On Continue" + continueButton.toString());
    }
    public void clickOnFinishButton() {
        clickOnElement(finishButton);
        log.info("Clicking on Finish " +finishButton.toString());
    }

    public String getOrderConfirmMessage(){
        log.info("Getting Order Confirmation Message" + orderConfirmMessage.toString());
        return getTextFromElement(orderConfirmMessage);
    }

    }






