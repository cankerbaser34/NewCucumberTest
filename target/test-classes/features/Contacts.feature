Feature: Contacts page


  Scenario: Default page number
    Given the user is on the  login page
    And the user enters the driven information
    When the user nagivates from "Customers" to "Contacts"
    Then default page number should be 1


  Scenario: Verify Create Calender Event
    Given the user is on the  login page
    And the user enters the sales manager information
    When the user nagivates from "Activities" to "Calendar Events"
    Then  the title contains "Calendar"


  Scenario: Menu Options
    Given the user logged in as "driver"
    Then the user should see following options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |


  Scenario: Menu Options
    Given the user logged in as "sales manager"
    Then the user should see following options
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


  Scenario Outline: login as a given user
    Given the user is on the  login page
    When  the user logs in using following credentials
      | username  |  | <user>      |
      | password  |  | UserUser123 |
      | firstname |  | <firstName> |
      | lastname  |  | <lastName>  |

    Then the user should be able to login

    Examples:
      | user           | firstName | lastName  |
#      | user1          | Brenden   | Schneider |
      | storemanager85 | Stephan   | Haley     |