Feature: First feature

  Scenario: First scenario

    Given user go to "https://www.saucedemo.com/" page
    And user enter "standard_user" user name
    And user enter "secret_sauce" password
    When user click on Log in button
    Then page with products is displayed