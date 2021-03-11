@SmokeSuit
Feature: Smoke Suit

  @FLEET-642 @FLEET-639
  Scenario: Getting Vehicle Information as a Truck Driver
    Given the user logged in successfully as a "truck driver"
    When the user navigates to "Fleet" "Vehicles"
    Then the sub-title should be "Cars"

  @FLEET-643 @FLEET-639
  Scenario Outline:Filter Function as a Truck Driver/Storemanager/SalesManager
    Given the user is on the login page
    And the user logs in using "<username>" and "<password>"
    When the user navigates to "Fleet" "Vehicles"
    When the user click the Grid Setting button
    Then should see grid setting title
    When the user click the filter button
    Then the user should see the Manage Filters button

    Examples:
      |username              |password              |
      |sales_manager_username|sales_manager_password|
      |store_manager_username|store_manager_password|
      |driver_username       |driver_password       |


  @FLEET-647 @FLEET-639
  Scenario Outline:As a Storemanager/SalesManager I should be able to create car
    Given the user is on the login page
    And the user logs in using "<username>" and "<password>"
    And the user goes to Vehicles page
    When the user click on Create Car button
    And enters license plate info
    And the user clicks on Save & Close button
    Then Entity is saved message is displayed
    Examples:
      |username              |password              |
      |sales_manager_username|sales_manager_password|
      |store_manager_username|store_manager_password|


  @FLEET-648 @FLEET-639
  Scenario:As a Storemanager/SalesManager I should be able to create car
    Given the user is on the login page
    And the user logs in using "driver_username" and "driver_password"
    And the user goes to Vehicles page
    Then the user sees all informations about specific car