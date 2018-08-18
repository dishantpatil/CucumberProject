Feature: Mipegs 
@Mipegs
Scenario Outline: TC_01
	
	Given Enter Mipegs User Name <username>
	Then Enter Mipegs Password <password>
	Then Click on Mipegs Login button
	Then Verify Mipegs Logout button displayed
	
Examples:
	| username	       | password  |                                                      
	| mipegs.devuser   | password  |
  #  | mipegs.devuser1  | password  |
     
@Mipegs123
Scenario Outline: TC_02
	
	Given Enter Mipegs User Name <username>
	Then Enter Mipegs Password <password>
	Then Click on Mipegs Login button
	Then Verify Mipegs Logout button displayed
	Then Click on  Form Manager
	Then Enter Form Name <formName>
	Then Click on Show button
	Then Click on Setting button
	Then Click on Clone button
	Then Enter Number of Clones <numberOfClone>
	Then Click on Standard Clone button
	Then verify form cloned successfully
	Then Click on Setting button
	Then Click On Edit button
	Then Enter Custom Form Name <customFormName>
	Then Click on Save button
	Then Click on Setting button
	Then Click on Publish Now button
	Then Verify Published successfully message displayed
	Then Verify New Form URL genrated
	Then Navigate to form URL
	Then Verify lable 
	Then Enter Mipegs Name <name>
	Then Enter Mipegs Phone Number <phonenumber>
	Then Enter Mipegs Salary <salary>
	Then Select Date
	Then Select Time
	Then Set Percentage <Percentage>
	Then Set Address <address>
	Then Select CheckBox
	Then Select RadioButton
	Then Select Dropdown Value <dropDownValue>
	Then Upload Photo <filePath>
	Then Click on Sign 
	Then Select Type Signature
	Then Enter Your Full Name <enterFullName>
	Then Select Style <selectStyle>
	Then Click Sign Next Button
	Then Enter Full Name <signFullName>
	Then Click Save Name button
	Then Click Submit button
	Then Verify form submitted Successfully
	
Examples:
	| username	      | password |formName              |numberOfClone|customFormName      |name | phonenumber | salary |  Percentage |address   |dropDownValue|filePath |enterFullName  |selectStyle   |signFullName|
	| mipegs.devuser  | password |Automation Testing 4  | 1           |Automation Testing 3|test | 987654321   | $100   |  80% 		  |Test Aress|aa1          |image    |Test Full Name |dancing_script|Test Sign   |
	

@Mipegs123
Scenario Outline: TC_03
	
	Given Enter Mipegs User Name <username>
	Then Enter Mipegs Password <password>
	Then Click on Mipegs Login button
	Then Verify Mipegs Logout button displayed
	Then Click on User Manager
	Then Click on Add User
	Then Enter Email Address <emailAddress>
	Then Enter Real name <realName>
	Then Enter Business Name <businessName>
	Then Enter Address Line1 <addressLine1>
	Then Enter Town <town>
	Then Enter Postcode <postcode>
	Then Enter Country <country>
	Then Enter Telephone <telephone>
	Then Select User Main Group checkbox 
	Then Select User Groups checkbox
	Then Select User Sub Groups checkbox
	Then Click on User Manager Save button
	Then verify User Has Been Added
	
Examples:
	| username	    | password |emailAddress               |realName          |businessName          |addressLine1          |town  |postcode|country|telephone|
	| mipegs.devuser| password |AutomationTest121@gmail.com|AutomationRealName|AutomationBusinessName|AutoamtionaddressLine1|London|123456  |UK     |+44 12345|
	
