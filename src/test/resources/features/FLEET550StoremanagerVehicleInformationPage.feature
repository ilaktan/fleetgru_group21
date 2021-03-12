Feature: Store Manager get vehicle informations

  Background:
    Given the user is on the login page
    When the user enters the store manager information
    Then the user should be able to login
@FLEET-550b
Scenario: Store Manager can see vehicle information by navigating
  When the user navigates to "Fleet" to "Vehicles"
  Then the user can go any page by clicking page number
  And the user can change the entity number by clicking the View Per Page box
  And the user can get all informations to her_his own email address by using Export Grid button

