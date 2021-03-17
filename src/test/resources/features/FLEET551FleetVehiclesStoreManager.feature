
Feature: StoreManager edit specific car

	@FLEET-560 @FLEET-569
	Scenario: StoreManager edit specific car licence plate FLEET-551
		Given the user is on the login page
		Given the user logs in using "store_manager_username" and "store_manager_password"
		When the user navigates to "Fleet" to "Vehicles"
		And the user clicks any car in the list
		And the user clicks car edit button

		Then the user should be able to edit licence plate with "SPECIALFLEETCAR"

	@FLEET-561 @FLEET-569
	Scenario: StoreManager edit specific car Transmission and Fuel type FLEET-551
		Given the user is on the login page
		Given the user logs in using "store_manager_username" and "store_manager_password"
		When the user navigates to "Fleet" to "Vehicles"
		And the user clicks any car in the list
		And the user clicks car edit button

		Then the user should be able to select Transmission type as "Automatic"
		And the user should be able to select Fuel type as "Diesel"
		And the information after save should be verified as "Automatic" and "Diesel"

	@FLEET-562 @FLEET-569
	Scenario: StoreManager edit car tags FLEET-551
		Given the user is on the login page
		Given the user logs in using "store_manager_username" and "store_manager_password"
		When the user navigates to "Fleet" to "Vehicles"
		And the user clicks any car in the list
		And the user clicks car edit button

		Then the user could be able to check all the car tags

	@FLEET-563 @FLEET-569
	Scenario: StoreManager edit car driver name FLEET-551
		Given the user is on the login page
		Given the user logs in using "store_manager_username" and "store_manager_password"
		When the user navigates to "Fleet" to "Vehicles"
		And the user clicks any car in the list
		And the user clicks car edit button

		Then the user should not be able to enter driver name length more than 255 characters
