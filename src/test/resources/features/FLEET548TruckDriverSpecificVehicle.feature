@US-548
Feature: Truck driver specific info
   Background:
     #@FLEET-552
     Given the user is on the login page
     When the user enters the driver information
     Then the user should be able to login


  @FLEET-397
  Scenario:Truck Driver can see all informations about specific car
     When the user navigates to "Fleet" to "Vehicles"
     Then the user sees all informations about specific car

   @FLEET-398
   Scenario: Truck Driver can filter activities by using either Activity Type button or Date Range button
     When the user navigates to "Fleet" to "Vehicles"
     And the user click on any line
     When the user filters using either Activity Type button
     Then data is filtered by Activity Type
     When the user filters using either Date Range button
     Then data is filtered by Date Range

   @FLEET-399
   Scenario: Truck Driver can refresh the activities by using refresh button
     When the user navigates to "Fleet" to "Vehicles"
     And the user click on any line
     When the user clicks refresh button
     Then the data is refreshed

   @FLEET-400
   Scenario: Truck Driver can reach the all activities by using Newer and Older buttons
     When the user navigates to "Fleet" to "Vehicles"
     And the user click on any line
     When the user clicks Older
     And the user sees all info
     When the user clicks Newer
     Then the user sees all info

