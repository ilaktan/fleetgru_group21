@US-541
Feature: Storemanager/SalesManager create car function

  @FLEET-393 @daryna
  Scenario Outline:As a Storemanager/SalesManager I should be able to create car
    Given the user is on the login page
    And the user logs in using "<username>" and "<password>"
    And the user goes to Vehicles page
    When the user click on Create Car button
    And enters license plate info
    And the user clicks on Save & Close button
    Then Entity is saved message is displayed
    Examples:
      |username|password|
      |sales_manager_username|sales_manager_password|
      |store_manager_username|store_manager_password|

  @FLEET-394 @dr
  Scenario Outline: Storemanager/SalesManager can also add xVehicle Model Vehicle Make informations by using +Add button when creating car
    Given the user is on the login page
    And the user logs in using "<username>" and "<password>"
    And the user goes to Vehicles page
    When the user click on Create Car button
    And the user clicks +Add to add vehicle model
    And the user clicks +Add to add vehicle make
    Then Entity is saved message is displayed
    And new vehicle and make are displayed
    Examples:
      |username|password|
      |sales_manager_username|sales_manager_password|
      |store_manager_username|store_manager_password|