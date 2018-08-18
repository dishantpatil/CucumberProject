package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.EsctLoginPage;

import core.generic.Utilities;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Esct {
	// Local variables
	
		private Utilities objUtilities = new Utilities();
		//private RoodlaneLoginPage objRoodlaneLoginPage = new RoodlaneLoginPage();
		private EsctLoginPage objEsctLoginPage = new EsctLoginPage();
		
		@Given("^Enter Esct User Name (.*)$")
		public void enterUserName(String userName)  
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.setUserName(userName));
			
		}

		@Then("^Enter Esct Password (.*)$")
		public void enterPassword(String password)  
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.setUserPassword(password));
		}
		
		@Then("^Click on Esct Login button$")
		public void clickOnLoginButton()  
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.clickLoginButton());
			Assert.assertTrue(objEsctLoginPage.clickLoginButton1());
		}
		
		@Then("^Click on Special Function Button$")
		public void clickspecialfunctionbutton()
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.clickSpecialFunctionButton());
		}
		
		@Then("^Click on Master file button$")
		public void clickmasterfilebutton()
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.clickMasterFileButton());
		}
		
		@Then("^Click on Rooms$")
		public void clickroomtypebutton()
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.clickRoomTypeButton());
		}
		
		@Then("^Click on Add Rooms$")
		public void clickaddroomtypebutton()
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.clickAddRoomTypeButton());
		}
		
		@Then("^Click on Mass Update Button$")
		public void clickmassbutton()
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.clickMassUpdateButton());
		}
		
		@Then ("^Select drop-down option (.*)$")
		public void selectDropDownvalue(String dropDownValue)
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.selectDropDownvalue(dropDownValue));
		}
		
		@Then ("^Select Subsection drop-down option (.*)$")
		public void selectSubsectionDropDownvalue(String subsectionDropDownValue)
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.selectSubsectionDropDownvalue(subsectionDropDownValue));
		}
		
		@Then ("^Select Room Type drop-down option (.*)$")
		public void selectRoomTypeDropDownvalue(String roomTypeDropDownValue)
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.selectRoomTypeDropDownvalue(roomTypeDropDownValue));
		}
		
		
		@Then ("^Select drop-down optionupdateroomdepartment (.*)$")
		public void selectDropDownvalue1(String dropDownValue1)
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.selectDropDownvalue1(dropDownValue1));
		}
		
		@Then ("^Select drop-down optionupdateroomfloortype (.*)$")
		public void selectDropDownvalue3(String dropDownValue1)
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.selectDropDownvalue3(dropDownValue1));
		}
		
		@Then ("^Select drop-down optionopenclosed (.*)$")
		public void selectDropDownvalue5(String dropDownValue1)
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.selectDropDownvalue5(dropDownValue1));
		}
		
		@Then ("^Select drop-down updateroomsdenydaily (.*)$")
		public void selectDropDownvalue7(String dropDownValue1)
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.selectDropDownvalue7(dropDownValue1));
		}
		
		@Then ("^Select drop-down updateroomsdenyperiodic (.*)$")
		public void selectDropDownvalue9(String dropDownValue1)
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.selectDropDownvalue9(dropDownValue1));
		}
		
		@Then ("^Select drop-down updatesupervisor (.*)$")
		public void selectOptionUpdateDropDownvalue11(String dropDownValue1)
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.selectDropDownvalue11(dropDownValue1));
		}

		@Then ("^Select drop-down optionupdateroomdepartment1 (.*)$")
		public void selectDropDownvalue2(String dropDownValue2)
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.selectDropDownvalue2(dropDownValue2));
		}
		
		@Then ("^Select drop-down optionupdateroomfloortype1 (.*)$")
		public void selectDropDownvalue4(String dropDownValue2)
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.selectDropDownvalue4(dropDownValue2));
		}
		
		@Then ("^Select drop-down optionopenclosed1 (.*)$")
		public void selectDropDownvalue6(String dropDownValue2)
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.selectDropDownvalue6(dropDownValue2));
		}
		
		@Then ("^Select drop-down updateroomsdenydaily1 (.*)$")
		public void selectDropDownvalue8(String dropDownValue2)
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.selectDropDownvalue8(dropDownValue2));
		}
		
		@Then ("^Select drop-down updateroomsdenyperiodic1 (.*)$")
		public void selectDropDownvalue10(String dropDownValue2)
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.selectDropDownvalue10(dropDownValue2));
		}
		
		@Then ("^Select drop-down updatesupervisor1 (.*)$")
		public void selectDropDownvalue12(String dropDownValue2)
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.selectDropDownvalue12(dropDownValue2));
		}
		
		@Then ("^Click on Update Button$")
		public void clickUpdateButton()
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.clickUpdateButton());
		}
		
		
		@Then ("^Select checkCheckBox$")
		public void selectcheckCheckBox()
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.selectcheckCheckBox());
		}
		
		@Then ("^Select supervisorsCheckBox$")
		public void selectsupervisorCheckBox()
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.selectupdatesupervisorcheckBox());
		}
		
		@Then ("^Select massCheckBox$")
		public void selectMassCheckBox()
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.selectmasscheckBox());
		}
		
		@Then("^Verify Success message1 (.*)$")
		public void verifyMessage(String successMSG1)
		{
			Assert.assertEquals(successMSG1, objEsctLoginPage.verifySuccessMSG(successMSG1));
			objUtilities.waitForPageLoad();
		}
		
		@Then ("^Click on Update Button1$")
		public void clickUpdateButton1()
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.clickUpdateButton());
		}
		
		@Then ("^Enter text(.*)$")
		public void enterText(String text)
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.enterText(text));
		}
		
		@Then ("^Enter first text(.*)$")
		public void enterFirstText(String text1)
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.enterText(text1));
		}

		@Then ("^Enter Description(.*)$")
		public void enterdescription(String text)
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.enterDescription(text));
		}
		
		@Then ("^Enter Square feet(.*)$")
		public void enterSquareFeet(String text1)
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.enterSquareFeet(text1));
		}

		@Then ("^Click on Save Button$")
		public void clickSaveButton()
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.clickSaveButton());
		}

		@Then ("^Delete mass room$")
		public void clickDeleteButton()
		{
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objEsctLoginPage.clickDeleteButton());
			Assert.assertTrue(objEsctLoginPage.clickYesButton());
		}
		
}
			

