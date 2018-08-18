package com.face.pageFactory;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import core.generic.StepBase;
import core.generic.Utilities;
import core.generic.WrapperFunctions;
import junit.framework.Assert;

public class Esctoptimizerpage {

				// Local variables
				private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
				private Utilities objUtilities = new Utilities();
				private StepBase objStepBase = new StepBase();
				protected static WebDriver driver = null;
				
				
			    //inputbox
				By inpUserName = By.id("txtLoginUserName");
				By inpUserPassword = By.id("txtLoginPassword");

				//button
				By btnLogin = By.id("btnLoginNew");
				By btnImage = By.id("ImageButton6");
				By btnPopUpLoginButton = By.id("btnPopupLoginNew");
				By btnEsctServiceOptimizer = By.xpath("(//*[contains(@id,'ctl00_rbtnCleanTracks')])[1]");
				By btnDashboard = By.xpath("//*[@id='tab_container']//*[contains(text(),'Dashboard')]");
				By btnDashboardSettings = By.xpath("//*[contains(@title,'Edit Dashboard Settings')]");
				By btnAddGraph = By.xpath("//*[@id='ctl00_ESCtPlaceHolder_btnAddGraph']");
				By btnInternalSaveButton = By.id("ctl00_ESCtPlaceHolder_btnCustomGraphSave");

				By btnInternalCloseButton = By.id("ctl00_ESCtPlaceHolder_btnCustomGraphCloseBottom");
				By btnExternalSaveButton = By.xpath("(//*[contains(@id,'ctl00_ESCtPlaceHolder_btnSaveDashboradSettingsTop')])[1]");
				By popUP = By.id("popupCustomGraphSettings");
				By btnWebSetting = By.xpath("(//*[contains(text(),'Web Settings')])[1]");
				By btnWebSaveButton = By.id("ctl00_ESCtPlaceHolder_btnSaveWebSettingsBottom");
				By btnMobileSetting = By.xpath("(//*[contains(text(),'Mobile Settings')])[1]");
				By btnMobileSettingSave = By.id("ctl00_ESCtPlaceHolder_btnSaveMobileSettingsBottom");
				By btnTaskSubject = By.xpath("(//*[contains(text(),'Task Subject')])[1]");
                By btnAddTaskSubject = By.id("ctl00_ESCtPlaceHolder_grdTaskSubject_ctl00_ctl14_btnTaskSubjectEdit");
               	By btnRightTask = By.id("ctl00_ESCtPlaceHolder_grdTaskSubject_ctl00_ctl14_btnUpdate");
				By btnPolicingComments = By.xpath("(//*[contains(text(),'Policing Comment(s)')])[1]");
				By btnAddPolicingComment = By.id("ctl00_ESCtPlaceHolder_grdPolicyComment_ctl00_ctl23_btnPolicyCommentEdit");
				By btnRightPolicingComment = By.id("ctl00_ESCtPlaceHolder_grdPolicyComment_ctl00_ctl23_btnUpdate");
				By btnDeleteTaskSubject = By.id("ctl00_ESCtPlaceHolder_grdTaskSubject_ctl00_ctl14_btnTaskSubjectDelete");
				By btnYesTask = By.id("ctl00_ESCtPlaceHolder_btnPopupYes");
				By btnDeletePolicing = By.id("ctl00_ESCtPlaceHolder_grdPolicyComment_ctl00_ctl23_btnPolicyCommentDelete");
											
				By btnYesPolicing = By.id("ctl00_ESCtPlaceHolder_btnPopupYes");
				
				//frame id
				By frameid = By.id("ctl00_ESCtPlaceHolder_ifrmCustomGraphs");
				
				//edit box
				By graphName = By.id("txtGraphName");
				By DefaultTaskAgingDays = By.id("ctl00_ESCtPlaceHolder_txtTaskAgingMin");
				By DefaultTaskAlertMins = By.id("ctl00_ESCtPlaceHolder_txtTaskAlertMins");
				By autoLogOffMin = By.id("ctl00_ESCtPlaceHolder_txtAutoLogoff");
				By inProgressAutoCompleteMins = By.id("ctl00_ESCtPlaceHolder_txtDischarge");
				By defaultTaskCompletionMins =By.id("ctl00_ESCtPlaceHolder_txtTaskTimeDifference");
				By taskAlertMins = By.id("ctl00_ESCtPlaceHolder_txtCleanAlarmMins");
				By cleanIndicatorMins = By.id("ctl00_ESCtPlaceHolder_txtCleanIndicatorMins");
				By breakTimeMins = By.id("ctl00_ESCtPlaceHolder_txtBreakTime");
				By lunchTimeMins = By.id("ctl00_ESCtPlaceHolder_txtLunchTime");
				By autoLoginAfterBreakMins = By.id("ctl00_ESCtPlaceHolder_txtAutoLoginAfterBreak");
				By maximumDaysShownInProjectSchedule = By.id("ctl00_ESCtPlaceHolder_txtScheduledProjectDays");
				By maximumDaysProjectRetainedOnDeviceForInspection = By.id("ctl00_ESCtPlaceHolder_txtProjectInspectionDays");
	            By taskSubject = By.id("ctl00_ESCtPlaceHolder_grdTaskSubject_ctl00_ctl14_txtTaskSubject");
		        By descriptionTask = By.id("ctl00_ESCtPlaceHolder_grdTaskSubject_ctl00_ctl14_txtDescription");
			    By timeTaskSubject = By.id("ctl00_ESCtPlaceHolder_grdTaskSubject_ctl00_ctl14_txtTime");
				By commentPolicing  = By.id("ctl00_ESCtPlaceHolder_grdPolicyComment_ctl00_ctl23_txtComment");


