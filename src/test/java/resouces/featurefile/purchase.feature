@regression
Feature:  Search functionality
  As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by High to Low filter

  Scenario: User navigates saucedemo page and complete the item purchase
    Given I am on saudemopage
    When I login with credential username "standard_user" and password "secret_sauce"
    And I click on Login button
    And I filter the products by price "Price (high to low)"
    And I select cheapest & costiliest products and add to basket
    And I open shopping cart
    And I go to checkout
    And I enter details firstname "cucumber",lastName "testing" and zipPostalCode "133456"
    And I click on continue button
    And I click on finish button
    Then I should be able to see message 'Thank you for your order'
