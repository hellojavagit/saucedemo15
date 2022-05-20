$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("purchase.feature");
formatter.feature({
  "line": 2,
  "name": "Search functionality",
  "description": "As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by High to Low filter",
  "id": "search-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 2924155600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User navigates saucedemo page and complete the item purchase",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchase",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on saudemopage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I login with credential username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I filter the products by price \"Price (high to low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select cheapest \u0026 costiliest products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter details firstname \"cucumber\",lastName \"testing\" and zipPostalCode \"133456\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should be able to see message \u0027Thank you for your order\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "PurchaseTest.iAmOnSaudemopage()"
});
formatter.result({
  "duration": 74107700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 34
    },
    {
      "val": "secret_sauce",
      "offset": 63
    }
  ],
  "location": "PurchaseTest.iLoginWithCredentialUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 149927400,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iClickOnLoginButton()"
});
formatter.result({
  "duration": 97837300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (high to low)",
      "offset": 32
    }
  ],
  "location": "PurchaseTest.iFilterTheProductsByPrice(String)"
});
formatter.result({
  "duration": 133664700,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iSelectCheapestCostiliestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 97030500,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iOpenShoppingCart()"
});
formatter.result({
  "duration": 47647100,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iGoToCheckout()"
});
formatter.result({
  "duration": 48978600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cucumber",
      "offset": 27
    },
    {
      "val": "testing",
      "offset": 47
    },
    {
      "val": "133456",
      "offset": 75
    }
  ],
  "location": "PurchaseTest.iEnterDetailsFirstnameLastNameAndZipPostalCode(String,String,String)"
});
formatter.result({
  "duration": 206720400,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iClickOnContinueButton()"
});
formatter.result({
  "duration": 53519100,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iClickOnFinishButton()"
});
formatter.result({
  "duration": 47116000,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iShouldBeAbleToSeeMessageThankYouForYourOrder()"
});
formatter.result({
  "duration": 26535000,
  "status": "passed"
});
formatter.after({
  "duration": 691817600,
  "status": "passed"
});
});