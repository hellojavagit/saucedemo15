package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath="//*[@id='shopping_cart_container']/a")
    WebElement openShoppingCartButton;
    @CacheLookup
    @FindBy(xpath="//button[@name='checkout']")
    WebElement checkOutButton;

    public void clickOnOpenShoppingCartButton() {
        clickOnOpenShoppingCartButton();
        log.info("Clicking on open shopping cart" + openShoppingCartButton.toString());
    }
    public void clickOnCheckOutButton(){
        clickOnElement(checkOutButton);
        log.info("Clicking On checkOut Button" + checkOutButton.toString());
    }
}
