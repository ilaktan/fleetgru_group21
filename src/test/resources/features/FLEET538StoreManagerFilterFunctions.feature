@FLEET-538
Feature: Filter Functions as a store manager

  Background:
    #@FLEET-553
    Given the user is on the login page
    When the user enters the store manager information
    Then the user should be able to login

  @FLEET-611 @FLEET-632
  Scenario: Use Grid Setting button as a store manager
    When the user navigates to "Fleet" to "Vehicles"
    When the user click the Grid Setting button
    Then following columns should be available under grid settings button
      |Id                        |
      |License Plate             |
      |Tags                      |
      |Driver                    |
      |Location                  |
      |Chassis Number            |
      |Model Year                |
      |Last Odometer             |
      |Immatriculation Date      |
      |First Contract Date       |
      |Catalog Value (VAT Incl.) |
      |Seats Number              |
      |Doors Number              |
      |Color                     |
      |Transmission              |
      |Fuel Type                 |
      |CO2 Emissions             |
      |Horsepower                |
      |Horsepower Taxation       |
      |Power (KW)                |

  @FLEET-613 @FLEET-632
  Scenario: Use Grid Setting Button as a store manager -Search Valid item
    When the user navigates to "Fleet" to "Vehicles"
    When the user click the Grid Setting button
    And the user searches column name "Driver" in the Quick Search input
    Then the system should display "Driver" column under dropdown menu.

  @FLEET-615 @FLEET-632
  Scenario: Use Grid Setting Button as a store manager -Search invalid item
    When the user navigates to "Fleet" to "Vehicles"
    When the user click the Grid Setting button
    And the user searches column name "Idd" in the Quick Search input
    Then the system should display "No columns found" message under dropdown menu.


  @FLEET-617 @FLEET-632
  Scenario: Using Grid Setting Button as a store manager -Click Unclick the Column option
    When the user navigates to "Fleet" to "Vehicles"
    When the user click the Grid Setting button
    And user click the "Id" column
    Then the system should display "ID" column on the webpage
    And user unselect the "Tags" column
    Then the system should not display "Tags" column on the webpage


  @FLEET-619 @FLEET-632
  Scenario: Manage Filter button options as a store manager
    When the user navigates to "Fleet" to "Vehicles"
    When the user click the filter button
    And the user click the manage filter button
    Then following columns should be available under manage filter button
      |License Plate             |
      |Tags                      |
      |Driver                    |
      |Location                  |
      |Chassis Number            |
      |Model Year                |
      |Last Odometer             |
      |Immatriculation Date      |
      |First Contract Date       |
      |Catalog Value (VAT Incl.) |
      |Seats Number              |
      |Doors Number              |
      |Color                     |
      |Transmission              |
      |Fuel Type                 |
      |CO2 Emissions             |
      |Horsepower                |
      |Horsepower Taxation       |
      |Power (KW)                |


  @FLEET-621 @FLEET-632
  Scenario: Use Manage-Filter Button as a store manager - Searching invalid item
    When the user navigates to "Fleet" to "Vehicles"
    When the user click the filter button
    And the user click the manage filter button
    And User searches "diver" column in the Search input
    Then verifies driver not displayed

  @FLEET-623 @FLEET-632
  Scenario: Use Manage-Filter Button as a store manager - Searching valid item
    When the user navigates to "Fleet" to "Vehicles"
    When the user click the filter button
    And the user click the manage filter button
    And User searches "Driver" column in the Search input
    Then the system should display the "Driver" option under dropdown menu

  @FLEET-625 @FLEET-632
  Scenario: Filters sign functionality as a store manager
    When the user navigates to "Fleet" to "Vehicles"
    When the user click the filter button
    And the user click the manage filter button
    And the user click the "License Plate" button
    Then the user should be able to see the "License Plate" on the filter container
    When the user click the "License Plate" button on the filter container
    And user clicks on Contains button;
    Then verifies Contains dropdown menu displayed
    Then user should be able to see following dropdown menu options
      |Contains         |
      |Does Not Contain |
      |Is Equal To      |
      |Starts With      |
      |Ends With        |
      |Is Any Of        |
      |Is Not Any Of    |
      |Is Empty         |
      |Is Not Empty     |

  @FLEET-627 @FLEET-632
  Scenario: Using the Manage Filter as a store manager -Contains button with valid item
    When the user navigates to "Fleet" to "Vehicles"
    When the user click the filter button
    And the user click the manage filter button
    And the user click the "Location" button
    Then the user should be able to see the "Location" on the filter container
    When the user click the "Location" button on the filter container
    When the search "Florida" in the search box
    Then The system should only show records that contain the Location "Florida"

  @FLEET-629 @FLEET-632
  Scenario: Using Refresh button as a store manager
    When the user navigates to "Fleet" to "Vehicles"
    When the user go to page "4"
    And the user click the refresh button
    Then page input should be "4"

  @FLEET-631 @FLEET-632
  Scenario: Using Reset button as a store manager
    When the user navigates to "Fleet" to "Vehicles"
    When the user click the Grid Setting button
    And user click the "Id" column
    Then the system should display "ID" column on the webpage
    And the user click the reset button
    Then the system should not display "ID" column on the webpage
