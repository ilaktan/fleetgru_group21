Feature: User can delete any car with valid credentials

  Background:

    Given the user is on the login page
    When the user enters the sales manager information
    Then the user should be able to login

  @FLEET-542
Scenario: Delete any car with valid credentials

   When the user navigates to "Fleet" to "Vehicles"
  Then the user can select any car by clicking check box from All-Cars page
  And the user can go and click to delete button at the end of menu bar
  And the user can click yes delete button at the delete confirmation box
