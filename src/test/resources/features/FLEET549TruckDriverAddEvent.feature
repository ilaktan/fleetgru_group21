
Feature: Truck Driver can edit car
  Background:

    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login
    When the user navigates to "Fleet" to "Vehicles"
    And the user clicks any car in the list
    And clicks the -Add Event- button
    

  @FLEET-556 @FLEET-558  @1
  Scenario: TruckDriver add event by Add Event button FLEET-549
    Then the user should edit the required fields

  @FLEET-555 @FLEET-558 #@1
  Scenario: Truck Driver able to see update in both general info and Activity tab FLEET-549
    Then the user should edit the required fields
    And the user should verify the info at General Information page with Activity tab.
