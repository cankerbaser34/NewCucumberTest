
@navigate
Feature: Sales manager should be able to login and navigate the menu

    Scenario: Sales manager check title of exptected title of Vehicles page

      Given  the sales manager is on the login page
      When  the sales manager enters credentials to login
      Then the sales manager should be able to login
      And the sales manager navigate to fleet Vehicles
      Then the sales should see the vehicles as a title

  @db
  Scenario: Sales manager checks title of expected title of Campaign page

        Given  the sales manager is on the login page
        When  the sales manager enters credentials to login
        Then the sales manager should be able to login
        And the sales manager navigate to fleet Marketing Compaigns
        Then the sales should see the Campaigns as a title

    Scenario: Sales manager checks title of expected title of Campaign page

      Given  the sales manager is on the login page
      When  the sales manager enters credentials to login
      Then the sales manager should be able to login
      And the sales manager navigate to fleet Activities Calendar events
      Then the sales should see the Calendars as a title


