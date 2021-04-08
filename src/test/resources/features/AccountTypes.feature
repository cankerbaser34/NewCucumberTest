Feature: Account Types


  Scenario: Driver user
    Given the user logged in as "driver"
    When the user nagivates from "Activities" to "Calendar Events"
    Then the title contains "Calendar Events - Activities"

  Scenario: Sales manager user
    Given the user logged in as "sales manager"
    When the user nagivates from "Customers" to "Accounts"
    Then the title contains "Accounts - Customers"

  Scenario: Store manager user
    Given the user logged in as "store manager"
    When the user nagivates from "Customers" to "Contacts"
    Then the title contains "Contacts - Customers"


  Scenario Outline: Different user types

    Given the user logged in as "<userType>"
    When the user nagivates from "<tab>" to "<module>"
    Then the title contains "<title>"


    Examples:
      | userType      | tab        | module          | title                        |
      | driver        | Activities | Calendar Events | Calendar Events - Activities |
      | sales manager | Customers  | Accounts        | Accounts - Customers         |
      | store manager | Customers  | Contacts        | Contacts Customers           |
