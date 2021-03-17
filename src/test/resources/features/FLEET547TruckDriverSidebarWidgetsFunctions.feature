Feature: as a Truck Driver Vehicle InformationFunctionality widgets

  Background:
    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login
    When the user navigates to "Fleet" to "Vehicles"

  @FLEET-649 @FLEET-547
  Scenario:As Truck Driver plus sign functionality for Recent Emails
    And the user clicks on plus sign
    And the user clicks enter keyword inputbox
    And sends Recent emails keys
    Then verify Recent email title displayed
    When clicks on add button
    Then verify Added sign displayed
    When clicks on Close Button
    Then verify Recent Email Widget added on the plus sign.

  @FLEET-650 @FLEET-547
  Scenario:As Truck Driver plus sign functionality for Sticky Note
    When the user clicks on plus sign
    Then user should be able to click add button for Sticky Note
    When clicks on Close Button
    Then verify Sticky Note Widget added.

  @FLEET-652 @FLEET-547
  Scenario:As Truck Driver plus sign functionality for Task list
    When the user clicks on plus sign
    Then user should be able to click add button Task list
    When clicks on Close Button
    Then verify Task list added.

  @FLEET-653 @FLEET-547
  Scenario: As Truck Driver pin sign functionality
    When user clicks on pin button
    Then verifies existing page pinned
    When user clicks on pin button
    Then verifies Learn how to use this space text displayed

  @FLEET-654 @FLEET-547
  Scenario: As Truck Driver favourite sign functionality
    When user clicks on favourite sign button
    And clicks on dropdown menu
    When user clicks on Favorites
    Then verifies existing favourites pages displayed
    When user clicks on Favorites
    And user close Favorites button

