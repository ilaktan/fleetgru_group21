
	@FLEET-646
	Feature:Logout Function for different users(Truck Driver-Sales and Store Manager)
		Scenario Outline: logout as a given user <username>
		Given the user logged in as "<username>"
		When the user can logout with logout button
		Then the user should succesfully logout
		Examples:
		| username      |
		| driver        |
		| sales manager |
		| store manager |