				//drop-down
				By graphFor = By.xpath("//*[@id='ddlGraphBy']");
				By dataPoint = By.name("ddlDataPoints");
				By graphType = By.name("ddlGraphType");
				By policingDropdown = By.id("ctl00_ESCtPlaceHolder_grdPolicyComment_ctl00_ctl23_ddlPolicing");
										
				//verify massage
				By messageSuccess = By.className("lblSuccessMsg");
				By messageSuccess1 = By.xpath("//*[contains(text(),' Dashboard settings saved successfully')]");
				By webMessageSuccess = By.xpath("//*[text()=' Web Settings saved successfully']");
				By mobileMessageSuccess = By.xpath("//*[text()=' Mobile Settings saved successfully']");
				By taskSubjectMessageSuccess = By.xpath("//*[text()=' The task subject saved successfully']");
				By policingMessageSuccess = By.xpath("//*[text()=' The policing comment saved successfully']");
				By taskDeleteMessageSuccess = By.xpath("//*[text()=' The task subject deleted successfully']");
				By policingDeleteMessageSuccess = By.xpath("//*[text()=' The policing comment deleted successfully']");
				
				//employee checkbox
				By employeeCheckbox = By.xpath("//td[contains(text(),'Bose, Rohan')]/preceding::input[1]");
				
				
				/** Set Roodlane email address
				 * @return */
				public boolean setUserName(String userName){
					return objWrapperFunctions.setText(inpUserName, userName);
					
				}
				
				public boolean setUserPassword(String password){
					return objWrapperFunctions.setText(inpUserPassword, password);
				}
				
				public boolean clickLoginButton(){
					return objWrapperFunctions.click(btnLogin);
				}
				//--------------------------------
				public boolean clickLoginButton1(){
				    objWrapperFunctions.click(btnImage);

				   if(objWrapperFunctions.checkElementExistence(btnImage, 5))
				   {
				    return objWrapperFunctions.click(btnImage); 
				   }

				   else 
				   {
				    return objWrapperFunctions.click(btnPopUpLoginButton);

				  }
	   	   }

				/** click Esct optimizer Add graph*/
				public boolean clickEsctOptimizerButton(){
					return objWrapperFunctions.click(btnEsctServiceOptimizer);
				}

				public boolean clickDashboardButton(){
					return objWrapperFunctions.click(btnDashboard);
				}

				public boolean clickDashboardSettingsButton(){
					return objWrapperFunctions.click(btnDashboardSettings);
				}

				public boolean clickAddGraphButton(){
					return objWrapperFunctions.click(btnAddGraph);
				}

				/**Graph page*/
				public boolean selectGraphForDropDown(String dropDownValue){
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					objWrapperFunctions.checkElementExistence(frameid, 5);
					StepBase.driver.switchTo().frame("ctl00_ESCtPlaceHolder_ifrmCustomGraphs");
					return objWrapperFunctions.selectDropDownOption(graphFor, dropDownValue, "Text");
				}

				public boolean enterGraphName(String text){ 
					objUtilities.waitForPageLoad();
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				return objWrapperFunctions.setText(graphName, text);
				}

				public boolean selectemployeecheckBox(){
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					objUtilities.waitForPageLoad();
					return objWrapperFunctions.click(employeeCheckbox);
				}
				
				public boolean selectDataPointDropDown(String dropDownValue1){
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return objWrapperFunctions.selectDropDownOption(dataPoint, dropDownValue1, "Index");
				}

				public boolean selectGraphTypeDropDown(String dropDownValue2){
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					objWrapperFunctions.checkElementExistence(graphType, 10);
					return objWrapperFunctions.selectDropDownOption(graphType, dropDownValue2, "Index");
					
				}
				
