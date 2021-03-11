@SmokeSuit
Feature: Smoke Suit

  @FLEET-642 @FLEET-639
  Scenario: Getting Vehicle Information as a Truck Driver
    Given the user logged in successfully as a "truck driver"
    When the user navigates to "Fleet" "Vehicles"
    Then the sub-title should be "Cars"

  @FLEET-643 @FLEET-639
  Scenario: Filter Function as a Sales Manager
    Given the user logged in successfully as a "sales manager"
    When the user navigates to "Fleet" "Vehicles"
    When the user click the Grid Setting button
    Then should see grid setting title
    When the user click the filter button
    Then the user should see the Manage Filters button

  @FLEET-644 @FLEET-639
  Scenario: Filter Function as a Store Manager
    Given the user logged in successfully as a "store manager"
    When the user navigates to "Fleet" "Vehicles"
    When the user click the Grid Setting button
    Then should see grid setting title
    When the user click the filter button
    Then the user should see the Manage Filters button

  @FLEET-659
  Scenario: Login as a driver
    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login
  Scenario:  Login as a sales manager
    Given the user is on the login page
    When the user enters the sales manager information
    Then the user should be able to login
  Scenario: Login as a store manager
    Given the user is on the login page
    When the user enters the store manager information
    Then the user should be able to login


