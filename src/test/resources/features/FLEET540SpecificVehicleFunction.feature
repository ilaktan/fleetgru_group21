@FLEET-637
Feature: Functionality types

  Background:
    Given the user is on the login page
    When the user enters the store manager information
    Then the user should be able to login
    And the user navigates to "Fleet" to "Vehicles"

  @FLEET-634
  Scenario Outline: User should see any car's general information
    Then the user gets any "<car>" information
    And  the hompage contains "<title>"
    Examples:
      | car  | title   |
      | car1 | Johnson |
      | car2 | Denver  |
      | car3 | Plummer |


  @FLEET-635
  Scenario: Filtering functionality test
    When the user gets  car1 information
    And the user filters by using Activity Type
    And the user filters by using Date Range
    And the user refreshies by using Refresh button
    Then the user reach older page bt using Older button
    And the user reach newer page bt using Newer button