				public boolean clickInternalSaveButton(){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					StepBase.driver.switchTo().defaultContent();
					objWrapperFunctions.click(popUP);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return objWrapperFunctions.click(btnInternalSaveButton);
				}	
					
   				public String verifySuccessMSG(String successMSG1){ 
				 StepBase.driver.switchTo().frame("ctl00_ESCtPlaceHolder_ifrmCustomGraphs");
				 objWrapperFunctions.checkElementExistence(messageSuccess, 15);
				 successMSG1 = objWrapperFunctions.getText(messageSuccess, "Text");
				 return successMSG1;
				}
			
				public boolean clickInternalCloseButton(){
					StepBase.driver.switchTo().defaultContent();
					objUtilities.waitForPageLoad();
					objWrapperFunctions.checkElementExistence(btnInternalCloseButton, 10);
					return objWrapperFunctions.click(btnInternalCloseButton);
				}	

				public boolean clickExternalSaveButton(){
					objUtilities.waitForPageLoad();
					return objWrapperFunctions.click(btnExternalSaveButton);
				}	

				public String verifySuccessMSG1(String successMSG2){ 
				successMSG2 = objWrapperFunctions.getText(messageSuccess1, "text");
				return successMSG2;
				}
				
				/** web settings*/
				
				public boolean clickWebSetting(){
					return objWrapperFunctions.click(btnWebSetting);
				}

				public boolean enterDefaultTaskAgingDays(String value0){ 
					return objWrapperFunctions.setText(DefaultTaskAgingDays, value0);                  
				}
				
				public boolean enterDefaultTaskAlertMinutes(String value1){ 
					return objWrapperFunctions.setText(DefaultTaskAlertMins, value1);                  
				}
				
				public boolean clickWebSettingSave(){
					return objWrapperFunctions.click(btnWebSaveButton);
				}
				
				public String verifyWebSuccessMSG(String successMSG0){ 
				successMSG0 = objWrapperFunctions.getText(webMessageSuccess, "text");
				return successMSG0;
				}

				public boolean enterDefaultTaskAgingDays1(String value2){ 
					return objWrapperFunctions.setText(DefaultTaskAgingDays, value2);                  
				}
				
				public boolean enterDefaultTaskAlertMinutes1(String value3){ 
					return objWrapperFunctions.setText(DefaultTaskAlertMins, value3);                  
				}
				
				public boolean clickWebSettingSave1(){
					return objWrapperFunctions.click(btnWebSaveButton);
				}
				
				public String verifyWebSuccessMSG1(String successMSG0){ 
				successMSG0 = objWrapperFunctions.getText(webMessageSuccess, "text");
				return successMSG0;
				}
				
				/** mobile setting*/

				public boolean clickMobileSetting(){
					return objWrapperFunctions.click(btnMobileSetting);
				}
				
				public boolean enterAutoLogoffMinutes(String value4){ 
					return objWrapperFunctions.setText(autoLogOffMin, value4);                  
				}
				
				public boolean enterInProgressAutoCompleteMinutes(String value5){ 
					return objWrapperFunctions.setText(inProgressAutoCompleteMins, value5);                  
				}

				public boolean enterDefaultTaskCompletionMinutes(String value6){ 
					return objWrapperFunctions.setText(defaultTaskCompletionMins, value6);                  
				}

				public boolean enterTaskAlertMinutes(String value7){ 
					return objWrapperFunctions.setText(taskAlertMins, value7);                  
				}

				public boolean enterCleanIndicatorMinutes(String value8){ 
					return objWrapperFunctions.setText(cleanIndicatorMins, value8);                  
				}

				public boolean enterBreakTimeMinutes(String value9){ 
					return objWrapperFunctions.setText(breakTimeMins, value9);                  
				}

				public boolean enterLunchTimeMinutes(String value10){ 
					return objWrapperFunctions.setText(lunchTimeMins, value10);                  
				}

				public boolean enterAutoLoginBreakMinutes(String value11){ 
					return objWrapperFunctions.setText(autoLoginAfterBreakMins, value11);                  
				}

				public boolean enterMaxDaysShownInProject(String value12){ 
					return objWrapperFunctions.setText(maximumDaysShownInProjectSchedule, value12);                  
				}

				public boolean enterMaxDaysProjectRetained(String value13){ 
					return objWrapperFunctions.setText(maximumDaysProjectRetainedOnDeviceForInspection, value13);                  
				}

				public boolean clickMobileSettingSave(){
					return objWrapperFunctions.click(btnMobileSettingSave);
				}
				
				public String verifyMobileSuccessMSG(String successMSG2){ 
				successMSG2 = objWrapperFunctions.getText(mobileMessageSuccess, "text");
				return successMSG2;
				}

