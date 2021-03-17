@US-539
Feature:Plus sign functionality
  Background:
    #@FLEET-554
    Given the user is on the login page
    When the user enters the sales manager information
    Then the user should be able to login
    When the user navigates to "Fleet" to "Vehicles"
  @FLEET-591 @FLEET-596 @cns
  Scenario:As sales manager plus sign functionality for Recent Emails
    When the user clicks on plus sign
    And the user clicks enter keyword inputbox
    And sends Recent emails keys
    Then verify Recent email title displayed
    When clicks on add button
    Then verify Added sign displayed
    When clicks on Close Button
    Then verify Recent Email Widget added on the plus sign.
  @FLEET-592 @FLEET-596
  Scenario:As sales manager plus sign functionality for Sticky Note
    When the user clicks on plus sign
    Then user should be able to click add button for Sticky Note
    When clicks on Close Button
    Then verify Sticky Note Widget added.
  @FLEET-593 @FLEET-596
  Scenario:As sales manager plus sign functionality for Task list
    When the user clicks on plus sign
    Then user should be able to click add button Task list
    When clicks on Close Button
    Then verify Task list added.
  @FLEET-594 @FLEET-596  @cns
  Scenario: As sales manager pin sign functionality
    When user clicks on pin button
    Then verifies existing page pinned
    When user clicks on pin button
    Then verifies Learn how to use this space text displayed
  @FLEET-595 @FLEET-596 @cns

  Scenario: As sales manager favourite sign functionality
    When user clicks on favourite sign button
    And clicks on dropdown menu
    When user clicks on Favorites
    Then verifies existing favourites pages displayed
    And user close Favorites button