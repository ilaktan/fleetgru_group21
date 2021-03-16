@FLEET-641
Feature: smoke test

	#{color:#403294}*USER STORY:*{color}
	# *As a Truck Driver I should be able to get Vehicle informations*
	#
	#{color:#403294}*ACCEPTANCE CRITERIA:*{color}
	# 1-Truck driver can see vehicle informations once navigate to vehicle page
	# 2-Truck driver can change page number for getting following vehicle informations
	# 3-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	# 4-Truck driver can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats
	#
	# 
	#
	#{color:#00875a}*User Story :* {color}
	#
	#As a Storemanager/SalesManager I should be able to get Vehicle informations
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Storemanager/SalesManager can see vehicle informations once navigate to vehicle page
	#2-Storemanager/SalesManager can change page number for getting following vehicle informations
	#3-Storemanager/SalesManager can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#4-Storemanager/SalesManager can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats
	#
	# 
	@FLEET-642 @FLEET-639
	Scenario Outline: Smoke Test / Getting Vehicle Information as a Truck Driver/Storemanager/SalesManager
		Given the user is on the login page
		And the user logs in using "<username>" and "<password>"
		When the user navigates to "Fleet" "Vehicles"
		Then the sub-title should be "<sub-title>"
		Examples:
		| username               | password               | sub-title |
		| sales_manager_username | sales_manager_password | All Cars  |
		| store_manager_username | store_manager_password | All Cars  |
		| driver_username        | driver_password        | Cars      |	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to use all filtering functions
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can use Grid Settings button for arranging demanded columns.
	#2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations
	#3-Truck driver can refresh the page by using Refresh button
	#4-Truck driver can reset the filtering settings by using Reset button
	#
	# 
	#
	#{color:#403294}*User Story:*{color}
	# *As a Storemanager/SalesManager I should be able to use all filtering functions*
	#
	#{color:#403294}*Acceptance Criteria:*{color}
	# 1-Storemanager/SalesManager can use Grid Settings button for arranging demanded columns.
	# 2-Storemanager/SalesManager can use Filters sign with opening Manage Filters button for filtering informations
	# 3-Storemanager/SalesManager can refresh the page by using Refresh button
	# 4-Storemanager/SalesManager can reset the filtering settings by using Reset button
	@FLEET-643 @FLEET-639
	Scenario Outline: Smoke Test / Filter Function as a Truck Driver/Storemanager/SalesManager
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

	#Feature:  Storemanager/SalesManager create car function
	#
	#Background: 
	#
	#Given the user is on the login page
	#
	#And the user logs in as a
	#|sales manager|
	#|store manager|
	#
	#And the user goes to Vehicles page 
	#
	#When the user click on Create Car button 
	#
	# 
	#
	#Scenario: As a Storemanager/SalesManager I should be able to create car
	#
	#And enters license plate info
	#
	#And the user clicks on Save & Close button
	#
	#Then Entity is saved message is displayed
	#
	# 
	#
	# #bug
	#
	#Scenario: As a Storemanager/SalesManager I should be able to create car
	#
	#And the user clicks on Save & Close button
	#
	#Then Entity is saved message is displayed
	#
	# 
	#
	#Scenario: Storemanager/SalesManager can also add Vehicle Model Vehicle Make informations by using +Add button when creating car
	#
	#And the user clicks +Add to add vehicle model
	#
	#And the user clicks +Add to add vehicle make
	#
	#Then Entity is saved message is displayed 
	#
	#And new vehicle and make are displayed
	#
	# 
	#
	# 
	#
	# 
	#
	#*_Acceptance Criterias:_*
	#
	#1-Storemanager/SalesManager can create car by using Create Car button
	# 2-Storemanager/SalesManager can also add Vehicle Model Vehicle Make informations by using +Add button when creating car
	#
	# 
	#
	# 
	@FLEET-647 @FLEET-639
	Scenario Outline: SMOKE - As a Storemanager/SalesManager I should be able to create car
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
		
			

	#*User Story :* 
	#
	#As a Truck Driver When I click on any car in the grid, I should be able to see general informations about car.
	#
	# 
	#
	#*_Acceptance Criterias:_*
	#
	#1-*Truck Driver can see all informations about specific car.*
	# 2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	# 3-Truck Driver can refresh the activities by using refresh button
	# 4-Truck Driver can reach the all activities by using Newer and Older buttons
	@FLEET-648 @FLEET-639 @FLEET-396
	Scenario: SMOKE - Truck Driver can see all informations about specific car
		Given the user is on the login page
		And the user logs in using "driver_username" and "driver_password"
		And the user goes to Vehicles page
		Then the user sees all informations about specific car	

	#{color:#00875a}*User Story :* {color}
	#
	#Smoke test suit  user  should be able to login
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#_1-User can login with valid credentials (We have 3 types user such as sales manager, store manager, truck driver)._
	@FLEET-659 @FLEET-639
	Scenario Outline: Smoke Test Suit  Log Out Function With 3 Different User
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

	#Smoke Test-Truck Driver can click Add Event Button
	#
	#US-14:FLEET-549
	@FLEET-664 @FLEET-639
	Scenario: Smoke Test-Truck Driver Add Event Function
		 Given the user is on the login page
		 And the user logs in using "driver_username" and "driver_password"
		 And the user goes to Vehicles page
		 Then the user sees all informations about specific car
		 And the user clicks any car in the list
		 Then clicks the -Add Event- button
		 And clicks cancel button

	
	@FLEET-665 @FLEET-639
	Scenario Outline: Smoke Test-SalesManager/StoreManager edit car "<username>"
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