package com.face.pageFactory;

import org.openqa.selenium.By;

import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class EsctLoginPage {
			// Local variables
			private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
			private Utilities objUtilities = new Utilities();

		    //inputbox
			By inpUserName = By.id("txtLoginUserName");
			By inpUserPassword = By.id("txtLoginPassword");

			//button
			By btnLogin = By.id("btnLogin");
			By btnImage = By.id("btnSingleSign");
			By btnPopUpLoginButton = By.xpath("//*[contains(@id,'btnPopupLogin')]");
			By btnSpecialFunctionButton= By.id("ctl00_ESCtRibbon");
			By btnMasterFileButton= By.xpath("//*[contains(@class,'rrbTabLabel')]//*[text()='Master File']");
			By btnRoomButton= By.xpath("//*[contains(@class,'rrbButtonIn')]//*[text()='Rooms']");
			By btnAddRoomsButton= By.xpath("//*[contains(@id,'ctl00_ESCtPlaceHolder_btnAddRoomsTop')]"); 
			By btnDeleteButton= By.xpath("//*[contains(@id,'ctl00_ESCtPlaceHolder_btnDeleteRoomBottom')]");
			By btnYesButton = By.xpath("//*[contains(@id,'ctl00_ESCtPlaceHolder_btnPopupYes')]");
			
			//Save 
			By btnSaveButton= By.id("ctl00_ESCtPlaceHolder_btnSaveBottom");
			
			//Mass Update
			By btnmassUpdateButton = By.id("ctl00_rbtnMassUpdate");
			
			//Update
			By btnUpdateButton = By.xpath("//*[contains(@title,'Update')]");
			
			//dropdown
			By dropPicklist = By.xpath("//*[contains(@id,'ctl00_ESCtPlaceHolder_ddlOption')]");
			
			//CheckBox
			By checkCheckBox = By.xpath("//td[contains(text(),'Male Subsection Ward: TEST R 2')]/preceding::input[1]/preceding::input[1]");
			By selectupdateSupervisorCheckBox = By.xpath("//td[text()='QA Automation, Employee']/..//input[@name='ctl00$ESCtPlaceHolder$grdEmployees$ctl00$ctl10$CheckSelectCheckBox']");
			By selectMassCheckbox = By.xpath("//td[text()='Mass Delete Room']/preceding::input[2]");
			
			//drop down subsections and room type
			By subsectionDropDown = By.xpath("//*[contains(@name,'ctl00$ESCtPlaceHolder$ddlSubsection')]");
			By roomDropDown = By.xpath("//*[contains(@id,'ctl00_ESCtPlaceHolder_ddlRoomType')]");
			
			//dropdown1
			By dropPicklist1 = By.xpath("//*[contains(@id,'ctl00_ESCtPlaceHolder_ddlRoomsDepartment')]");
			By dropPicklist2 = By.xpath("//*[contains(@id,'ctl00_ESCtPlaceHolder_ddlRoomsFloorType')]");
			By dropPicklist3 = By.xpath("//*[contains(@name,'ctl00$ESCtPlaceHolder$ddlRoomsOpenClosed')]");
			By dropPicklist4 = By.xpath("//*[contains(@name,'ctl00$ESCtPlaceHolder$ddlRoomsAllowDeny')]");
			By dropPicklist5 = By.xpath("//*[contains(@name,'ctl00$ESCtPlaceHolder$ddlRoomsAllowDeny')]");
			By dropPicklist6 = By.id("ctl00_ESCtPlaceHolder_ddlNewSupervisor");
			
			//msg
			By messageSuccess = By.xpath("//*[contains(@class,'lblSuccessMsg')]");

			//edit box
			By editBox = By.xpath("//td[contains(text(),'Male Subsection Ward: TEST R 2')]/preceding::input[1]"); 
			By descriptionBox = By.xpath("//*[contains(@id,'ctl00_ESCtPlaceHolder_txtDescription')]");
			By squareFeet = By.xpath("//*[contains(@id,'ctl00_ESCtPlaceHolder_txtSquareFeet')]");
			
			/** Set Roodlane email address
			 * @return */
			public boolean setUserName(String userName){
				return objWrapperFunctions.setText(inpUserName, userName);
				
			}
			
			/** Set Roodlane password*/
			public boolean setUserPassword(String password){
				return objWrapperFunctions.setText(inpUserPassword, password);
			}
			
			/** Click Login button*/
			public boolean clickLoginButton(){
				return objWrapperFunctions.click(btnLogin);
			}
			//--------------------------------
			/** click login button1*/ 
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
			/** click special function button*/
			public boolean clickSpecialFunctionButton(){
			    objWrapperFunctions.click(btnSpecialFunctionButton);
				return objWrapperFunctions.click(btnSpecialFunctionButton);

			}

			/** click Master file button*/
			public boolean clickMasterFileButton(){
			    objWrapperFunctions.click(btnMasterFileButton);
				return objWrapperFunctions.click(btnMasterFileButton);

			}

			/** click Room Type button*/
			public boolean clickRoomTypeButton(){
			    objWrapperFunctions.click(btnRoomButton);
				return objWrapperFunctions.click(btnRoomButton);

			}

			/** click Add Room Type button*/
			public boolean clickAddRoomTypeButton(){
			//    objWrapperFunctions.click(btnAddRoomsButton);
				return objWrapperFunctions.click(btnAddRoomsButton);

			}
			
			/** mass update*/
			public boolean clickMassUpdateButton(){
			    objWrapperFunctions.click(btnmassUpdateButton);
				return objWrapperFunctions.click(btnmassUpdateButton);

			}
			
			/** select drop down option*/
			public boolean selectDropDownvalue(String dropDownValue){
				return objWrapperFunctions.selectDropDownOption(dropPicklist, dropDownValue, "Text");
			}

			/** select subsection drop down option*/
			public boolean selectSubsectionDropDownvalue(String subsectionDropDownValue){
				return objWrapperFunctions.selectDropDownOption(subsectionDropDown, subsectionDropDownValue, "Text");
			}

			/** select room type drop down option*/
			public boolean selectRoomTypeDropDownvalue(String roomTypeDropDownValue){
				return objWrapperFunctions.selectDropDownOption(roomDropDown, roomTypeDropDownValue, "Text");
			}

			
			/** click on check box option*/
			public boolean selectcheckCheckBox(){
				objUtilities.waitForPageLoad();
				return objWrapperFunctions.click(checkCheckBox);
			}

			/** click on check box option*/
			public boolean selectupdatesupervisorcheckBox(){
				objUtilities.waitForPageLoad();
				return objWrapperFunctions.click(selectupdateSupervisorCheckBox);
			}
			
			/** click on mass check box option*/
			public boolean selectmasscheckBox(){
				objUtilities.waitForPageLoad();
				return objWrapperFunctions.click(selectMassCheckbox);
			}

			/** select drop down option1*/
			public boolean selectDropDownvalue1(String dropDownValue1){
				return objWrapperFunctions.selectDropDownOption(dropPicklist1, dropDownValue1, "Text");
			}	

			/** select drop down option1*/
			public boolean selectDropDownvalue3(String dropDownValue1){
				return objWrapperFunctions.selectDropDownOption(dropPicklist2, dropDownValue1, "Text");
			}	

			/** select drop down option1*/
			public boolean selectDropDownvalue5(String dropDownValue1){
				return objWrapperFunctions.selectDropDownOption(dropPicklist3, dropDownValue1, "Text");
			}
			
			/** select drop down option1*/
			public boolean selectDropDownvalue7(String dropDownValue1){
				return objWrapperFunctions.selectDropDownOption(dropPicklist4, dropDownValue1, "Text");
			}
			
			/** select drop down option1*/
			public boolean selectDropDownvalue9(String dropDownValue1){
				return objWrapperFunctions.selectDropDownOption(dropPicklist5, dropDownValue1, "Text");
			}

			/** select drop down option1*/
			public boolean selectDropDownvalue11(String dropDownValue1){
				return objWrapperFunctions.selectDropDownOption(dropPicklist6, dropDownValue1, "Text");
			}

			
			/** update button*/
			public boolean clickUpdateButton(){
			    //objWrapperFunctions.click(btnUpdateButton);
				return objWrapperFunctions.click(btnUpdateButton);

			}		

			/** save button*/
			public boolean clickSaveButton(){
			    //objWrapperFunctions.click(btnSaveButton);
				return objWrapperFunctions.click(btnSaveButton);

			}		

			/** delete button*/
			public boolean clickDeleteButton(){
			    //objWrapperFunctions.click(btnSaveButton);
				return objWrapperFunctions.click(btnDeleteButton);

			}		
			
			/** Click yes button*/
			public boolean clickYesButton(){
				return objWrapperFunctions.click(btnYesButton);
			}
			
			/** verify SuccessMessage*/ 
			public String verifySuccessMSG(String successMSG1){ 
			successMSG1 = objWrapperFunctions.getText(messageSuccess, "Text");
			return successMSG1;
			}
		
			/** select drop-down option2*/
			public boolean selectDropDownvalue2(String dropDownValue2){
				objUtilities.waitForPageLoad();
				return objWrapperFunctions.selectDropDownOption(dropPicklist1, dropDownValue2, "Text");
			}	

			/** select drop-down option2*/
			public boolean selectDropDownvalue4(String dropDownValue2){
				objUtilities.waitForPageLoad();
				return objWrapperFunctions.selectDropDownOption(dropPicklist2, dropDownValue2, "Text");
			}	
			
			/** select drop-down option2*/
			public boolean selectDropDownvalue6(String dropDownValue2){
				objUtilities.waitForPageLoad();
				return objWrapperFunctions.selectDropDownOption(dropPicklist3, dropDownValue2, "Text");
			}
			
			/** select drop down option1*/
			public boolean selectDropDownvalue8(String dropDownValue2){
				return objWrapperFunctions.selectDropDownOption(dropPicklist4, dropDownValue2, "Text");
			}
			
			/** select drop down option1*/
			public boolean selectDropDownvalue10(String dropDownValue2){
				return objWrapperFunctions.selectDropDownOption(dropPicklist5, dropDownValue2, "Text");
			}

			/** select drop down option1*/
			public boolean selectDropDownvalue12(String dropDownValue2){
				return objWrapperFunctions.selectDropDownOption(dropPicklist6, dropDownValue2, "Text");
			}

			
			/** Enter text*/ 
			public boolean enterText(String text){ 
				return objWrapperFunctions.setText(editBox, text);
			}

			/** Enter first text*/ 
			public boolean enterFirstText(String text1){ 
			return objWrapperFunctions.setText(editBox, text1);
			}

			/** Enter Description*/ 
			public boolean enterDescription(String text){ 
				return objWrapperFunctions.setText(descriptionBox, text);
			}

			/** Enter square feet*/ 
			public boolean enterSquareFeet(String text1){ 
			return objWrapperFunctions.setText(squareFeet, text1);
			}

}
