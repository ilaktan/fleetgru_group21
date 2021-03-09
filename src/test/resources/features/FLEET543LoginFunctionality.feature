
@FLEET-598
Feature: Login functionality for 3 different users(sales manager, store manager, truck driver)

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
	Background:
		Given the user is on the login page

		Scenario: Login as a driver
		When the user enters the driver information
		Then the user should be able to login

		Scenario:  Login as a sales manager
		When the user enters the sales manager information
		Then the user should be able to login

		Scenario: Login as a store manager
		When the user enters the store manager information
		Then the user should be able to login