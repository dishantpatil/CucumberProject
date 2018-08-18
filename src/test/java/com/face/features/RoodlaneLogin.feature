@Roodlane
Feature: Roodlane 

Scenario Outline: TC_01
	
	Given Enter User Name <username>
	Then Enter Password <password>
	Then Click on Login button
	Then Verify Logout button displayed
	
Examples:
	| username	          | password |                                                      
	| testuser@aress.com  | Test1234 | 

Scenario Outline: TC_02
	
	Given Enter User Name <username>
	Then Enter Password <password>
	Then Click on Login button
	Then Verify Logout button displayed
	Then Enter First Name <FirstName>
	Then Click on Search button
	Then Verify Same user is displayed in search result
	
Examples:
	| username	          | password | FirstName |                                                      
	| testuser@aress.com  | Test1234 | User15    |

Scenario Outline: TC_03
	
	Given Enter User Name <username>
	Then Enter Password <password>
	Then Click on Login button
	Then Verify Logout button displayed
	Then Nevigate to the HCA URL
	Then Select Placement Assessment
	Then Click on Continue button
	Then Again go to main url 
	
	
Examples:
	| username	          | password |                                                      
	| testuser@aress.com  | Test1234 | 

