@US-542
Feature: User can delete any car with valid credentials
  #@FLEET-553
  Background:
    Given the user is on the login page
    When the user enters the sales manager information
    Then the user should be able to login
    When the user navigates to "Fleet" to "Vehicles"
  @FLEET-638a @ali
Scenario: Delete any car with valid credentials
  Then the user can select any car by clicking check box from All-Cars page
  And the user can go and click to delete button at the end of menu bar
  And the user can click yes delete button at the delete confirmation box
