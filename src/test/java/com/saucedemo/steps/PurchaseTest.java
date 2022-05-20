package com.saucedemo.steps;

import com.saucedemo.pages.CheckOutPage;
import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class PurchaseTest {
    @Given("^I am on saudemopage$")
    public void iAmOnSaudemopage() {
        System.out.println("On HomePage");
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String username, String password) {
        new HomePage().sendUserName(username);
        new HomePage().sendPassWord(password);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLoginButton();
    }

    @And("^I filter the products by price \"([^\"]*)\"$")
    public void iFilterTheProductsByPrice(String choice) {
        new ProductsPage().selectSortByDropDown(choice);

    }

    @And("^I select cheapest & costiliest products and add to basket$")
    public void iSelectCheapestCostiliestProductsAndAddToBasket() {
        new ProductsPage().selectingCheapestProductFromDropDown();
        new ProductsPage().selectingCheapestProductFromDropDown();
    }


    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new ProductsPage().clickingOnShoppingCartButton();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new ShoppingCartPage().clickOnCheckOutButton();
    }

    @And("^I enter details firstname \"([^\"]*)\",lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String firstname, String lastname, String zipcode) {
        new CheckOutPage().sendFirstName(firstname);
        new CheckOutPage().sendLastName(lastname);
        new CheckOutPage().sendZipPostalCode(zipcode);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckOutPage().clickOnContinueButton();
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new CheckOutPage().clickOnFinishButton();
    }


    @Then("^I should be able to see message 'Thank you for your order'$")
    public void iShouldBeAbleToSeeMessageThankYouForYourOrder() {
        String expectedMessage= "THANK YOU FOR YOUR ORDER";
        Assert.assertEquals(expectedMessage,new CheckOutPage().getOrderConfirmMessage());
    }
}
