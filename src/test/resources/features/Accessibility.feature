Feature: Website Accessibility

  Scenario: Image accessibility
    Given I am on the Nykaa homepage
    Then all images should have alt text
    And all buttons should have aria labels

  Scenario: Keyboard navigation
    Given I am on the Nykaa homepage
    When I navigate using the tab key
    Then all interactive elements should be focusable
    And the focus order should be logical

  Scenario: Screen reader compatibility
    Given I am on the Nykaa homepage
    Then all content should be screen reader accessible
    And dynamic content updates should be announced