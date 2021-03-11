
Feature: Truck driver specific info


   Background:
     Given the user is on the login page
     And the user logs in using "driver_username" and "driver_password"
     And the user goes to Vehicles page


  @FLEET-397 @FLEET-396 @FLEET-648
  Scenario:As a Storemanager/SalesManager I should be able to create car
     Then the user sees all informations about specific car


   @FLEET-398 @FLEET-396
   Scenario: Truck Driver can filter activities by using either Activity Type button or Date Range button
     And the user click on any line
     When the user filters using either Activity Type button
     Then data is filtered by Activity Type
     When the user filters using either Date Range button
     Then data is filtered by Date Range

   @FLEET-399 @FLEET-396
   Scenario: Truck Driver can refresh the activities by using refresh button
     And the user click on any line
     When the user clicks refresh button
     Then the data is refreshed

   @FLEET-400 @FLEET-396
   Scenario: Truck Driver can reach the all activities by using Newer and Older buttons
     And the user click on any line
     When the user clicks Newer
     Then the user sees all info
     When the user clicks Older
     Then the user sees all info
