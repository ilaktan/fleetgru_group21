@regression
Feature:

	Background:
		#@FLEET-554
		Given the user is on the login page
		When the user enters the sales manager information
		Then the user should be able to login
		

	#{color:#403294}*User Story:*{color}
	#*As a Storemanager/SalesManager I should be able to use all filtering functions*
	#
	#{color:#403294}*Acceptance Criteria:*{color}
	#*1-Storemanager/SalesManager can use Grid Settings button for arranging demanded columns.*
	#2-Storemanager/SalesManager can use Filters sign with opening Manage Filters button for filtering informations
	#3-Storemanager/SalesManager can refresh the page by using Refresh button
	#4-Storemanager/SalesManager can reset the filtering settings by using Reset button
	@FLEET-610 @FLEET-667 @FLEET-632
	Scenario: Use Grid Setting button as a sales manager
		When the user navigates to "Fleet" to "Vehicles"
		When the user click the Grid Setting button
		Then following columns should be available under grid settings button
		| Id                        |
		| License Plate             |
		| Tags                      |
		| Driver                    |
		| Location                  |
		| Chassis Number            |
		| Model Year                |
		| Last Odometer             |
		| Immatriculation Date      |
		| First Contract Date       |
		| Catalog Value (VAT Incl.) |
		| Seats Number              |
		| Doors Number              |
		| Color                     |
		| Transmission              |
		| Fuel Type                 |
		| CO2 Emissions             |
		| Horsepower                |
		| Horsepower Taxation       |
		| Power (KW)                |
		
			

	#{color:#403294}*User Story:*{color}
	#*As a Storemanager/SalesManager I should be able to use all filtering functions*
	#
	#{color:#403294}*Acceptance Criteria:*{color}
	#*1-Storemanager/SalesManager can use Grid Settings button for arranging demanded columns.*
	#2-Storemanager/SalesManager can use Filters sign with opening Manage Filters button for filtering informations
	#3-Storemanager/SalesManager can refresh the page by using Refresh button
	#4-Storemanager/SalesManager can reset the filtering settings by using Reset button
	@FLEET-612 @FLEET-667 @FLEET-632
	Scenario: Use Grid Setting Button as a sales manager -Search Valid item
		When the user navigates to "Fleet" to "Vehicles"
		When the user click the Grid Setting button
		And the user searches column name "Driver" in the Quick Search input
		Then the system should display "Driver" column under dropdown menu.
			

	#{color:#403294}*User Story:*{color}
	#*As a Storemanager/SalesManager I should be able to use all filtering functions*
	#
	#{color:#403294}*Acceptance Criteria:*{color}
	#*1-Storemanager/SalesManager can use Grid Settings button for arranging demanded columns.*
	#2-Storemanager/SalesManager can use Filters sign with opening Manage Filters button for filtering informations
	#3-Storemanager/SalesManager can refresh the page by using Refresh button
	#4-Storemanager/SalesManager can reset the filtering settings by using Reset button
	@FLEET-614 @FLEET-667 @FLEET-632
	Scenario: Use Grid Setting Button as a sales manager -Search invalid item
		When the user navigates to "Fleet" to "Vehicles"
		When the user click the Grid Setting button
		And the user searches column name "Idd" in the Quick Search input
		Then the system should display "No columns found" message under dropdown menu.	

	#{color:#403294}*User Story:*{color}
	#*As a Storemanager/SalesManager I should be able to use all filtering functions*
	#
	#{color:#403294}*Acceptance Criteria:*{color}
	#*1-Storemanager/SalesManager can use Grid Settings button for arranging demanded columns.*
	#2-Storemanager/SalesManager can use Filters sign with opening Manage Filters button for filtering informations
	#3-Storemanager/SalesManager can refresh the page by using Refresh button
	#4-Storemanager/SalesManager can reset the filtering settings by using Reset button
	@FLEET-616 @FLEET-667 @FLEET-632
	Scenario: Using Grid Setting Button as a sales manager -Click Unclick the Column option
		When the user navigates to "Fleet" to "Vehicles"
		When the user click the Grid Setting button
		And user click the "Id" column
		Then the system should display "ID" column on the webpage
		And user unselect the "Tags" column
		Then the system should not display "Tags" column on the webpage
			

	#{color:#403294}*User Story:*{color}
	#*As a Storemanager/SalesManager I should be able to use all filtering functions*
	#
	#{color:#403294}*Acceptance Criteria:*{color}
	#1-Storemanager/SalesManager can use Grid Settings button for arranging demanded columns.
	#*2-Storemanager/SalesManager can use Filters sign with opening Manage Filters button for filtering informations*
	#3-Storemanager/SalesManager can refresh the page by using Refresh button
	#4-Storemanager/SalesManager can reset the filtering settings by using Reset button
	@FLEET-618 @FLEET-667 @FLEET-632
	Scenario: Manage Filter button options as a sales manager
		When the user navigates to "Fleet" to "Vehicles"
		When the user click the filter button
		And the user click the manage filter button
		Then following columns should be available under manage filter button
		| License Plate             |
		| Tags                      |
		| Driver                    |
		| Location                  |
		| Chassis Number            |
		| Model Year                |
		| Last Odometer             |
		| Immatriculation Date      |
		| First Contract Date       |
		| Catalog Value (VAT Incl.) |
		| Seats Number              |
		| Doors Number              |
		| Color                     |
		| Transmission              |
		| Fuel Type                 |
		| CO2 Emissions             |
		| Horsepower                |
		| Horsepower Taxation       |
		| Power (KW)                |	

	#{color:#403294}*User Story:*{color}
	#*As a Storemanager/SalesManager I should be able to use all filtering functions*
	#
	#{color:#403294}*Acceptance Criteria:*{color}
	#1-Storemanager/SalesManager can use Grid Settings button for arranging demanded columns.
	#*2-Storemanager/SalesManager can use Filters sign with opening Manage Filters button for filtering informations*
	#3-Storemanager/SalesManager can refresh the page by using Refresh button
	#4-Storemanager/SalesManager can reset the filtering settings by using Reset button
	@FLEET-620 @FLEET-667 @FLEET-632
	Scenario: Use Manage-Filter Button as a sales manager - Searching invalid item
		When the user navigates to "Fleet" to "Vehicles"
		When the user click the filter button
		And the user click the manage filter button
		And User searches "diver" column in the Search input
		Then verifies driver not displayed	

	#{color:#403294}*User Story:*{color}
	#*As a Storemanager/SalesManager I should be able to use all filtering functions*
	#
	#{color:#403294}*Acceptance Criteria:*{color}
	#1-Storemanager/SalesManager can use Grid Settings button for arranging demanded columns.
	#*2-Storemanager/SalesManager can use Filters sign with opening Manage Filters button for filtering informations*
	#3-Storemanager/SalesManager can refresh the page by using Refresh button
	#4-Storemanager/SalesManager can reset the filtering settings by using Reset button
	@FLEET-622 @FLEET-667 @FLEET-632
	Scenario: Use Manage-Filter Button as a sales manager - Searching valid item
		When the user navigates to "Fleet" to "Vehicles"
		When the user click the filter button
		And the user click the manage filter button
		And User searches "Driver" column in the Search input
		Then the system should display the "Driver" option under dropdown menu
			

	#{color:#403294}*User Story:*{color}
	#*As a Storemanager/SalesManager I should be able to use all filtering functions*
	#
	#{color:#403294}*Acceptance Criteria:*{color}
	#1-Storemanager/SalesManager can use Grid Settings button for arranging demanded columns.
	#*2-Storemanager/SalesManager can use Filters sign with opening Manage Filters button for filtering informations*
	#3-Storemanager/SalesManager can refresh the page by using Refresh button
	#4-Storemanager/SalesManager can reset the filtering settings by using Reset button
	@FLEET-624 @FLEET-667 @FLEET-632
	Scenario: Filters sign functionality as a sales manager
		When the user navigates to "Fleet" to "Vehicles"
		When the user click the filter button
		And the user click the manage filter button
		And the user click the "License Plate" button
		Then the user should be able to see the "License Plate" on the filter container
		When the user click the "License Plate" button on the filter container
		And user clicks on Contains button;
		Then verifies Contains dropdown menu displayed
		Then user should be able to see following dropdown menu options
		|Contains        |
		|Does Not Contain|
		|Is Equal To     |
		|Starts With     |
		|Ends With       |
		|Is Any Of       |
		|Is Not Any Of   |
		|Is Empty        |
		|Is Not Empty    |	

	#{color:#403294}*User Story:*{color}
	#*As a Storemanager/SalesManager I should be able to use all filtering functions*
	#
	#{color:#403294}*Acceptance Criteria:*{color}
	#1-Storemanager/SalesManager can use Grid Settings button for arranging demanded columns.
	#*2-Storemanager/SalesManager can use Filters sign with opening Manage Filters button for filtering informations*
	#3-Storemanager/SalesManager can refresh the page by using Refresh button
	#4-Storemanager/SalesManager can reset the filtering settings by using Reset button
	@FLEET-626 @FLEET-667 @FLEET-632 @fail
	Scenario: Using the Manage Filter as a sales manager -Contains button with valid item
		When the user navigates to "Fleet" to "Vehicles"
		When the user click the filter button
		And the user click the manage filter button
		And the user click the "Location" button
		Then the user should be able to see the "Location" on the filter container
		When the user click the "Location" button on the filter container
		When the search "Florida" in the search box
		Then The system should only show records that contain the Location "Florida"	

	#{color:#403294}*User Story:*{color}
	#*As a Storemanager/SalesManager I should be able to use all filtering functions*
	#
	#{color:#403294}*Acceptance Criteria:*{color}
	#1-Storemanager/SalesManager can use Grid Settings button for arranging demanded columns.
	#2-Storemanager/SalesManager can use Filters sign with opening Manage Filters button for filtering informations
	#*3-Storemanager/SalesManager can refresh the page by using Refresh button*
	#4-Storemanager/SalesManager can reset the filtering settings by using Reset button
	@FLEET-628 @FLEET-667 @FLEET-632
	Scenario: Using Refresh button as a sales manager
		When the user navigates to "Fleet" to "Vehicles"
		When the user go to page "4" 
		And the user click the refresh button
		Then page input should be "4"	

	#{color:#403294}*User Story:*{color}
	#*As a Storemanager/SalesManager I should be able to use all filtering functions*
	#
	#{color:#403294}*Acceptance Criteria:*{color}
	#1-Storemanager/SalesManager can use Grid Settings button for arranging demanded columns.
	#2-Storemanager/SalesManager can use Filters sign with opening Manage Filters button for filtering informations
	#3-Storemanager/SalesManager can refresh the page by using Refresh button
	#*4-Storemanager/SalesManager can reset the filtering settings by using Reset button*
	@FLEET-630 @FLEET-667 @FLEET-632
	Scenario: Using Reset button as a sales manager
		When the user navigates to "Fleet" to "Vehicles"
		When the user click the Grid Setting button
		And user click the "Id" column
		Then the system should display "ID" column on the webpage
		And the user click the reset button
		Then the system should not display "ID" column on the webpage
			

	#{color:#00875a}*User Story :* {color}
	#
	#As a Storemanager/SalesManager I should be able to use sidebar, widget, pins and favourite pages
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Storemanager/SalesManager can add Recent Email, Sticky Note, Task List Widgets by using (+) plus sign
	#2-Storemanager/SalesManager can pin the page by using pin sign
	#3-Storemanager/SalesManager can make the page favourite by using favourite sign
	@FLEET-591 @FLEET-667 @FLEET-596
	Scenario: As sales manager plus sign functionality for Recent Emails
		When the user navigates to "Fleet" to "Vehicles"
		When the user clicks on plus sign
		And the user clicks enter keyword inputbox
		And sends Recent emails keys
		Then verify Recent email title displayed
		When clicks on add button
		Then verify Added sign displayed
		When clicks on Close Button
		Then verify Recent Email Widget added on the plus sign.	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Storemanager/SalesManager I should be able to use sidebar, widget, pins and favourite pages
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Storemanager/SalesManager can add Recent Email, Sticky Note, Task List Widgets by using (+) plus sign
	#2-Storemanager/SalesManager can pin the page by using pin sign
	#3-Storemanager/SalesManager can make the page favourite by using favourite sign
	@FLEET-592 @FLEET-667 @FLEET-596
	Scenario: As sales manager plus sign functionality for Sticky Note
		When the user navigates to "Fleet" to "Vehicles"
		When the user clicks on plus sign
		Then user should be able to click add button for Sticky Note
		When clicks on Close Button
		Then verify Sticky Note Widget added.	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Storemanager/SalesManager I should be able to use sidebar, widget, pins and favourite pages
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Storemanager/SalesManager can add Recent Email, Sticky Note, Task List Widgets by using (+) plus sign
	#2-Storemanager/SalesManager can pin the page by using pin sign
	#3-Storemanager/SalesManager can make the page favourite by using favourite sign
	@FLEET-593 @FLEET-667 @FLEET-596
	Scenario: As sales manager plus sign functionality for Task list
		When the user navigates to "Fleet" to "Vehicles"
		When the user clicks on plus sign
		Then user should be able to click add button Task list
		When clicks on Close Button
		Then verify Task list added.	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Storemanager/SalesManager I should be able to use sidebar, widget, pins and favourite pages
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Storemanager/SalesManager can add Recent Email, Sticky Note, Task List Widgets by using (+) plus sign
	#2-Storemanager/SalesManager can pin the page by using pin sign
	#3-Storemanager/SalesManager can make the page favourite by using favourite sign
	@FLEET-594 @FLEET-667 @FLEET-596
	Scenario: As sales manager pin sign functionality
		When the user navigates to "Fleet" to "Vehicles"
		When user clicks on pin button
		Then verifies existing page pinned
		When user clicks on pin button
		Then verifies Learn how to use this space text displayed	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Storemanager/SalesManager I should be able to use sidebar, widget, pins and favourite pages
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Storemanager/SalesManager can add Recent Email, Sticky Note, Task List Widgets by using (+) plus sign
	#2-Storemanager/SalesManager can pin the page by using pin sign
	#3-Storemanager/SalesManager can make the page favourite by using favourite sign
	@FLEET-595 @FLEET-667 @FLEET-596
	Scenario: As sales manager favourite sign functionality
		When the user navigates to "Fleet" to "Vehicles"
		When user clicks on favourite sign button
		And clicks on dropdown menu
		When user clicks on Favorites
		Then verifies existing favourites pages displayed
		And user close Favorites button

	#User Story :
	#
	#As a Storemanager/SalesManager When I select any car on the grid. I should be able to delete selected specific car.
	#
	# 
	#
	#Acceptance Criterias:
	#
	#1-Storemanager/SalesManager can delete any selected car by using Delete button
	#
	# 
	@FLEET-638 @FLEET-667
	Scenario: Delete any car with valid credentials
        When the user navigates to "Fleet" to "Vehicles"
		Then the user can select any car by clicking check box from All-Cars page
		And the user can go and click to delete button at the end of menu bar
		And the user can click yes delete button at the delete confirmation box
			

	#StoreManager can edit specific car licence plate.
	#
	# 
	#
	# 
	#
	#*User Story :* 
	#
	#As a Storemanager/SalesManager When I select any car on the grid. I should be able to edit selected specific car.
	#
	# 
	#
	#*_Acceptance Criterias:_*
	#
	#1-Storemanager/SalesManager can edit any selected car by using Edit button
	@FLEET-564 @FLEET-667 @FLEET-568
	Scenario: SalesManager edit specific car licence plate FLEET-551
		When the user navigates to "Fleet" to "Vehicles"
		And the user clicks any car in the list
		And the user clicks car edit button
		Then the user should be able to edit licence plate with "SPECIALFLEETCAR"	

	#StoreManager edit specific car Transmission and Fuel type.
	#
	# 
	#
	#{color:#00875a}*User Story :* {color}
	#
	#As a Storemanager/SalesManager When I select any car on the grid. I should be able to edit selected specific car.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Storemanager/SalesManager can edit any selected car by using Edit button
	@FLEET-565 @FLEET-667 @FLEET-568
	Scenario: SalesManager edit specific car Transmission and Fuel type FLEET-551
		When the user navigates to "Fleet" to "Vehicles"
		And the user clicks any car in the list
		And the user clicks car edit button
		Then the user should be able to select Transmission type as "Automatic"
		And the user should be able to select Fuel type as "Diesel"
		And the information after save should be verified as "Automatic" and "Diesel"	

	#StoreManager edit car tags.
	#
	# 
	#
	# 
	#
	#{color:#00875a}*User Story :* {color}
	#
	#As a Storemanager/SalesManager When I select any car on the grid. I should be able to edit selected specific car.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Storemanager/SalesManager can edit any selected car by using Edit button
	@FLEET-566 @FLEET-667 @FLEET-568
	Scenario: SalesManager edit car tags FLEET-551
		When the user navigates to "Fleet" to "Vehicles"
		And the user clicks any car in the list
		And the user clicks car edit button
		Then the user could be able to check all the car tags	

	#StoreManager edit car driver name
	#
	# 
	#
	# 
	#
	#{color:#00875a}*User Story :* {color}
	#
	#As a Storemanager/SalesManager When I select any car on the grid. I should be able to edit selected specific car.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Storemanager/SalesManager can edit any selected car by using Edit button
	@FLEET-567 @FLEET-667 @FLEET-568
	Scenario: SalesManager edit car driver name FLEET-551
		When the user navigates to "Fleet" to "Vehicles"
		And the user clicks any car in the list
		And the user clicks car edit button
		Then the user should not be able to enter driver name length more than 255 characters
			

	#User Story :
	#
	#As a Storemanager/SalesManager I should be able to get Vehicle informations
	#
	#Acceptance Criterias:
	#
	#1-Storemanager/SalesManager can see vehicle informations once navigate to vehicle page
	#2-Storemanager/SalesManager can change page number for getting following vehicle informations
	#3-Storemanager/SalesManager can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#4-Storemanager/SalesManager can get all informations to her/his own email address by using Export Grid button in csv and xlsx format
	@FLEET-661 @FLEET-667 @FLEET-662
	Scenario: SalesManager should be able to get vehicle informations
		When the user navigates to "Fleet" to "Vehicles"
		Then the user can go any page by clicking page number
		And the user can change the entity number by clicking the View Per Page box
		And the user can get all informations to her_his own email address by using Export Grid button
		