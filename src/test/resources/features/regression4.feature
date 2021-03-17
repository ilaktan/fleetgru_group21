@regression
Feature:

	#*User Story :* 
	#
	#As a Truck Driver When I click on any car in the grid, I should be able to see general informations about car.
	#
	# 
	#

	#*_Acceptance Criterias:_*
	#
	#1-Truck Driver can see all informations about specific car.
	#
	#2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	#
	#3-Truck Driver can refresh the activities by using refresh button
	#
	#*4-Truck Driver can reach the all activities by using Newer and Older buttons*
	@FLEET-400 @FLEET-667 @FLEET-396
	Scenario: Truck Driver can reach the all activities by using Newer and Older buttons
		Given the user is on the login page
		When the user enters the driver information
		Then the user should be able to login
		When the user navigates to "Fleet" to "Vehicles"
		And the user click on any line
		When the user clicks Newer
		Then the user sees all info
		When the user clicks Older
		Then the user sees all info
		
			

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
	@FLEET-393 @FLEET-667
	Scenario Outline: As a Storemanager/SalesManager I should be able to create car
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
		
			

	#Acceptance criteria: 
	#
	#Storemanager/SalesManager can also add Vehicle Model Vehicle Make informations by using +Add button when creating car
	@FLEET-394 @FLEET-667 @FLEET-392
	Scenario Outline: Storemanager/SalesManager can also add Vehicle Model Vehicle Make informations by using +Add button when creating car
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
		
			

	#User Story:
	#Truck Driver sidebar widgets, pins and favourite pages US-005
	#
	#Acceptance Criterias:
	#1-Truck driver can add Recent Email, Sticky Note, Task List Widgets by using (+) plus sign
	#2-Truck dirver can pin the page by using pin sign
	#3-Truck driver can make the page favourite by using favourite sign
	@FLEET-649 @FLEET-667 @FLEET-655
	Scenario: As Truck Driver plus sign functionality for Recent Emails
        Given the user is on the login page
        When the user enters the driver information
        Then the user should be able to login
        When the user navigates to "Fleet" to "Vehicles"
		And the user clicks on plus sign
		And the user clicks enter keyword inputbox
		And sends Recent emails keys
		Then verify Recent email title displayed
		When clicks on add button
		Then verify Added sign displayed
		When clicks on Close Button
		Then verify Recent Email Widget added on the plus sign.	

	#User Story:
	#Truck Driver sidebar widgets, pins and favourite pages US-005
	#
	#Acceptance Criterias:
	#1-Truck driver can add Recent Email, Sticky Note, Task List Widgets by using (+) plus sign
	#2-Truck dirver can pin the page by using pin sign
	#3-Truck driver can make the page favourite by using favourite sign
	@FLEET-650 @FLEET-667 @FLEET-655
	Scenario: As Truck Driver plus sign functionality for Sticky Note
		Given the user is on the login page
		When the user enters the driver information
		Then the user should be able to login
		When the user navigates to "Fleet" to "Vehicles"
		When the user clicks on plus sign
		Then user should be able to click add button for Sticky Note
		When clicks on Close Button
		Then verify Sticky Note Widget added.	

	#User Story:
	#Truck Driver sidebar widgets, pins and favourite pages US-005
	#
	#Acceptance Criterias:
	#1-Truck driver can add Recent Email, Sticky Note, Task List Widgets by using (+) plus sign
	#2-Truck dirver can pin the page by using pin sign
	#3-Truck driver can make the page favourite by using favourite sign
	#
	@FLEET-652 @FLEET-667 @FLEET-655
	Scenario: As Truck Driver plus sign functionality for Task list
		Given the user is on the login page
		When the user enters the driver information
		Then the user should be able to login
		When the user navigates to "Fleet" to "Vehicles"
		When the user clicks on plus sign
		Then user should be able to click add button Task list
		When clicks on Close Button
		Then verify Task list added.	

	#User Story:
	#Truck Driver sidebar widgets, pins and favourite pages US-005
	#
	#Acceptance Criterias:
	#1-Truck driver can add Recent Email, Sticky Note, Task List Widgets by using (+) plus sign
	#2-Truck dirver can pin the page by using pin sign
	#3-Truck driver can make the page favourite by using favourite sign
	@FLEET-653 @FLEET-667 @FLEET-655
	Scenario: As Truck Driver pin sign functionality
		Given the user is on the login page
		When the user enters the driver information
		Then the user should be able to login
		When the user navigates to "Fleet" to "Vehicles"
		When user clicks on pin button
		Then verifies existing page pinned
		When user clicks on pin button
		Then verifies Learn how to use this space text displayed	

	#User Story:
	#Truck Driver sidebar widgets, pins and favourite pages US-005
	#
	#Acceptance Criterias:
	#1-Truck driver can add Recent Email, Sticky Note, Task List Widgets by using (+) plus sign
	#2-Truck dirver can pin the page by using pin sign
	#3-Truck driver can make the page favourite by using favourite sign
	@FLEET-654 @FLEET-667 @FLEET-655
	Scenario: As Truck Driver favourite sign functionality
		Given the user is on the login page
		When the user enters the driver information
		Then the user should be able to login
		When the user navigates to "Fleet" to "Vehicles"
		When user clicks on favourite sign button
		And clicks on dropdown menu
		When user clicks on Favorites
		Then verifies existing favourites pages displayed
		When user clicks on Favorites
        And user close Favorites button


	#{color:#00875a}*User Story :* {color}
	#
	#As a user I should be able to login
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#_1-User can login with valid credentials (We have 3 types user such as sales manager, store manager, truck driver)._
	#_2-User can not login with invalid credentials._
	@FLEET-598 @FLEET-667
	Scenario Outline: Login functionality for 3 different users(sales manager, store manager, truck driver)
		Given the user is on the login page
		And the user logs in using "<username>" and "<password>"
		Examples:
			|username              |password              |
			|sales_manager_username|sales_manager_password|
			|store_manager_username|store_manager_password|
			|driver_username       |driver_password       |

	#{color:#00875a}*User Story :* {color}
	#
	#As a user I should be able to login
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#_1-User can login with valid credentials (We have 3 types user such as sales manager, store manager, truck driver)._
	#_2-User can not login with invalid credentials._
	@FLEET-645 @FLEET-667
	Scenario Outline: Login functions with invalid info for different users
		Given the user is on the login page
		When the user logs in using following credentials "<username>" and "<password>"
		Then the title contains "<text>"
		Examples:
		| username        | password    | text                           |
		| user            | wrong       | Invalid user name or password. |
		| user1           | 123         | Invalid user name or password. |
		| user            | UserUser123 | Invalid user name or password. |
		|                 |             | Please fill out this field.    |
		|                 | UserUser123 | Please fill out this field.    |
		| user1           |             | Please fill out this field.    |
		|                 |             | Please fill out this field.    |
		|                 | abcd        | Please fill out this field.    |
		| ahmet           |             | Please fill out this field.    |
		| user            | wrong       | Invalid user name or password. |
		| salesmanager101 | 123         | Invalid user name or password. |
		| user            | UserUser123 | Invalid user name or password. |
		|                 |             | Please fill out this field.    |
		|                 | UserUser123 | Please fill out this field.    |
		| salesmanager101 |             | Please fill out this field.    |
		|                 |             | Please fill out this field.    |
		|                 | abcd        | Please fill out this field.    |
		| hasan           |             | Please fill out this field.    |
		| user            | wrong       | Invalid user name or password. |
		| storemanager85  | 123         | Invalid user name or password. |
		| user            | UserUser123 | Invalid user name or password. |
		|                 |             | Please fill out this field.    |
		|                 | UserUser123 | Please fill out this field.    |
		| storemanager85  |             | Please fill out this field.    |
		|                 |             | Please fill out this field.    |
		|                 | abcd        | Please fill out this field.    |
		| selim           |             | Please fill out this field.    |	

	#{color:#00875a}*User Story :* {color}
	#
	#As a user I should be able to log out
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-User can log out by using log out button inside profile info
	@FLEET-646 @FLEET-667
	Scenario Outline: Logout Function for different users(Truck Driver-Sales and Store Manager)
		Given the user logged in as "<username>"
		When the user can logout with logout button
		Then the user should succesfully logout
		Examples:
		| username      |
		| driver        |
		| sales manager |
		| store manager |	

	#User Story :
	#
	#As a Storemanager/SalesManager When I click on any car in the grid, I should be able to see general informations about car.
	#
	# 
	#
	#Acceptance Criterias:
	#
	#1-Storemanager/SalesManager can see all informations about specific car.
	#2-Storemanager/SalesManager can filter activities by using either Activity Type button or Date Range button
	#3-Storemanager/SalesManager can refresh the activities by using refresh button
	#4-Storemanager/SalesManager can reach the all activities by using Newer and Older buttons
	@FLEET-634 @FLEET-667 @FLEET-636
	Scenario Outline: User should see any car's general information
		Given the user is on the login page
		When the user enters the store manager information
		Then the user should be able to login
		And the user navigates to "Fleet" to "Vehicles"
		Then the user gets any "<car>" information
		And  the hompage contains "<title>"
		    Examples:
              | car  | title   |
              | car1 | Johnson |
              | car2 | Denver  |
              | car3 | Plummer |
			

	#User Story :
	#
	#As a Storemanager/SalesManager When I click on any car in the grid, I should be able to see general informations about car.
	#
	# 
	#
	#Acceptance Criterias:
	#
	#1-Storemanager/SalesManager can see all informations about specific car.
	#2-Storemanager/SalesManager can filter activities by using either Activity Type button or Date Range button
	#3-Storemanager/SalesManager can refresh the activities by using refresh button
	#4-Storemanager/SalesManager can reach the all activities by using Newer and Older buttons
	#
	#
	@FLEET-635 @FLEET-667 @FLEET-636
	Scenario: Filtering functionality test
		Given the user is on the login page
		When the user enters the store manager information
		Then the user should be able to login
		And the user navigates to "Fleet" to "Vehicles"
		When the user gets  car1 information
		And the user filters by using Activity Type
		And the user filters by using Date Range
		And the user refreshies by using Refresh button
		Then the user reach older page bt using Older button
		And the user reach newer page bt using Newer button
		