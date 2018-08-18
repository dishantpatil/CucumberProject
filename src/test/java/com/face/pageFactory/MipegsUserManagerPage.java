package com.face.pageFactory;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class MipegsUserManagerPage
{
	// Local variables
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();

		//Tab
		By tabUserManager = By.xpath("//a[contains(text(), ' User Manager')]");
		
		//inputbox
		By inpEmailAddress = By.xpath("//*[@id='edit-mail']");
		By inpRealName = By.id("edit-real-name"); 
		By inpBusinessName = By.id("edit-business-name");
		By inpAddressLine1 = By.id("edit-address1");
		By inpTown = By.id("edit-town");
		By inpPostcode = By.id("edit-postcode");
		By inpCountry = By.id("edit-country");
		By inpTelephone = By.id("edit-telephone");
		
		By inpPersonalMail = By.xpath("//*[@id='edit-mail-1']");
		By inpCoachID = By.name("profile_app_coach_id");
		By inpEmployerID = By.name("profile_app_employee_id");
		By inpTraineeID = By.name("profile_app_trainee_id");
		By inpFirstName = By.name("profile_app_first_name");
		By inpLastName = By.name("profile_app_last_name");
		By inpNationalInsuranceNumber = By.name("profile_app_national_insurance_number");
		By inpAddressLine1Apprentice = By.name("profile_app_address_line_1");
		By inpAddressLine2Apprentice = By.name("profile_app_address_line_2");
		By inpAddressLine3Apprentice = By.name("profile_app_address_line_3");
		By inpTownApprentice = By.name("profile_app_town");
		By inpCountryApprentice = By.name("profile_app_country");
		By inpPostcodeApprentice = By.name("profile_app_postcode");
		By inpWorkEmailApprentice = By.name("profile_app_work_email");
		By inpMainContactNumberApprentice = By.name("profile_app_main_contact_number");
		By inpWorkContactNumberApprentice = By.name("profile_app_work_contact_number");
		By inpOrganisationNameApprentice = By.name("profile_app_employer_name");
		By inpBranchApprentice = By.name("profile_app_branch");
		By inpEmployerPostcodeApprentice = By.name("profile_app_employer_postcode");
		By inpEmployerContactNameApprentice = By.name("profile_app_employer_contact_name");
		By inpEmployerContactPositionApprentice = By.name("profile_app_employer_contact_position");
		By inpEmployerContactNumberApprentice = By.name("profile_app_employer_contact_number");
		By inpEmployerEmailAddressApprentice = By.name("profile_app_employer_email_address");
		By inpEmployerEDRSNumberApprentice = By.name("profile_app_employer_edrs_number");
		By inpEmployerCompanyNameApprentice = By.name("profile_app_employer_company_name");
		By inpApprenticeNameApprentice = By.name("profile_app_apprentice_name");
		By inpCostOfEndPointAssessmentApprentice = By.name("profile_app_cost_end_point");
		By inpAgreedPriceApprentice = By.name("profile_app_agreed_price");
		By inpAgreedEmployerContributionAmountApprentice = By.name("profile_app_agreed_amount");
				
		//Date
		By inpDateOfBirth = By.name("profile_app_date_of_birth");
		By inpDateStartDate = By.name("profile_app_start_date");
		
		
		//Checkbox
		By checkUserMainGroup = By.id("edit-user-main-groups-145");
		By checkUserGroup = By.id("edit-user-groups-192");
		By checkUserSubGroup = By.id("edit-user-sub-groups-193");
		
		By checkUserMainGroupApprentice = By.id("edit-user-main-groups-145-1");
		By checkUserGroupApprentice = By.id("edit-user-groups-192-1");
		By checkUserSubGroupApprentice = By.id("edit-user-sub-groups-193-1");
		
		
		//dropDownBox
		By dropSelectProfileType = By.xpath("//*[@id='user-type']");
		
		By dropGender = By.name("profile_app_gender");
		
		//button
		By btnAddUser = By.id("add_user");
		By btnAccountUserDetailsSave = By.xpath("//*[@id='edit-submit']");
		
		By btnAccountUserDetailsSaveApprentice = By.xpath("//*[@id='edit-submit-1']");
		
		//msg
		By msgUserHasBeenAdded = By.xpath("//div[@class = 'messages success']");
		
		
		public boolean clickUserManagerTab(){
			return objWrapperFunctions.click(tabUserManager);	
		}
		
		public boolean enterEmailAddress(String emailAddress){
			return objWrapperFunctions.setText(inpEmailAddress, emailAddress);			
		}
		
		public boolean enterRealName(String realName){
			return objWrapperFunctions.setText(inpRealName, realName);			
		}
		
		public boolean enterBusinessName(String businessName){
			return objWrapperFunctions.setText(inpBusinessName, businessName);			
		}
		
		public boolean enterAddressLine1(String addressLine1){
			return objWrapperFunctions.setText(inpAddressLine1, addressLine1);			
		}
		
		public boolean enterTown(String town){
			return objWrapperFunctions.setText(inpTown, town);			
		}
		
		public boolean enterPostcode(String postcode){
			return objWrapperFunctions.setText(inpPostcode, postcode);			
		}
		
		public boolean enterCountry(String country){
			return objWrapperFunctions.setText(inpCountry, country);			
		}
		
		public boolean enterTelephone(String telephone){
			return objWrapperFunctions.setText(inpTelephone, telephone);			
		}
		
		public boolean selectCheckBoxUserMainGroup(){
			return objWrapperFunctions.selectCheckBox(checkUserMainGroup, true);
		}
		
		public boolean selectCheckBoxUserGroup(){
			return objWrapperFunctions.selectCheckBox(checkUserGroup, true);
		}
		
		public boolean selectCheckBoxUserSubGroup(){
			return objWrapperFunctions.selectCheckBox(checkUserSubGroup, true);
		}
		
		public boolean clickAddUserButton(){
			return objWrapperFunctions.click(btnAddUser);			
		}
		
		public boolean clickAccountUserDetailsSaveButton(){
			return objWrapperFunctions.click(btnAccountUserDetailsSave);			
		}
		
		public boolean verifyUserHasBeenAddedSuccessfully(){
			return objWrapperFunctions.checkElementExistence(msgUserHasBeenAdded, 10);			
		}
		
		/******************************************************/
		
		public boolean enterPersonalMail(String personalMail){
			//objWrapperFunctions.waitForElementPresence(inpPersonalMail, 20);
			return objWrapperFunctions.setText(inpPersonalMail, personalMail);			
		}
		
		public boolean enterCoachID(String coachID){
			return objWrapperFunctions.setText(inpCoachID, coachID);			
		}
		
		public boolean enterEmployerID(String employerID){
			return objWrapperFunctions.setText(inpEmployerID, employerID);			
		}
		
		public boolean enterTraineeID(String traineeID){
			return objWrapperFunctions.setText(inpTraineeID, traineeID);			
		}
		
		public boolean enterFirstName(String firstName){
			return objWrapperFunctions.setText(inpFirstName, firstName);			
		}
		
		public boolean enterLastName(String lastName){
			return objWrapperFunctions.setText(inpLastName, lastName);			
		}
		
		public boolean enterNationalInsuranceNumber(String nationalInsuranceNumber){
			return objWrapperFunctions.setText(inpNationalInsuranceNumber, nationalInsuranceNumber);			
		}
		
		public boolean enterAddressLine1Apprentice(String addressLine1Apprentice){
			return objWrapperFunctions.setText(inpAddressLine1Apprentice, addressLine1Apprentice);			
		}
		
		public boolean enterAddressLine2Apprentice(String addressLine2Apprentice){
			return objWrapperFunctions.setText(inpAddressLine2Apprentice, addressLine2Apprentice);			
		}
		
		public boolean enterAddressLine3Apprentice(String addressLine3Apprentice){
			return objWrapperFunctions.setText(inpAddressLine3Apprentice, addressLine3Apprentice);			
		}
		
		public boolean enterTownApprentice(String townApprentice){
			return objWrapperFunctions.setText(inpTownApprentice, townApprentice);			
		}
		
		public boolean enterCountryApprentice(String countryApprentice){
			return objWrapperFunctions.setText(inpCountryApprentice, countryApprentice);			
		}
		
		public boolean enterPostcodeApprentice(String postcodeApprentice){
			return objWrapperFunctions.setText(inpPostcodeApprentice, postcodeApprentice);			
		}		
		
		public boolean enterWorkEmailApprentice(String workEmailApprentice){
			return objWrapperFunctions.setText(inpWorkEmailApprentice, workEmailApprentice);			
		}
		
		public boolean enterMainContactNumberApprentice(String mainContactNumberApprentice){
			return objWrapperFunctions.setText(inpMainContactNumberApprentice, mainContactNumberApprentice);			
		}
		
		public boolean enterWorkContactNumberApprentice(String workContactNumberApprentice){
			return objWrapperFunctions.setText(inpWorkContactNumberApprentice, workContactNumberApprentice);			
		}
		
		public boolean enterOrganisationNameApprentice(String organisationNameApprentice){
			return objWrapperFunctions.setText(inpOrganisationNameApprentice, organisationNameApprentice);			
		}
		
		public boolean enterBranchApprentice(String branchApprentice){
			return objWrapperFunctions.setText(inpBranchApprentice, branchApprentice);			
		}
		
		public boolean enterEmployerPostcodeApprentice(String employerPostcodeApprentice){
			return objWrapperFunctions.setText(inpEmployerPostcodeApprentice, employerPostcodeApprentice);			
		}
		
		public boolean enterEmployerContactNameApprentice(String employerContactNameApprentice){
			return objWrapperFunctions.setText(inpEmployerContactNameApprentice, employerContactNameApprentice);			
		}
		
		public boolean enterEmployerContactPositionApprentice(String employerContactPositionApprentice){
			return objWrapperFunctions.setText(inpEmployerContactPositionApprentice, employerContactPositionApprentice);			
		}
		
		public boolean enterEmployerContactNumberApprentice(String employerContactNumberApprentice){
			return objWrapperFunctions.setText(inpEmployerContactNumberApprentice, employerContactNumberApprentice);			
		}
		
		public boolean enterEmployerEmailAddressApprentice(String employerEmailAddressApprentice){
			return objWrapperFunctions.setText(inpEmployerEmailAddressApprentice, employerEmailAddressApprentice);			
		}
		
		public boolean enterEmployerEDRSNumberApprentice(String employerEDRSNumberApprentice){
			return objWrapperFunctions.setText(inpEmployerEDRSNumberApprentice, employerEDRSNumberApprentice);			
		}
		
		public boolean enterEmployerCompanyNameApprentice(String employerCompanyNameApprentice){
			return objWrapperFunctions.setText(inpEmployerCompanyNameApprentice, employerCompanyNameApprentice);			
		}
		
		public boolean enterApprenticeNameApprentice(String apprenticeNameApprentice){
			return objWrapperFunctions.setText(inpApprenticeNameApprentice, apprenticeNameApprentice);			
		}
		
		public boolean enterCostOfEndPointAssessmentApprentice(String costOfEndPointAssessmentApprentice){
			return objWrapperFunctions.setText(inpCostOfEndPointAssessmentApprentice, costOfEndPointAssessmentApprentice);			
		}
		
		public boolean enterAgreedPriceApprentice(String agreedPriceApprentice){
			return objWrapperFunctions.setText(inpAgreedPriceApprentice, agreedPriceApprentice);			
		}
		
		public boolean enterAgreedEmployerContributionAmountApprentice(String agreedEmployerContributionAmountApprentice){
			return objWrapperFunctions.setText(inpAgreedEmployerContributionAmountApprentice, agreedEmployerContributionAmountApprentice);			
		}
		
		public boolean enterDateOfBirth(String dateOfBirth){
			return objWrapperFunctions.setText(inpDateOfBirth, dateOfBirth);			
		}
		
		public boolean enterDateStart(String dateStart){
			return objWrapperFunctions.setText(inpDateStartDate, dateStart);			
		}
		
		public boolean selectUserMainGroupApprentice(){
			return objWrapperFunctions.selectCheckBox(checkUserMainGroupApprentice, true);
		}
		
		public boolean selectUserGroupApprentice(){
			return objWrapperFunctions.selectCheckBox(checkUserGroupApprentice, true);
		}
		
		public boolean selectUserSubGroupApprentice(){
			return objWrapperFunctions.selectCheckBox(checkUserSubGroupApprentice, true);
		}
		
		public boolean SelectProfileTypeDropDownvalue(String profileType){
			return objWrapperFunctions.selectDropDownOption(dropSelectProfileType, profileType, "Value");
		}
		
		public boolean SelectGender(String gender){
			return objWrapperFunctions.selectDropDownOption(dropGender, gender, "Value");
		}
		
		public boolean clickAccountUserDetailsSaveApprenticeButton(){
			return objWrapperFunctions.click(btnAccountUserDetailsSaveApprentice);			
		}
		
		
}
