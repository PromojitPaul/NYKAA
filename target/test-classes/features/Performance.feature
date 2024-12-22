Feature: Website Performance

  Scenario: Page load time validation
    Given I am on the Nykaa homepage
    Then the page should load within 3 seconds

  Scenario: Image optimization check
    Given I am on the products page
    Then all product images should load within 1 second
    And images should have proper optimization attributes

  Scenario: Response time under load
    Given I am on the Nykaa homepage
    When I perform multiple page navigations
    Then each navigation should complete within 2 seconds