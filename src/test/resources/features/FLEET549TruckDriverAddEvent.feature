@wip
Feature: Truck Driver can edit car
  Background:

    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login
    When the user navigates to "Fleet" to "Vehicles"
    And the user clicks any car in the list
    And clicks the -Add Event- button
    Then the user should edit the required fields

  @FLEET-556 @FLEET-558
  Scenario: TruckDriver add event by Add Event button US-343


  @FLEET-389 @FLEET-390
  Scenario: Truck Driver able to see update in both general info and Activity tab US-343

    And the user should verify the info at General Information page with Activity tab.