@Mipegs123
Scenario Outline: TC_04
	
	Given Enter Mipegs User Name <username>
	Then Enter Mipegs Password <password>
	Then Click on Mipegs Login button
	Then Verify Mipegs Logout button displayed
	Then Click on User Manager
	Then Click on Add User
	Then Select Profile Type <profileType>
	Then Enter Apprentice Personal mail <personalmail>
	Then Enter Coach ID Apprentice <coachID>
	Then Enter Employer ID Apprentice <employerID>
	Then Enter Trainee ID Apprentice <traineeID>
	Then Enter Apprentice First Name <firstName>
	Then Enter Last Name Apprentice <lastName>
	Then Enter Date of birth Apprentice <dateOfBirth>
	Then Enter National Insurance Number Apprentice <nationalInsuranceNumber>
	Then Enter Address line1 Apprentice <addressLine1Apprentice>
	Then Enter Address line2 Apprentice <addressLine2Apprentice>
	Then Enter Address line3 Apprentice <addressLine3Apprentice>
	Then Enter Apprentice Town <townApprentice>
	Then Enter Apprentice Country <countryApprentice>
	Then Enter Apprentice Postcode <postcodeApprentice>
	Then Enter Work Email Apprentice <workEmailApprentice>
	Then Enter Main Contact Number Apprentice <mainContactNumberApprentice>
	Then Enter Work Contact Number Apprentice <workContactNumberApprentice>
	Then Select Gender Apprentice <Gender>
	Then Enter Organisation Name Apprentice <organisationNameApprentice>
	Then Enter Branch Apprentice <branchApprentice>
	Then Enter Employer Postcode Apprentice <employerPostcodeApprentice>
	Then Enter Employer Contact Name Apprentice <employerContactNameApprentice>
	Then Enter Employer Contact Position Apprentice <employerContactPositionApprentice>
	Then Enter Employer Contact Number Apprentice <employerContactNumberApprentice>
	Then Enter Employer Email address Apprentice <employerEmailAddressApprentice>
	Then Enter Employer EDRS Number Apprentice <employerEDRSNumberApprentice>
	Then Enter Employer Company Name Apprentice <employerName>
	Then Enter Apprentice Name Apprentice <apprenticeNameApprentice>
	Then Enter Cost of end point assessment Apprentice <costOfEndPointAssessmentApprentice>
	Then Enter Agreed Price Apprentice <agreedPriceApprentice>
	Then Enter Agreed employer contribution amount Apprentice <agreedEmployerContributionAmountApprentice>
	Then Enter Start date Apprentice <startDate>
	Then Select User Main Groups Apprentice
	Then Select User Groups Apprentice
	Then Select User Sub Groups Apprentice
	Then Click on Save Apprentice button
	
	
Examples:
	| username	    | password |profileType|personalmail  |coachID  |employerID|traineeID|firstName|lastName|dateOfBirth|nationalInsuranceNumber|addressLine1Apprentice|addressLine2Apprentice|addressLine3Apprentice|townApprentice|countryApprentice|postcodeApprentice|workEmailApprentice|mainContactNumberApprentice  |workContactNumberApprentice  |Gender|organisationNameApprentice|branchApprentice|mployerPostcodeApprentice|employerContactNameApprentice|employerContactPositionApprentice|employerContactNumberApprentice |employerEmailAddressApprentice|employerEDRSNumberApprentice|employerCompanyNameApprentice|apprenticeNameApprentice|costOfEndPointAssessmentApprentice|agreedPriceApprentice|agreedEmployerContributionAmountApprentice|startDate |
	| mipegs.devuser| password |2          |Peter@test.com|Peter1234|EMP-55555 |T-777777 |Peter    |Wilson  |1981-01-16 |123456789              |Braodway 277          |Brooklyn Bridge       |St Peter 91           |London        |UK               |  10025           |Peter@nystar.com   |98854325444                  |96554328666                  |Male  |North Software            |India           |BR19RA                   |Maria Jackson                |Manager                          |25366217466                     |hr@nystar.com                 |NorthSatr-12345             |Google Inc                   |Pratik Jadhav           |500000                            |4500000              |4700000                                   |2017-01-16|
	
@Mipegs123
Scenario Outline: TC_05
	
	Given Enter Mipegs User Name <username>
	Then Enter Mipegs Password <password>
	Then Click on Mipegs Login button
	Then Verify Mipegs Logout button displayed
	Then Click on User Group
	Then Click on Add User Group Button
	Then Enter User Group Name <userGroupName>
	Then Click on Save Group Button
	Then Verify New Group has been Saved
	
Examples:
	| username	      | password  |userGroupName   |
    | mipegs.devuser  | password  |automationGroup |