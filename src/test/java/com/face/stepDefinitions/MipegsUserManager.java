package com.face.stepDefinitions;

import org.apache.poi.ss.formula.ThreeDEval;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import com.face.pageFactory.MipegsFormManagerPage;
import com.face.pageFactory.MipegsLoginPage;
import com.face.pageFactory.MipegsSubmitFormPage;
import com.face.pageFactory.MipegsUserManagerPage;

import core.generic.StepBase;
import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
/**
 * @ScriptName    : SuiteSteps
 * @Description   : This class contains   
 * @Author: Digvijay Dusane(Aress) @Creation Date : 16 Jan 2018   @Modified Date:                    
 */
public class MipegsUserManager 
{
	// Local variables
	private Utilities objUtilities = new Utilities();
	private MipegsUserManagerPage objMipegsUserManagerPage = new MipegsUserManagerPage();
	
	@Then ("^Click on User Manager$")
	public void clickOnUserManager()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.clickUserManagerTab());
	}
	
	@Then ("^Click on Add User$")
	public void clickOnAddUser()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.clickAddUserButton());
	}
	
	@Then("^Enter Email Address (.*)$")
	public void enterEmailAddress(String emailAddress)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterEmailAddress(emailAddress));
	}
	
	@Then("^Enter Real name (.*)$")
	public void enterRealName(String realName)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterRealName(realName));
	}
	
	@Then("^Enter Business Name (.*)$")
	public void enterBusinessName(String businessName)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterBusinessName(businessName));
	}
	
	@Then("^Enter Address Line1 (.*)$")
	public void enterAddressLine1(String addressLine1)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterAddressLine1(addressLine1));
	}
	
	@Then("^Enter Town (.*)$")
	public void enterTown(String town)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterTown(town));
	}
	
	@Then("^Enter Postcode (.*)$")
	public void enterPostcode(String postcode)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterPostcode(postcode));
	}
	
	@Then("^Enter Country (.*)$")
	public void enterCountry(String country)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterCountry(country));
	}
	
	@Then("^Enter Telephone (.*)$")
	public void enterTelephone(String telephone)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterTelephone(telephone));
	}
	
	@Then ("^Select User Main Group checkbox$")
	public void selectUserMainGroupCheckbox()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.selectCheckBoxUserMainGroup());
	}
	
	@Then ("^Select User Groups checkbox$")
	public void selectUserGroupsCheckbox()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.selectCheckBoxUserGroup());
	}
	
	@Then ("^Select User Sub Groups checkbox$")
	public void selectUserSubGroupsCheckbox()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.selectCheckBoxUserSubGroup());
	}
	
	@Then ("^Click on User Manager Save button$")
	public void clickOnSaveButton()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.clickAccountUserDetailsSaveButton());
	}
	
	@Then("^verify User Has Been Added$")
	public void verifyUserHasBeenAdded() {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.verifyUserHasBeenAddedSuccessfully());
	}
	
	/*********************************************/
	
	@Then("^Select Profile Type (.*)$")
	public void selectDropdownValue(String profileType)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.SelectProfileTypeDropDownvalue(profileType));
	}
	
	@Then("^Enter Apprentice Personal mail (.*)$")
	public void enterPersonalmailApprentice(String personalMail)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterPersonalMail(personalMail));
	}

	@Then("^Enter Coach ID Apprentice (.*)$")
	public void enterCoachIDApprentice(String coachID)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterCoachID(coachID));
	}

	@Then("^Enter Employer ID Apprentice (.*)$")
	public void enterEmployerIDApprentice(String employerID)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterEmployerID(employerID));
	}

	@Then("^Enter Trainee ID Apprentice (.*)$")
	public void enterTraineeIDApprentice(String traineeID)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterTraineeID(traineeID));
	}

	@Then("^Enter Apprentice First Name (.*)$")
	public void enterFirstNameApprentice(String firstName)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterFirstName(firstName));
	}

	@Then("^Enter Last Name Apprentice (.*)$")
	public void enterLastNameApprentice(String lastName)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterLastName(lastName));
	}

	@Then("^Enter Date of birth Apprentice (.*)$")
	public void enterDateOfBirthApprentice(String dateOfBirth)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterDateOfBirth(dateOfBirth));
	}

	@Then("^Enter National Insurance Number Apprentice (.*)$")
	public void enterNationalInsuranceNumberApprentice(String nationalInsuranceNumber)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterNationalInsuranceNumber(nationalInsuranceNumber));
	}

	@Then("^Enter Address line1 Apprentice (.*)$")
	public void enterAddressLine1Apprentice(String addressLine1Apprentice)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterAddressLine1Apprentice(addressLine1Apprentice));
	}

	@Then("^Enter Address line2 Apprentice (.*)$")
	public void enterAddressLine2Apprentice(String addressLine2Apprentice)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterAddressLine2Apprentice(addressLine2Apprentice));
	}

	@Then("^Enter Address line3 Apprentice (.*)$")
	public void enterAddressLine3Apprentice(String addressLine3Apprentice)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterAddressLine3Apprentice(addressLine3Apprentice));
	}

	@Then("^Enter Apprentice Town (.*)$")
	public void enterTownApprentice(String townApprentice)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterTownApprentice(townApprentice));
	}

	@Then("^Enter Apprentice Country (.*)$")
	public void enterCountryApprentice(String countryApprentice)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterCountryApprentice(countryApprentice));
	}

	@Then("^Enter Apprentice Postcode (.*)$")
	public void enterPostcodeApprentice(String postcodeApprentice)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterPostcodeApprentice(postcodeApprentice));
	}

	@Then("^Enter Work Email Apprentice (.*)$")
	public void enterWorkEmailApprentice(String workEmailApprentice)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterWorkEmailApprentice(workEmailApprentice));
	}

	@Then("^Enter Main Contact Number Apprentice (.*)$")
	public void enterMainContactNumberApprentice(String mainContactNumberApprentice)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterMainContactNumberApprentice(mainContactNumberApprentice));
	}

	@Then("^Enter Work Contact Number Apprentice (.*)$")
	public void enterWorkContactNumberApprentice(String workContactNumberApprentice)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterWorkContactNumberApprentice(workContactNumberApprentice));
	}

	@Then("^Select Gender Apprentice (.*)$")
	public void selectGenderApprentice(String gender)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.SelectGender(gender));
	}

	@Then("^Enter Organisation Name Apprentice (.*)$")
	public void enterOrganisationNameApprentice(String organisationNameApprentice)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterOrganisationNameApprentice(organisationNameApprentice));
	}

	@Then("^Enter Branch Apprentice (.*)$")
	public void enterBranchApprentice(String branchApprentice)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterBranchApprentice(branchApprentice));
	}

	@Then("^Enter Employer Postcode Apprentice (.*)$")
	public void enterEmployerPostcodeApprentice(String employerPostcodeApprentice)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterEmployerPostcodeApprentice(employerPostcodeApprentice));
	}
	
	@Then("^Enter Employer Contact Name Apprentice (.*)$")
	public void enterEmployerContactNameApprentice(String employerContactNameApprentice)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterEmployerContactNameApprentice(employerContactNameApprentice));
	}

	@Then("^Enter Employer Contact Position Apprentice (.*)$")
	public void enterEmployerContactPositionApprentice(String employerContactPositionApprentice)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterEmployerContactPositionApprentice(employerContactPositionApprentice));
	}

	@Then("^Enter Employer Contact Number Apprentice (.*)$")
	public void enterEmployerContactNumberApprentice(String employerContactNumberApprentice)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterEmployerContactNumberApprentice(employerContactNumberApprentice));
	}
	
	@Then("^Enter Employer Email address Apprentice (.*)$")
	public void enterEmployerEmailAddressrApprentice(String employerEmailAddressApprentice)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterEmployerEmailAddressApprentice(employerEmailAddressApprentice));
	}
	
	@Then("^Enter Employer EDRS Number Apprentice (.*)$")
	public void enterEmployerEDRSNumberApprentice(String employerEDRSNumberApprentice)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterEmployerEDRSNumberApprentice(employerEDRSNumberApprentice));
	}
	
	@Then("^Enter Employer Company Name Apprentice (.*)$")
	public void enterEmployerCompanyNameApprentice(String employerCompanyNameApprentice)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterEmployerCompanyNameApprentice(employerCompanyNameApprentice));
	}
	
	@Then("^Enter Apprentice Name Apprentice (.*)$")
	public void enterApprenticeNameApprentice(String apprenticeNameApprentice)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterApprenticeNameApprentice(apprenticeNameApprentice));
	}
	
	@Then("^Enter Cost of end point assessment Apprentice (.*)$")
	public void enterCostOfEndPointAssessmentApprentice(String costOfEndPointAssessmentApprentice)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterCostOfEndPointAssessmentApprentice(costOfEndPointAssessmentApprentice));
	}
	
	@Then("^Enter Agreed Price Apprentice (.*)$")
	public void enterAgreedPriceAssessmentApprentice(String agreedPriceApprentice)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterAgreedPriceApprentice(agreedPriceApprentice));
	}

	@Then("^Enter Agreed employer contribution amount Apprentice (.*)$")
	public void enterAgreedEmployerContributionAmountApprentice(String agreedEmployerContributionAmountApprentice)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterAgreedEmployerContributionAmountApprentice(agreedEmployerContributionAmountApprentice));
	}
	
	@Then("^Enter Start date Apprentice (.*)$")
	public void enterStartDateApprentice(String dateStart)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.enterDateStart(dateStart));
	}
	
	@Then("^Select User Main Groups Apprentice$")
	public void selectUserMainGroupsApprentice() {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.selectUserMainGroupApprentice());
	}
	
	@Then("^Select User Groups Apprentice$")
	public void selectUserGroupsApprentice() {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.selectUserGroupApprentice());
	}
	
	@Then("^Select User Sub Groups Apprentice$")
	public void selectUserSubGroupsApprentice() {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.selectUserSubGroupApprentice());
	}

	@Then("^Click on Save Apprentice button$")
	public void clickOSaveApprenticeButton() {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserManagerPage.clickAccountUserDetailsSaveApprenticeButton());
	}

	
}
