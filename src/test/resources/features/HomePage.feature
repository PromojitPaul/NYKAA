Feature: Nykaa Website Homepage

  Scenario: Verify homepage loads successfully
    Given I am on the Nykaa homepage
    Then I should see the main navigation menu
    And I should see the featured products section

  Scenario: Verify navigation menu functionality
    Given I am on the Nykaa homepage
    When I click on each navigation menu item
    Then I should be directed to the corresponding page

  Scenario: Check responsive design
    Given I am on the Nykaa homepage
    When I resize the browser window to different dimensions
    Then The website should adapt to the screen size
    And All elements should be properly visible and aligned