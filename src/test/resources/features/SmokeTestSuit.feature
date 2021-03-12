@SmokeSuit
Feature: Smoke Suit

  @FLEET-642 @FLEET-639
  Scenario Outline: Getting Vehicle Information as a Truck Driver/Sales Manager/Store Manager
    Given the user is on the login page
    And the user logs in using "<username>" and "<password>"
    When the user navigates to "Fleet" "Vehicles"
    Then the sub-title should be "<sub-title>"
    Examples:
      | username               | password               | sub-title |
      | sales_manager_username | sales_manager_password | All Cars  |
      | store_manager_username | store_manager_password | All Cars  |
      | driver_username        | driver_password        | Cars      |



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
  Scenario:Truck Driver can see all informations about specific car
    Given the user is on the login page
    And the user logs in using "driver_username" and "driver_password"
    And the user goes to Vehicles page
    Then the user sees all informations about specific car


  @FLEET-659 @FLEET-639
  Scenario Outline: Login and Logout as a Truck Driver/Store Manager/Sales Manager
    Given the user is on the login page
    And the user logs in using "<username>" and "<password>"
    Then the title should be "<title>"
    When the user can logout with logout button
    Then the user should succesfully logout
    Examples:
      | username               | password               | title     |
      | sales_manager_username | sales_manager_password | Dashboard |
      | store_manager_username | store_manager_password | Dashboard |
      | driver_username        | driver_password        | Dashboard |

  Scenario:Truck Driver Add Event Function
    Given the user is on the login page
    And the user logs in using "driver_username" and "driver_password"
    And the user goes to Vehicles page
    Then the user sees all informations about specific car
    And the user clicks any car in the list
    Then clicks the -Add Event- button

  Scenario Outline:SalesManager/StoreManager edit car "<username>"
    Given the user is on the login page
    And the user logs in using "<username>" and "<password>"
    And the user navigates to "Fleet" to "Vehicles"
    When the user clicks any car in the list
    Then the user clicks car edit button
    And car edit page title should contain (Entities - System - Car - Entities - System)
    Examples:
      | username               | password               |
      | sales_manager_username | sales_manager_password |
      | store_manager_username | store_manager_password |