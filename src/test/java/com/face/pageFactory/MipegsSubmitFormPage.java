package com.face.pageFactory;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class MipegsSubmitFormPage
{
	// Local variables
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();

	    //inputbox
		By inpUserName = By.id("edit-name");
		By inpUserPassword = By.id("edit-pass");
		By inpName = By.xpath("//input[contains(@fieldname, 'Name:')]");
		By inpPhoneNumber = By.xpath("//input[contains(@fieldname, 'Phone Number:')]");
		By inpSalary = By.xpath("//input[contains(@fieldname, 'Salary')]");
		By inpDateOfJoining = By.xpath("//input[contains(@fieldname, 'Date of joining')]");
		By inpTime = By.xpath("//input[contains(@fieldname, 'Time')]");
		By inpPercentage = By.xpath("//input[contains(@fieldname, 'Percentage')]");
		By inpAddress = By.xpath("//textarea[contains(@fieldname, 'Address')]");
		By inpPhoto = By.xpath("//input[contains(@fieldname, 'Photo')]");
		By inpEnterYourFullName = By.id("signame");
		By inpSignEnterYourFullName = By.id("txt_type_sign");
		By inpSignBox = By.id("type_sign");
		
		//image
		By imageSign = By.xpath("//*[@id=\"sign_img\"]/img");
		
		//CheckBox
		By checkCheckBox = By.xpath("//input[contains(@value, 'Check box:')]");
		
		//Radio button
		By radioRadioButton = By.xpath("//input[contains(@value, 'Radio Button')]");
		By radioTypeSignature = By.id("rad_type_sign");
		
		//DropDown
		By dropPicklist = By.xpath("//select[contains(@fieldname, 'picklist')]");
		By dropSelectFont = By.id("opt_sign_style");
		
		//button
		By btnSubmit = By.id("web_submit");
		By btnLogin = By.id("edit-submit");
		By btnCreateNewAccount = By.xpath("//a[contains(@text, 'Create new account')]");
		By btnRequestNewPassword = By.xpath("//a[contains(@text, 'Request new password')]");
		By btnLogout = By.xpath("//*[@id=\"navigation\"]/div/a");
		By btnTodaysDate = By.xpath("//a[@class ='ui-state-default ui-state-highlight']");
		By btnSignNext = By.id("next_signature");
		By btnSaveName = By.xpath("//button[contains(text(), 'Save Name')]");
		
		//Lable
		By Lab = By.xpath("//*[@id=\"admin-header\"]/h1");
		By LabSign = By.className("pad");
		
		//Scrollbar
		By scrollHour = By.xpath("//*[@id='ui-datepicker-div']/div[2]/dl/dd[2]/div/span");
		By scrollMin = By.xpath("//*[@id='ui-datepicker-div']/div[2]/dl/dd[3]/div/span']");
		
		//msg
		By msgFormSubmittedSuccessfully = By.xpath("//div[@class = 'messages success']");
		
		public boolean setName(String Name){
			objWrapperFunctions.waitForElementPresence(inpName, 5000);
			return objWrapperFunctions.setText(inpName, Name);			
		}
		
		public boolean setPhoneNumber(String phonenumber){
			return objWrapperFunctions.setText(inpPhoneNumber, phonenumber);			
		}
		
		public boolean setSalary(String Salary){
			return objWrapperFunctions.setText(inpSalary, Salary);			
		}
		
		public boolean verifyLable(){
			objWrapperFunctions.getText(Lab, "value");
			return objWrapperFunctions.checkElementExistence(Lab, 10);
		}
		
		public boolean clickLogout(){
			objWrapperFunctions.getText(btnLogout, "value");
			return objWrapperFunctions.checkElementExistence(btnLogout, 10);
		}
		
		public boolean selectTime() {
			objWrapperFunctions.checkElementExistence(inpTime, 10);
			try {
				objWrapperFunctions.selectTime();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;					
		}
		
		public boolean selectTodaysDate(){			 
			return objWrapperFunctions.sendKeyBoardKeys(inpDateOfJoining, "enter", 10);
		}
				
		public boolean setPercentage(String Percentage){
			return objWrapperFunctions.setText(inpPercentage, Percentage);			
		}
		
		public boolean setAddress(String address){
			return objWrapperFunctions.setText(inpAddress, address);			
		}
		
		public boolean selectCheckbox(){
			return objWrapperFunctions.selectCheckBox(checkCheckBox, true);
		}
		
		public boolean selectRadiobox(){
			return objWrapperFunctions.selectRadioButton(radioRadioButton, true);
		}
		
		public boolean selectDropDownvalue(String dropDownValue){
			return objWrapperFunctions.selectDropDownOption(dropPicklist, dropDownValue, "Value");
		}
		
		public boolean uploadPhoto(String filePath){
			objWrapperFunctions.uploadPhoto(inpPhoto, filePath);
			return false;
		}
		
		public boolean clickLabSign(){
			return objWrapperFunctions.click(LabSign);			
		}
		
		public boolean selectTypeSignature(){
			return objWrapperFunctions.selectRadioButton(radioTypeSignature, true);			
		}
		
		public boolean setEnterYourFullName(String enterFullName){
			return objWrapperFunctions.setText(inpSignEnterYourFullName, enterFullName);			
		}
		
		public boolean selectStyle(String selectStyle){
			return objWrapperFunctions.selectDropDownOption(dropSelectFont, selectStyle, "Value");			
		}
		
		public boolean clickSignNextButton(){
			objWrapperFunctions.waitForElementPresence(imageSign, 10);
			return objWrapperFunctions.click(btnSignNext);			
		}
		
		public boolean enterfullName(String signFullName){
			return objWrapperFunctions.setText(inpEnterYourFullName, signFullName);			
		}
		
		public boolean clickSaveName(){
			return objWrapperFunctions.click(btnSaveName);			
		}
		
		public boolean clickSubmitButton(){
			return objWrapperFunctions.click(btnSubmit);			
		}
		
		public boolean verifyFormSubmittedSuccessfully(){
			return objWrapperFunctions.checkElementExistence(msgFormSubmittedSuccessfully, 10);			
		}
	
		
		
		
}
