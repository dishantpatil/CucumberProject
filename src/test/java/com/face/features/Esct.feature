Feature: Esct 
@Esct
Scenario Outline: TC_01
	
	Given Enter Esct User Name <username>
	Then Enter Esct Password <password>
	Then Click on Esct Login button
	
Examples:
	| username	           | password   |                                                      
	| rohan@testmail.com   | aress123$Z |
  
@Esct12
Scenario Outline: TC_02
	
	Given Enter Esct User Name <username>
	Then Enter Esct Password <password>
	Then Click on Esct Login button
	Then Click on Special Function Button		
	Then Click on Mass Update Button
	Then Select drop-down option <dropDownValue>
	Then Select checkCheckBox
	Then Select drop-down optionupdateroomdepartment <dropDownValue1>
	Then Click on Update Button
	Then Verify Success message1 <successMSG1>
	Then Select checkCheckBox
	Then Select drop-down optionupdateroomdepartment1 <dropDownValue2>
	Then Click on Update Button
	Then Verify Success message1 <successMSG1>
	
Examples:
	| username	          | password   | dropDownValue           | successMSG1                             | dropDownValue1        | dropDownValue2      | successMSG1                             |
	| rohan@testmail.com  | aress123$Z | Update Room Department  | Room(s) department updated successfully | ICU                   | Operation Theater   | Room(s) department updated successfully |
		
		
@Esct1
Scenario Outline: TC_03
	
	Given Enter Esct User Name <username>
	Then Enter Esct Password <password>
	Then Click on Esct Login button
	Then Click on Special Function Button		
	Then Click on Mass Update Button
	Then Select drop-down option <dropDownValue>		
	Then Select checkCheckBox
	Then Select drop-down optionupdateroomfloortype <dropDownValue1>
	Then Click on Update Button
	Then Verify Success message1 <successMSG1>
	Then Select checkCheckBox
	Then Select drop-down optionupdateroomfloortype1 <dropDownValue2>
	Then Click on Update Button
	Then Verify Success message1 <successMSG1>
	
	
Examples:
	| username	          | password   | dropDownValue           | successMSG1                              | dropDownValue1        | dropDownValue2    | successMSG1                             |
	| rohan@testmail.com  | aress123$Z | Update Room Floor Type  | Room(s) floor type updated successfully  | Wood                  | Hard Finish       | Room(s) floor type updated successfully |
	

	
@Esct2
Scenario Outline: TC_04
	
	Given Enter Esct User Name <username>
	Then Enter Esct Password <password>
	Then Click on Esct Login button
	Then Click on Special Function Button		
	Then Click on Mass Update Button
	Then Select drop-down option <dropDownValue>		
	Then Select checkCheckBox
	Then Select drop-down optionopenclosed <dropDownValue1>
	Then Click on Update Button
	Then Verify Success message1 <successMSG1>
	Then Select checkCheckBox
	Then Select drop-down optionopenclosed1 <dropDownValue2>
	Then Click on Update Button
	Then Verify Success message1 <successMSG1>
	
	
Examples:
	| username	          | password   | dropDownValue             | successMSG1                              | dropDownValue1        | dropDownValue2    | successMSG1                  |
	| rohan@testmail.com  | aress123$Z | Update Room Open/ Closed  | Room(s) updated successfully             | Closed                | Open              | Room(s) updated successfully |


@Esct3
Scenario Outline: TC_05
	
	Given Enter Esct User Name <username>
	Then Enter Esct Password <password>
	Then Click on Esct Login button
	Then Click on Special Function Button		
	Then Click on Mass Update Button
	Then Select drop-down option <dropDownValue>		
	Then Select checkCheckBox
	Then Enter text <text>
	Then Click on Update Button
	Then Verify Success message1 <successMSG1>
	Then Select checkCheckBox
	Then Enter first text <text1>
	Then Click on Update Button
	Then Verify Success message1 <successMSG1>
	
	
Examples:
	| username	          | password   | dropDownValue             | text   | successMSG1                                  | text1        | successMSG1                               |
	| rohan@testmail.com  | aress123$Z | Update Room Order Number  | 05     | Room(s) order number updated successfully    | 02           | Room(s) order number updated successfully |
	
	
