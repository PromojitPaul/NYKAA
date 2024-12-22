Feature: Shopping Cart Functionality

  Scenario: Add product to cart
    Given I am on the products page
    When I click "Add to Cart" on a product
    Then the product should be added to the cart
    And the cart count should increase

  Scenario: Update cart quantity
    Given I have items in my cart
    When I update the quantity of an item
    Then the cart total should be updated
    And the new quantity should be reflected