package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductsPage.class.getName());

    public ProductsPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath="//select[@class='product_sort_container']")
    WebElement sortByDropDown;

    @CacheLookup
    @FindBy(xpath = "//div[@class='inventory_list']/div[1]/div/div/button")
    WebElement costliestProduct;

    @CacheLookup
   // "//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]"
    @FindBy(xpath="//option[@value='lohi']")
    WebElement cheapestProduct;

    @CacheLookup
    @FindBy(xpath="//a[@class='shopping_cart_link']")
    WebElement shoppingCartButton;

    public void selectSortByDropDown(String choice) {
        selectByVisibleTextFromDropDown(sortByDropDown, choice);
        log.info("Selecting Sort By " + sortByDropDown.toString());
    }

    public void selectingCostliestProductFromDropDown() {
       clickOnElement(costliestProduct);
        log.info("Selecting costly product" + costliestProduct.toString());
    }
    public void selectingCheapestProductFromDropDown() {
        clickOnElement(costliestProduct);
        log.info("Selecting cheapest product" + cheapestProduct.toString());
    }
    public void clickingOnShoppingCartButton() {
        clickOnElement(shoppingCartButton);
        log.info("Clicking on Add To Cart" + shoppingCartButton.toString());
    }

    }





