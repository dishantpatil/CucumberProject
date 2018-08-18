package com.face.stepDefinitions;

import org.junit.Assert;
import com.face.pageFactory.Esctoptimizerpage;
import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Esctoptimizer {
	// Local variables
	
			private Utilities objUtilities = new Utilities();
			private Esctoptimizerpage objEsctoptimizerpage = new Esctoptimizerpage();
			
			@Given("^Enter Esct User Name1 (.*)$")
			public void enterUserName(String userName)  
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.setUserName(userName));
				
			}

			@Then("^Enter Esct Password1 (.*)$")
			public void enterPassword(String password)  
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.setUserPassword(password));
			}
			
			@Then("^Click on Esct Login button1$")
			public void clickOnLoginButton()  
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickLoginButton());
				Assert.assertTrue(objEsctoptimizerpage.clickLoginButton1());
			}
			
			@Then("^Click on Esct service optimizer$")
			public void clickesctoptimizerbutton()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickEsctOptimizerButton());
			}

			@Then("^Click on Dashboard$")
			public void clickdashboardbutton()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickDashboardButton());
			}
			
			@Then("^Click on Dashboard Settings$")
			public void clickdashboardsettingbutton()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickDashboardSettingsButton());
			}
			
			@Then("^Click on Add graph$")
			public void clickaddgraph()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickAddGraphButton());
			}
			
			@Then("^Select graph for drop-down option (.*)$")
			public void selectgraphfordropdownoption(String dropDownValue)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.selectGraphForDropDown(dropDownValue));
			}

			@Then("^Enter graph name (.*)$")
			public void enterDescription(String text)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterGraphName(text));
			}

			@Then("^Select employeeCheckBox$")
			public void selectemployeecheckBox()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.selectemployeecheckBox());
			}
			
			
			@Then("^Select data point drop-down option (.*)$")
			public void selectdatapointdropdownoption(String dropDownValue1)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.selectDataPointDropDown(dropDownValue1));
			}
			
			@Then("^Select graph type drop-down option (.*)$")
			public void selectgraphtypedropdownoption(String dropDownValue2)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.selectGraphTypeDropDown(dropDownValue2));
			}
			
			@Then("^Click on Internal Save Button$")
			public void clickinternalsavebutton()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickInternalSaveButton());
			}
			
			@Then("^Click on Close Button$")
			public void clickinternalclosebutton()
			{
				objUtilities.waitForPageLoad();
				
				Assert.assertTrue(objEsctoptimizerpage.clickInternalCloseButton());
			}

			@Then("^Verify Success message12 (.*)$")
			public void verifyMessage(String successMSG1)
			{
				Assert.assertEquals(successMSG1, objEsctoptimizerpage.verifySuccessMSG(successMSG1));
				objUtilities.waitForPageLoad();
			}
			
			@Then("^Click on External Save Button$")
			public void clickexternalsavebutton()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickExternalSaveButton());
			}

			@Then("^Verify Success message123 (.*)$")
			public void verifyMessage1(String successMSG2)
			{
				Assert.assertEquals(successMSG2, objEsctoptimizerpage.verifySuccessMSG1(successMSG2));
				objUtilities.waitForPageLoad();
			}

			/** web setting*/
			
			@Then("^Click on Web Settings$")
			public void clickwebsettingbutton()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickWebSetting());
			}
			
			@Then ("^Enter Default Task Aging Days (.*)$")
			public void enterDefaultTask(String value0)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterDefaultTaskAgingDays(value0));
			}
			
			@Then ("^Enter Default Task Alert Mins (.*)$")
			public void enterDefaultAlert(String value1)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterDefaultTaskAlertMinutes(value1));
			}
			
			@Then("^Click on Web Save Button$")
			public void clickwebsavebutton()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickWebSettingSave());
			}
			
			@Then("^Verify Web Setting Success Massage (.*)$")
			public void verifywebSuccessMessage(String successMSG0)
			{
				Assert.assertEquals(successMSG0, objEsctoptimizerpage.verifyWebSuccessMSG(successMSG0));
				objUtilities.waitForPageLoad();
			}
			
			@Then ("^Enter Default Task Aging Days1 (.*)$")
			public void enterDefaultTask1(String value2)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterDefaultTaskAgingDays1(value2));
			}
			
			@Then ("^Enter Default Task Alert Mins1 (.*)$")
			public void enterDefaultAlert1(String value3)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterDefaultTaskAlertMinutes1(value3));
			}
			
			@Then("^Click on Web Save Button1$")
			public void clickwebsavebutton1()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickWebSettingSave1());
			}
			
			@Then("^Verify Web Setting Success Massage1 (.*)$")
			public void verifywebSuccessMessage1(String successMSG0)
			{
				Assert.assertEquals(successMSG0, objEsctoptimizerpage.verifyWebSuccessMSG1(successMSG0));
				objUtilities.waitForPageLoad();
			}
			
			/** mobile setting*/
			
			@Then("^Click on Mobile Setting$")
			public void clickmobilesettingbutton()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickMobileSetting());
			}
			
			@Then ("^Enter Auto Logoff Mins (.*)$")
			public void enterautologoffminutes(String value4)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterAutoLogoffMinutes(value4));
			}
			
			@Then ("^Enter In progress Auto Complete Mins (.*)$") 
			public void enterautocompleteminutes(String value5)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterInProgressAutoCompleteMinutes(value5));
			}
			
			@Then ("^Enter Default Task Completion Mins (.*)$") 
			public void enterdefaulttaskcompletioneminutes(String value6)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterDefaultTaskCompletionMinutes(value6));
			}
			
			@Then ("^Enter Task Alert Mins (.*)$") 
			public void entertaskalertminutes(String value7)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterTaskAlertMinutes(value7));
			}

			@Then ("^Enter Clean Indicator Mins (.*)$") 
			public void entercleanindicatorminutes(String value8)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterCleanIndicatorMinutes(value8));
			}
			
			@Then ("^Enter Break Time Mins (.*)$") 
			public void enterbreaktimeminutes(String value9)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterBreakTimeMinutes(value9));
			}
			
			@Then ("^Enter Lunch Time Mins (.*)$") 
			public void enterlunchtimeminutes(String value10)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterLunchTimeMinutes(value10));
			}
			
			@Then ("^Enter Auto Login after Break Mins (.*)$") 
			public void enterautologinafterbreakminutes(String value11)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterAutoLoginBreakMinutes(value11));
			}
			
			@Then ("^Enter Maximum days to be shown in Project Schedule (.*)$") 
			public void entermaxdaysshowninproject(String value12)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterMaxDaysShownInProject(value12));
			}
			
			@Then ("^Enter Maximum days Project Retained on Device for Inspection (.*)$") 
			public void entermaxdaysprojectretained(String value13)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterMaxDaysProjectRetained(value13));
			}
			
			@Then("^Click on Mobile Save Button$")
			public void clickmobilesavebutton()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickMobileSettingSave());
			}
			
			@Then("^Verify Mobile Setting Success Massage2 (.*)$")
			public void verifymobileSuccessMessage(String successMSG2)
			{
				Assert.assertEquals(successMSG2, objEsctoptimizerpage.verifyMobileSuccessMSG(successMSG2));
				objUtilities.waitForPageLoad();
			}
			
			@Then ("^Enter Auto Logoff Mins1 (.*)$")
			public void enterautologoffminutes1(String value14)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterAutoLogoffMinutes1(value14));
			}
			
			@Then ("^Enter In progress Auto Complete Mins1 (.*)$") 
			public void enterautocompleteminutes1(String value15)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterInProgressAutoCompleteMinutes1(value15));
			}
			
			@Then ("^Enter Default Task Completion Mins1 (.*)$") 
			public void enterdefaulttaskcompletioneminutes1(String value16)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterDefaultTaskCompletionMinutes1(value16));
			}
			
			@Then ("^Enter Task Alert Mins1 (.*)$") 
			public void entertaskalertminutes1(String value17)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterTaskAlertMinutes1(value17));
			}

			@Then ("^Enter Clean Indicator Mins1 (.*)$") 
			public void entercleanindicatorminutes1(String value18)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterCleanIndicatorMinutes(value18));
			}
			
			@Then ("^Enter Break Time Mins1 (.*)$") 
			public void enterbreaktimeminutes1(String value19)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterBreakTimeMinutes(value19));
			}
			
			@Then ("^Enter Lunch Time Mins1 (.*)$") 
			public void enterlunchtimeminutes1(String value20)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterLunchTimeMinutes1(value20));
			}
			
			@Then ("^Enter Auto Login after Break Mins1 (.*)$") 
			public void enterautologinafterbreakminutes1(String value21)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterAutoLoginBreakMinutes1(value21));
			}
			
			@Then ("^Enter Maximum days to be shown in Project Schedule1 (.*)$") 
			public void entermaxdaysshowninproject1(String value22)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterMaxDaysShownInProject1(value22));
			}
			
			@Then ("^Enter Maximum days Project Retained on Device for Inspection1 (.*)$") 
			public void entermaxdaysprojectretained1(String value23)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterMaxDaysProjectRetained1(value23));
			}
			
			@Then("^Click on Mobile Save Button1$")
			public void clickmobilesavebutton1()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickMobileSettingSave1());
			}
			
			@Then("^Verify Mobile Setting Success Massage21 (.*)$")
			public void verifymobileSuccessMessage1(String successMSG2)
			{
				Assert.assertEquals(successMSG2, objEsctoptimizerpage.verifyMobileSuccessMSG1(successMSG2));
				objUtilities.waitForPageLoad();
			}
			
			/**Task subject*/
			
			@Then("^Click on Task Subject$")
			public void clicktasksubject()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickTaskSubject());
			}
			
			@Then ("^Click on Edit Task Subject Button$") 
			public void clickedittasksubject()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickEditTaskSubject());
			}

			@Then ("^Enter Task Subject (.*)$") 
			public void entertasksubject(String subject)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterTaskSubject(subject));
			}

			@Then ("^Enter Task Description (.*)$") 
			public void entertaskdescription(String description)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterTaskDescription(description));
			}
	
			@Then ("^Enter Time (.*)$") 
			public void entertime(String value24)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterTaskTime(value24));
			}
			
			@Then ("^Click on Task Right Button$") 
			public void clickrighttasksubjectbutton()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickRightTaskSubject());
			}
		
			@Then("^Verify Success Massage3 (.*)$")
			public void verifytasksubjectsuccessmessage(String successMSG3)
			{
				Assert.assertEquals(successMSG3, objEsctoptimizerpage.verifyMobileSuccessMSG3(successMSG3));
				objUtilities.waitForPageLoad();
			}
			
			@Then("^Click on Delete Task Button$")
			public void clickdeletetask()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickDeleteTaskSubject());
			}
			
			@Then("^Click on Yes Pop-up$")
			public void clickyespopuptask()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickYesPopup());
			}
			
			@Then("^Verify Success Message5 (.*)$")
			public void verifydeletetasksubjectsuccessmessage(String successMSG5)
			{
				Assert.assertEquals(successMSG5, objEsctoptimizerpage.verifyTaskSubjectDeleteMSG5(successMSG5));
				objUtilities.waitForPageLoad();
			}
			
			/**Policing comments*/
			
			@Then("^Click on Policing Comments$")
			public void clickpolicingcomments()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickPolicingComment());
			}

			@Then("^Click on Edit Policing Comments$")
			public void clickeditpolicingcomments()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickEditPolicingComment());
			}

			@Then ("^Select DropDown of Policing comments (.*)$")
			public void selectDropDownvalue(String dropDown3)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.selectDropDown(dropDown3));
			}

			@Then ("^Enter Comment (.*)$") 
			public void entercomment(String comment)
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.enterComment(comment));
			}
	
			@Then("^Click on Policing Right Button$")
			public void clickpolicingrightbutton()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickRightButton());
			}
		
			@Then("^Verify Success Massage4 (.*)$")
			public void verifypolicingSuccessMessage1(String successMSG4)
			{
				Assert.assertEquals(successMSG4, objEsctoptimizerpage.verifyMobileSuccessMSG4(successMSG4));
				objUtilities.waitForPageLoad();
			}

			@Then("^Click on Delete Policing Comment Button$")
			public void clickdeletepolicingcomments()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickDeletePolicingButton());
			}
			
			@Then("^Click on Yes Pop-up of Policing$")
			public void clickyespopuppolicing()
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objEsctoptimizerpage.clickYespopupPolicing());
			}
			
			@Then("^Verify Success Message6 (.*)$")
			public void verifydeletepolicingsuccessmessage(String successMSG6)
			{
				Assert.assertEquals(successMSG6, objEsctoptimizerpage.verifyPolicingDeleteMSG6(successMSG6));
				objUtilities.waitForPageLoad();
			}

}
