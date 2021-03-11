

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
	@FLEET-645
	Feature: Login functions with invalid info for different users
		Scenario Outline: login as a given user <username>
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