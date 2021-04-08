@login
Feature: Users should be able to login

  Background:
    Given  the user is on the  login page

  @driver @anotherlabel
  Scenario: Login as a driver
    When  the user enters the driven information
    Then the user should be able to login

  @driver
  Scenario: Login as a sales manager
    When the user enters the sales manager information
    Then the user should be able to login

  @store_manager @anotherlabel
  Scenario: Login as a store manager
    When the user enters store manager information
    Then the user should be able to login

