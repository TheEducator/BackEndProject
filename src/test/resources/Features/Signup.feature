
@Smoke
Feature: Automation Excercise

  @Register
  Scenario: Register User
    Given User is on main page and clicks sign up button and verifys new user sign up visible
    And User enters credentials and clicks sign up button
    When User verifys enter account visible and fills rest of the credientials
    And User selects checkboxes for newsletter and special offers
    Then User clicks create account button and verifys account created is visible
    And User clicks continue button and verifys loged in as user is visible
    And User clicks delete account button and verifys that account deleted and click continue button
    
    


