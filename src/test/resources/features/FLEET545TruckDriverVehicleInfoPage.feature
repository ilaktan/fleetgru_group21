@FLEET-545
Feature: Getting Vehicle Information as a Truck Driver

  Background:
    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login


  Scenario: Getting Vehicle Information
    When the user navigates to "Fleet" to "Vehicles"
    Then the sub-title should be "Cars"


  Scenario: Default Page Number
    When the user navigates to "Fleet" to "Vehicles"
    Then the page number should be "1"


  Scenario: Using the Back-Forward Button
    When the user navigates to "Fleet" to "Vehicles"
    When the user should use the forward button
    When the user should use the back button
    Then verify the page numbers
      | 1 |
      | 2 |
      | 3 |
      | 4 |
      | 5 |
      | 6 |
      | 5 |
      | 4 |
      | 3 |
      | 2 |
      | 1 |


  Scenario: Using the page input-box
    When the user navigates to "Fleet" to "Vehicles"
    When the user writes on the page input box "5"
    Then the page input box should be "5"


  Scenario: Default Per Page Button Number
    When the user navigates to "Fleet" to "Vehicles"
    Then the per page button should be "25"


  Scenario: Using the View Per Page Button
    When the user navigates to "Fleet" to "Vehicles"
    When the user clicks the view per page button
    When the user select the item "100"
    Then the dropdown should be "100"
    Then row size should be "100"


  Scenario: Using Export-Grid button
    When the user navigates to "Fleet" to "Vehicles"
    When the user clicks on the Export Grid button
    And the user click the "CSV"
    Then the user should be able to see success message on the page