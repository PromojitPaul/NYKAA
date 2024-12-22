Feature: Product Catalog

  Scenario: View product details
    Given I am on the products page
    When I click on a product card
    Then I should see detailed product information
    And The price should be displayed
    And The "Add to Cart" button should be visible

  Scenario: Filter products by category
    Given I am on the products page
    When I select the "Glazed" category
    Then I should only see glazed donuts in the results
    And The product count should match the filtered results