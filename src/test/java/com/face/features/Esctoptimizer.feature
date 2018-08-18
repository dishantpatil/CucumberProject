Feature: Esct 

@Esct8
Scenario Outline: TC_09_EsctOptimizer_dashboard_add graph
	
	Given Enter Esct User Name1 <username>
	Then Enter Esct Password1 <password>
	Then Click on Esct Login button1
	Then Click on Esct service optimizer		
	Then Click on Dashboard 
	Then Click on Dashboard Settings		
	Then Click on Add graph
	Then Select graph for drop-down option <dropDownValue>
	Then Enter graph name <text>
	Then Select employeeCheckBox
	Then Select data point drop-down option <dropDownValue1>
	Then Select graph type drop-down option <dropDownValue2>
	Then Click on Internal Save Button
	Then Verify Success message12 <successMSG1>
	Then Click on Close Button
	Then Click on External Save Button
	Then Verify Success message123 <successMSG2>
	
	

Examples:
	| username	          | password   | dropDownValue    | text           | dropDownValue1   | dropDownValue2  | successMSG1                                             | successMSG2                            |
	| rohan@testmail.com  | aress123$Z | Employee         | QA Test Graph  | 1                | 2               | ES Service Optimizer graph setting saved successfully   | Dashboard settings saved successfully  |


@Esct9
Scenario Outline: TC_10_EsctOptimizer_dashboard_settings_web

	Given Enter Esct User Name1 <username>
	Then Enter Esct Password1 <password>
	Then Click on Esct Login button1
	Then Click on Esct service optimizer		
	Then Click on Dashboard 
	Then Click on Dashboard Settings		
	Then Click on Web Settings
	Then Enter Default Task Aging Days <value0>
	Then Enter Default Task Alert Mins <value1>
	Then Click on Web Save Button
	Then Verify Web Setting Success Massage <successMSG0>
	Then Enter Default Task Aging Days1 <value2>
	Then Enter Default Task Alert Mins1 <value3>
	Then Click on Web Save Button1
	Then Verify Web Setting Success Massage1 <successMSG0>
	

Examples:
	| username	          | password   | value0 | value1 | successMSG0                     | value2 | value3 | successMSG0                     | 
	| rohan@testmail.com  | aress123$Z | 10     | 10     | Web Settings saved successfully | 30     | 15     | Web Settings saved successfully |




@Esct10
Scenario Outline: TC_11_EsctOptimizer_dashboard_settings_mobile

	Given Enter Esct User Name1 <username>
	Then Enter Esct Password1 <password>
	Then Click on Esct Login button1
	Then Click on Esct service optimizer		
	Then Click on Dashboard 
	Then Click on Dashboard Settings		
	Then Click on Mobile Setting
	Then Enter Auto Logoff Mins <Value4>	
	Then Enter In progress Auto Complete Mins <value5>
	Then Enter Default Task Completion Mins <value6>
	Then Enter Task Alert Mins <value7>
	Then Enter Clean Indicator Mins <value8>
	Then Enter Break Time Mins <value9>
	Then Enter Lunch Time Mins <value10>
	Then Enter Auto Login after Break Mins <value11>
	Then Enter Maximum days to be shown in Project Schedule <value12>
	Then Enter Maximum days Project Retained on Device for Inspection <value13>
	Then Click on Mobile Save Button
	Then Verify Mobile Setting Success Massage2 <successMSG2>
	Then Enter Auto Logoff Mins1 <Value14>	
	Then Enter In progress Auto Complete Mins1 <value15>
	Then Enter Default Task Completion Mins1 <value16>
	Then Enter Task Alert Mins1 <value17>
	Then Enter Clean Indicator Mins1 <value18>
	Then Enter Break Time Mins1 <value19>
	Then Enter Lunch Time Mins1 <value20>
	Then Enter Auto Login after Break Mins1 <value21>
	Then Enter Maximum days to be shown in Project Schedule1 <value22>
	Then Enter Maximum days Project Retained on Device for Inspection1 <value23>
	Then Click on Mobile Save Button1
	Then Verify Mobile Setting Success Massage21 <successMSG2>


Examples:
	| username	          | password   | value4 | value5 | value6 | value7 | value8 | value9 | value10 | value11 | value12 | value13 | successMSG2                        | value14 | value15 | value16 | value17 | value18 | value19 | value20 | value21 | value22 | value23 | successMSG2                        | 
	| rohan@testmail.com  | aress123$Z | 50     | 50     | 05     | 10     | 400    | 10     | 25      | 6       | 20      | 2       | Mobile Settings saved successfully | 60      | 60      | 10      | 5       | 480     | 15      | 30      | 5       | 30      | 5       | Mobile Settings saved successfully |



@Esct11
Scenario Outline: TC_11_EsctOptimizer_dashboard_settings_task_subject

	Given Enter Esct User Name1 <username>
	Then Enter Esct Password1 <password>
	Then Click on Esct Login button1
	Then Click on Esct service optimizer		
	Then Click on Dashboard 
	Then Click on Dashboard Settings		
	Then Click on Task Subject
	Then Click on Edit Task Subject Button
	Then Enter Task Subject <subject>
	Then Enter Task Description <description>
	Then Enter Time <value24>
	Then Click on Task Right Button
	Then Verify Success Massage3 <successMSG3>
	Then Click on Delete Task Button
	Then Click on Yes Pop-up
	Then Verify Success Message5 <successMSG5>
	
	


Examples:
	| username	          | password   | subject  | description                   | value24 | successMSG3                         | successMSG5                           |
	| rohan@testmail.com  | aress123$Z | clean    | Please perform discharge ASAP | 12      | The task subject saved successfully | The task subject deleted successfully |


@Esct13
Scenario Outline: TC_12_EsctOptimizer_dashboard_settings_mobile_policing_comments

	Given Enter Esct User Name1 <username>
	Then Enter Esct Password1 <password>
	Then Click on Esct Login button1
	Then Click on Esct service optimizer		
	Then Click on Dashboard 
	Then Click on Dashboard Settings		
	Then Click on Policing Comments 
	Then Click on Edit Policing Comments
	Then Select DropDown of Policing comments <dropDown3>
	Then Enter Comment <comment>
	Then Click on Policing Right Button
	Then Verify Success Massage4 <successMSG4>
	Then Click on Delete Policing Comment Button
	Then Click on Yes Pop-up of Policing
	Then Verify Success Message6 <successMSG6>
	


Examples:
	| username	          | password   | dropDown3  | comment             | successMSG4                             | successMSG6                               |
	| rohan@testmail.com  | aress123$Z | RPP        | Use toilets         | The policing comment saved successfully | The policing comment deleted successfully |
		