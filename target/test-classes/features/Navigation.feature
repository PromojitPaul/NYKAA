Feature: Website Navigation

  Scenario: Navigate through main menu items
    Given I am on the Sweet Donut homepage
    When I click on the "Menu" link
    Then I should be on the menu page
    And I should see the list of available donuts

  Scenario: Check responsive navigation menu
    Given I am on the Sweet Donut homepage
    When I resize the browser to "mobile" view
    Then The navigation menu should collapse into a hamburger menu
    When I click the hamburger menu
    Then The menu items should be displayed in a vertical list