				public boolean enterAutoLogoffMinutes1(String value14){ 
					return objWrapperFunctions.setText(autoLogOffMin, value14);                  
				}
				
				public boolean enterInProgressAutoCompleteMinutes1(String value15){ 
					return objWrapperFunctions.setText(inProgressAutoCompleteMins, value15);                  
				}

				public boolean enterDefaultTaskCompletionMinutes1(String value16){ 
					return objWrapperFunctions.setText(defaultTaskCompletionMins, value16);                  
				}

				public boolean enterTaskAlertMinutes1(String value17){ 
					return objWrapperFunctions.setText(taskAlertMins, value17);                  
				}

				public boolean enterCleanIndicatorMinutes1(String value18){ 
					return objWrapperFunctions.setText(cleanIndicatorMins, value18);                  
				}

				public boolean enterBreakTimeMinutes1(String value19){ 
					return objWrapperFunctions.setText(breakTimeMins, value19);                  
				}

				public boolean enterLunchTimeMinutes1(String value20){ 
					return objWrapperFunctions.setText(lunchTimeMins, value20);                  
				}

				public boolean enterAutoLoginBreakMinutes1(String value21){ 
					return objWrapperFunctions.setText(autoLoginAfterBreakMins, value21);                  
				}

				public boolean enterMaxDaysShownInProject1(String value22){ 
					return objWrapperFunctions.setText(maximumDaysShownInProjectSchedule, value22);                  
				}

				public boolean enterMaxDaysProjectRetained1(String value23){ 
					return objWrapperFunctions.setText(maximumDaysProjectRetainedOnDeviceForInspection, value23);                  
				}

				public boolean clickMobileSettingSave1(){
					return objWrapperFunctions.click(btnMobileSettingSave);
				}
				
				public String verifyMobileSuccessMSG1(String successMSG2){ 
				successMSG2 = objWrapperFunctions.getText(mobileMessageSuccess, "text");
				return successMSG2;
				}

				/** Task Subject*/
				
				public boolean clickTaskSubject(){
					return objWrapperFunctions.click(btnTaskSubject);
				}
				
				public boolean clickEditTaskSubject(){
					return objWrapperFunctions.click(btnAddTaskSubject);
				}
				
				public boolean enterTaskSubject(String subject){ 
					return objWrapperFunctions.setText(taskSubject, subject);                  
				}
				
				public boolean enterTaskDescription(String description) { 
					return objWrapperFunctions.setText(descriptionTask, description);                  
				}

				public boolean enterTaskTime(String value24){ 
					return objWrapperFunctions.setText(timeTaskSubject, value24);                  
				}
				
				public boolean clickRightTaskSubject(){
					return objWrapperFunctions.click(btnRightTask);
				}

				public String verifyMobileSuccessMSG3(String successMSG3){ 
				successMSG3 = objWrapperFunctions.getText(taskSubjectMessageSuccess, "text");
				return successMSG3;
				}
				
				public boolean clickDeleteTaskSubject(){
					return objWrapperFunctions.click(btnDeleteTaskSubject);
				}

				public boolean clickYesPopup(){
					return objWrapperFunctions.click(btnYesTask);
				}

				public String verifyTaskSubjectDeleteMSG5(String successMSG5){ 
				successMSG5 = objWrapperFunctions.getText(taskDeleteMessageSuccess, "text");
				return successMSG5;
				}
				

				/** Policing comment*/
				
				public boolean clickPolicingComment(){
					return objWrapperFunctions.click(btnPolicingComments);
				}
				
				public boolean clickEditPolicingComment(){
					return objWrapperFunctions.click(btnAddPolicingComment);
				}

				public boolean selectDropDown(String dropDown3){
					return objWrapperFunctions.selectDropDownOption(policingDropdown, dropDown3, "Text");
				}

				public boolean enterComment(String comment){ 
					return objWrapperFunctions.setText(commentPolicing, comment);                  
				}

				public boolean clickRightButton(){
					return objWrapperFunctions.click(btnRightPolicingComment);
				}

				public String verifyMobileSuccessMSG4(String successMSG4){ 
				successMSG4 = objWrapperFunctions.getText(policingMessageSuccess, "text");
				return successMSG4;
				}

				public boolean clickDeletePolicingButton(){
					return objWrapperFunctions.click(btnDeletePolicing);
				}
				
				public boolean clickYespopupPolicing(){
					return objWrapperFunctions.click(btnYesPolicing);
				}
				
				public String verifyPolicingDeleteMSG6(String successMSG6){ 
				successMSG6 = objWrapperFunctions.getText(policingDeleteMessageSuccess, "text");
				return successMSG6;
				}

}
