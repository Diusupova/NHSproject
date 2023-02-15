@regression
Feature: Sign-in functionality

  Scenario: TC-1NHS positive login testing
    Given The user navigate to the NHS website
    And User validates the url of the page
    When The user enter the valid username and valid password
    And The user press the SignIn button
    Then The user validates the title

  Scenario: TC-2NHS nagative testing with incorrect username
    Given The user navigate to the NHS website and try to login
    And User validates the url of the page of the main page
    When The user enters the invalid username and valid password
    And The user click the SignIn button


  Scenario: TC-3NHS negative testing with incorrect username
    Given the user navigated to the NHS website
    And User validated the url of the page of the main page
    When the user enter the username and blank password
    And the user press the SingIn button
#    Then the user validates error message.


