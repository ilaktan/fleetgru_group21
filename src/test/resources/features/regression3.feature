@regression
Feature:

	Background:
		#@FLEET-552
		Given the user is on the login page
		When the user enters the driver information
		Then the user should be able to login
		

	#*{color:#403294}User Story:{color}*
	#
	#*As a Truck Driver I should be able to get Vehicle informations.*
	#
	#*{color:#403294}Acceptance Criteria:{color}*
	#
	#*1-Truck driver can see vehicle informations once navigate to vehicle page*
	#2-Truck driver can change page number for getting following vehicle informations
	#3-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#4-Truck driver can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats
	@FLEET-600 @FLEET-667 @FLEET-608
	Scenario: Getting Vehicle Information 
		When the user navigates to "Fleet" to "Vehicles"
		Then the sub-title should be "Cars"	

	#*{color:#403294}User Story:{color}*
	#
	#*As a Truck Driver I should be able to get Vehicle informations.*
	#
	#*{color:#403294}Acceptance Criteria:{color}*
	#
	#1-Truck driver can see vehicle informations once navigate to vehicle page
	#*2-Truck driver can change page number for getting following vehicle informations*
	#3-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#4-Truck driver can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats
	# 
	@FLEET-601 @FLEET-667 @FLEET-608
	Scenario: Default Page Number
		When the user navigates to "Fleet" to "Vehicles" 
		Then the page number should be "1"
			

	#*{color:#403294}User Story:{color}*
	#
	#*As a Truck Driver I should be able to get Vehicle informations.*
	#
	#*{color:#403294}Acceptance Criteria:{color}*
	#
	#1-Truck driver can see vehicle informations once navigate to vehicle page
	#*2-Truck driver can change page number for getting following vehicle informations*
	#3-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#4-Truck driver can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats
	@FLEET-602 @FLEET-667 @FLEET-608
	Scenario: Using the Back-Forward Button
		When the user navigates to "Fleet" to "Vehicles"
		When the user should use the forward button
		When the user should use the back button
		Then verify the page numbers
		| 1 |
		| 2 |
		| 3 |
		| 4 |
		| 5 |
		| 6 |
		| 5 |
		| 4 |
		| 3 |
		| 2 |
		| 1 |	

	#*{color:#403294}User Story:{color}*
	#
	#*As a Truck Driver I should be able to get Vehicle informations.*
	#
	#*{color:#403294}Acceptance Criteria:{color}*
	#
	#1-Truck driver can see vehicle informations once navigate to vehicle page
	#*2-Truck driver can change page number for getting following vehicle informations*
	#3-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#4-Truck driver can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats
	@FLEET-603 @FLEET-667 @FLEET-608
	Scenario: Using the page input-box
		When the user navigates to "Fleet" to "Vehicles"
		When the user writes on the page input box "5" 
		Then the page input box should be "5" 	

	#*{color:#403294}User Story:{color}*
	#
	#*As a Truck Driver I should be able to get Vehicle informations.*
	#
	#*{color:#403294}Acceptance Criteria:{color}*
	#
	#1-Truck driver can see vehicle informations once navigate to vehicle page
	#2-Truck driver can change page number for getting following vehicle informations
	#*3-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)*
	#4-Truck driver can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats
	@FLEET-604 @FLEET-667 @FLEET-608
	Scenario: Default Per Page Button Number
		When the user navigates to "Fleet" to "Vehicles"
		Then the per page button should be "25"	

	#*{color:#403294}User Story:{color}*
	#
	#*As a Truck Driver I should be able to get Vehicle informations.*
	#
	#*{color:#403294}Acceptance Criteria:{color}*
	#
	#1-Truck driver can see vehicle informations once navigate to vehicle page
	#2-Truck driver can change page number for getting following vehicle informations
	#*3-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)*
	#4-Truck driver can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats
	@FLEET-605 @FLEET-667 @FLEET-608
	Scenario: Using the View Per Page Button
		When the user navigates to "Fleet" to "Vehicles"
		When the user clicks the view per page button
		When the user select the item "100" 
		Then the dropdown should be "100" 
		Then row size should be "100"	

	#*{color:#403294}User Story:{color}*
	#
	#*As a Truck Driver I should be able to get Vehicle informations.*
	#
	#*{color:#403294}Acceptance Criteria:{color}*
	#
	#1-Truck driver can see vehicle informations once navigate to vehicle page
	#2-Truck driver can change page number for getting following vehicle informations
	#3-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#*4-Truck driver can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats*
	@FLEET-606 @FLEET-667 @FLEET-608
	Scenario: Using Export-Grid button -CSV
		When the user navigates to "Fleet" to "Vehicles"
		When the user clicks on the Export Grid button 
		And User click the "CSV" 
		Then the user should be able to see success message on the page	

	#*{color:#403294}User Story:{color}*
	#
	#*As a Truck Driver I should be able to get Vehicle informations.*
	#
	#*{color:#403294}Acceptance Criteria:{color}*
	#
	#1-Truck driver can see vehicle informations once navigate to vehicle page
	#2-Truck driver can change page number for getting following vehicle informations
	#3-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#*4-Truck driver can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats*
	@FLEET-607 @FLEET-667 @FLEET-608
	Scenario: Using Export-Grid button -XLSX
		When the user navigates to "Fleet" to "Vehicles"
		When the user clicks on the Export Grid button
		And User click the "XLSX"
		Then the user should be able to see success message on the page	

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
	@FLEET-397 @FLEET-667 @FLEET-396
	Scenario: Truck Driver can see all informations about specific car
		And the user navigates to "Fleet" to "Vehicles"
		Then the user sees all informations about specific car


	#*User Story :* 
	#
	#As a Truck Driver When I click on any car in the grid, I should be able to see general informations about car.
	#
	# 
	#
	#*_Acceptance Criterias:_*
	#
	#1-Truck Driver can see all informations about specific car.
	#2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	#3-Truck Driver can refresh the activities by using refresh button
	#4-Truck Driver can reach the all activities by using Newer and Older buttons
	@FLEET-398 @FLEET-667 @FLEET-396
	Scenario: Truck Driver can filter activities by using either Activity Type button or Date Range button
		When the user navigates to "Fleet" to "Vehicles"
		And the user click on any line
		When the user filters using either Activity Type button
		Then data is filtered by Activity Type
		When the user filters using either Date Range button
		Then data is filtered by Date Range
			

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
	#*3-Truck Driver can refresh the activities by using refresh button*
	#
	#4-Truck Driver can reach the all activities by using Newer and Older buttons
	@FLEET-399 @FLEET-667 @FLEET-396
	Scenario: Truck Driver can refresh the activities by using refresh button
		When the user navigates to "Fleet" to "Vehicles"
		And the user click on any line
		When the user clicks refresh button
		Then the data is refreshed	

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
	@FLEET-572 @FLEET-667 @FLEET-584
	Scenario: Use Grid Setting button as a Truck Driver
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
	@FLEET-573 @FLEET-667 @FLEET-584
	Scenario: Use Grid Setting Button -Search Valid item
		When the user navigates to "Fleet" to "Vehicles"
		When the user click the Grid Setting button
		And the user searches column name "Driver" in the Quick Search input
		Then the system should display "Driver" column under dropdown menu.	

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
	@FLEET-574 @FLEET-667 @FLEET-584
	Scenario: Use Grid Setting Button -Search invalid item
		When the user navigates to "Fleet" to "Vehicles"
		When the user click the Grid Setting button
		And the user searches column name "Idd" in the Quick Search input
		Then the system should display "No columns found" message under dropdown menu.	

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
	@FLEET-575 @FLEET-667 @FLEET-584
	Scenario: Using Refresh button
		When the user navigates to "Fleet" to "Vehicles"
		When the user go to page "4"
		And the user click the refresh button
		Then page input should be "4"
			

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
	@FLEET-576 @FLEET-667 @FLEET-584
	Scenario: Using Reset button
		When the user navigates to "Fleet" to "Vehicles"
		When the user click the Grid Setting button
		And user click the "Id" column
		Then the system should display "ID" column on the webpage
		And the user click the reset button
		Then the system should not display "ID" column on the webpage	

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
	@FLEET-577 @FLEET-667 @FLEET-584
	Scenario: Using Grid Setting Button -Click Unclick the Column option
		When the user navigates to "Fleet" to "Vehicles"
		When the user click the Grid Setting button
		And user click the "Id" column
		Then the system should display "ID" column on the webpage
		And user unselect the "Tags" column
		Then the system should not display "Tags" column on the webpage	

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
	@FLEET-578 @FLEET-667 @FLEET-584
	Scenario: Using Grid Setting Button -Click Select All button
		When the user navigates to "Fleet" to "Vehicles"
		When the user click the Grid Setting button
		And user click the Select All button
		Then following columns should see on the webpage
		      | ID                        |
		      | LICENSE PLATE             |
		      | TAGS                      |
		      | DRIVER                    |
		      | LOCATION                  |
		      | CHASSIS NUMBER            |
		      | MODEL YEAR                |
		      | LAST ODOMETER             |
		      | IMMATRICULATION DATE      |
		      | FIRST CONTRACT DATE       |
		      | CVVI                      |
		      | SEATS NUMBER              |
		      | DOORS NUMBER              |
		      | COLOR                     |
		      | TRANSMISSION              |
		      | FUEL TYPE                 |
		      | CO2 EMISSIONS             |
		      | HORSEPOWER                |
		      | HORSEPOWER TAXATION       |
		      | POWER (KW)                |
			

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
	@FLEET-579 @FLEET-667 @FLEET-584
	Scenario: Manage Filter button options
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
	@FLEET-580 @FLEET-667 @FLEET-584
	Scenario: Use Manage-Filter Button - Searching invalid item
		When the user navigates to "Fleet" to "Vehicles"
		When the user click the filter button
		And the user click the manage filter button
		And User searches "diver" column in the Search input
		Then verifies driver not displayed	

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
	#h4.  
	@FLEET-581 @FLEET-667 @FLEET-584
	Scenario: Use Manage-Filter Button - Searching valid item
		When the user navigates to "Fleet" to "Vehicles"
		When the user click the filter button
		And the user click the manage filter button
		And User searches "Driver" column in the Search input
		Then the system should display the "Driver" option under dropdown menu	

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
	@FLEET-582 @FLEET-667 @FLEET-584
	Scenario: Filters sign functionality
		When the user navigates to "Fleet" to "Vehicles"
		When the user click the filter button
		And the user click the manage filter button
		And the user click the "License Plate" button
		Then the user should be able to see the "License Plate" on the filter container
		When the user click the "License Plate" button on the filter container
		And user clicks on Contains button;
		Then verifies Contains dropdown menu displayed
		Then user should be able to see following dropdown menu options
		      |Contains|
		      |Does Not Contain|
		      |Is Equal To     |
		      |Starts With     |
		      |Ends With       |
		      |Is Any Of       |
		      |Is Not Any Of   |
		      |Is Empty        |
		      |Is Not Empty    |	

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
	@FLEET-583 @FLEET-667 @FLEET-584
	Scenario: Using the Manage Filter -Contains button with valid item
		When the user navigates to "Fleet" to "Vehicles"
		When the user click the filter button
		And the user click the manage filter button
		And the user click the "Location" button
		Then the user should be able to see the "Location" on the filter container
		When the user click the "Location" button on the filter container
		When the search "Florida" in the search box
		Then the system should only show records that contain the Location "Florida" in the truck driver	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to add event
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck Driver can add event by using Add Event button
	# *2-Truck Driver should see the update in both general information page and Activity tab related*
	# *add event.*
	@FLEET-555 @FLEET-667 @FLEET-557
	Scenario: Truck Driver able to see update in both general info and Activity tab FLEET-549
		When the user navigates to "Fleet" to "Vehicles"
		And the user clicks any car in the list
		And clicks the -Add Event- button
		Then the user should edit the required fields
		And the user should verify the info at General Information page with Activity tab.	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to add event
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#*1-Truck Driver can add event by using Add Event button*
	#2-Truck Driver should see the update in both general information page and Activity tab related
	#add event.
	@FLEET-556 @FLEET-667 @FLEET-557
	Scenario: TruckDriver add event by Add Event button FLEET-549
		When the user navigates to "Fleet" to "Vehicles"
		And the user clicks any car in the list
		And clicks the -Add Event- button
		Then the user should edit the required fields