@Esct4
Scenario Outline: TC_06
	
	Given Enter Esct User Name <username>
	Then Enter Esct Password <password>
	Then Click on Esct Login button
	Then Click on Special Function Button		
	Then Click on Mass Update Button
	Then Select drop-down option <dropDownValue>		
	Then Select checkCheckBox
	Then Select drop-down updateroomsdenydaily <dropDownValue1>
	Then Click on Update Button
	Then Verify Success message1 <successMSG1>
	Then Select checkCheckBox
	Then Select drop-down updateroomsdenydaily1 <dropDownValue2>
	Then Click on Update Button
	Then Verify Success message1 <successMSG1>
	
	
Examples:
	| username	          | password   | dropDownValue              | successMSG1                              | dropDownValue1        | dropDownValue2    | successMSG1                  |
	| rohan@testmail.com  | aress123$Z | Update Rooms - Deny Daily  | Room(s) updated successfully             | Deny                  | Allow             | Room(s) updated successfully |
	

@Esct5
Scenario Outline: TC_07
	
	Given Enter Esct User Name <username>
	Then Enter Esct Password <password>
	Then Click on Esct Login button
	Then Click on Special Function Button		
	Then Click on Mass Update Button
	Then Select drop-down option <dropDownValue>		
	Then Select checkCheckBox
	Then Select drop-down updateroomsdenyperiodic <dropDownValue1>
	Then Click on Update Button
	Then Verify Success message1 <successMSG1>
	Then Select checkCheckBox
	Then Select drop-down updateroomsdenyperiodic1 <dropDownValue2>
	Then Click on Update Button
	Then Verify Success message1 <successMSG1>
	
	
Examples:
	| username	          | password   | dropDownValue                 | successMSG1                              | dropDownValue1        | dropDownValue2    | successMSG1                  |
	| rohan@testmail.com  | aress123$Z | Update Rooms - Deny Periodic  | Room(s) updated successfully             | Deny                  | Allow             | Room(s) updated successfully |
	
	
@Esct6
Scenario Outline: TC_08
	
	Given Enter Esct User Name <username>
	Then Enter Esct Password <password>
	Then Click on Esct Login button
	Then Click on Master file button		
	Then Click on Rooms
	Then Click on Add Rooms
	Then Select Subsection drop-down option <subsectionDropDownValue>	
	Then Enter Description <text>
	Then Select Room Type drop-down option <roomTypeDropDownValue>	
	Then Enter Square feet <text1>
	Then Click on Save Button	
	Then Click on Special Function Button		
	Then Click on Mass Update Button
	Then Select drop-down option <dropDownValue>
	Then Select massCheckBox
	Then Delete mass room
	Then Verify Success message1 <successMSG1>
	
Examples:
	| username	          | password   | subsectionDropDownValue    | text              | roomTypeDropDownValue     | text1    | dropDownValue       | successMSG1                  |
	| rohan@testmail.com  | aress123$Z | Male Subsection Ward       | Mass Delete Room  | Ancillary Room            | 12       | z_Mass Delete Rooms | Room(s) deleted successfully |



@Esct7
Scenario Outline: TC_09
	
	Given Enter Esct User Name <username>
	Then Enter Esct Password <password>
	Then Click on Esct Login button
	Then Click on Special Function Button		
	Then Click on Mass Update Button
	Then Select drop-down option <dropDownValue>
	Then Select supervisorsCheckBox
	Then Select drop-down updatesupervisor <dropDownValue1>
	Then Click on Update Button
	Then Verify Success message1 <successMSG1>
	Then Select supervisorsCheckBox
	Then Select drop-down updatesupervisor1 <dropDownValue2>
	Then Click on Update Button
	Then Verify Success message1 <successMSG1>
	
	

Examples:
	| username	          | password   | dropDownValue       | successMSG1                            | dropDownValue1        | dropDownValue2    | successMSG1                            |
	| rohan@testmail.com  | aress123$Z | Update Supervisor   | Employee(s) data updated successfully  | Bose, Rohan           | ..Unassigned      | Employee(s) data updated successfully  |
	