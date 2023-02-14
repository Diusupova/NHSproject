Feature: Sign-in functionality

  Scenario: TC-1NHS positive login testing
    Given The user navigate to the NHS website
    And User validates the url of the page
    When The user enter the valid username and valid password
    And The user press the SignIn button
    Then The user validates the title


