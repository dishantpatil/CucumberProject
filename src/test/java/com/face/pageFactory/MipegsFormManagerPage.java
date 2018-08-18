package com.face.pageFactory;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class MipegsFormManagerPage
{
	// Local variables
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();

		//Tab
		By tabFormManager = By.xpath("//*[@id=\"form_management\"]/a");
		
		//URL
		By UrlFormURL = By.xpath("//div[starts-with(@id, 'pub_web_url')]");
	
	    //inputbox
		By inpFormName = By.name("form_name");
		By inpNumberOfClone = By.name("noOfClone");
		By inpCustomFormName = By.xpath("//input[contains(@name, 'name')]");
				
		//button
		By btnShow = By.id("edit-submit");
		By btnFormSetting = By.xpath("//div[contains(@title, 'Show form settings')]");
		By btnCloneForm = By.xpath("//a[contains(@title, 'Clone Form')]");
		By btnStandardClone	= By.xpath("//input[contains(@value, 'Standard Clone')]");
		By btnEditSetting = By.xpath("//a[contains(@title, 'Edit')]");
		By btnCustomFormSave = By.xpath("//input[contains(@value, 'Save')]");
		By btnPublishNow = By.xpath("//a[contains(@title, 'Publish Now')]");
		
		//msg
		By msgFormSubmittedSuccessfully = By.xpath("//div[@class = 'messages success']");
		By msgTheFormIsPublishedSuccessfully = By.xpath("//div[@class = 'messages success']");
		By msgTheFormHasNowBeenClonedSuccessfully = By.xpath("//div[@class = 'messages success']");
		
		public boolean setFormName(String formName){
			return objWrapperFunctions.setText(inpFormName, formName);			
		}
		
		public boolean setNumberOfClone(String numberOfClone){
			return objWrapperFunctions.setText(inpNumberOfClone, numberOfClone);			
		}
		
		public boolean setCustomFormName(String customFormName){
			return objWrapperFunctions.setText(inpCustomFormName, customFormName);			
		}
		
		public boolean clickFormManagerTab(){
			return objWrapperFunctions.click(tabFormManager);			
		}
		
		public boolean clickShowButton(){
			return objWrapperFunctions.click(btnShow);			
		}
		
		public boolean clickFormSettingButton(){
			return objWrapperFunctions.click(btnFormSetting);			
		}
		
		public boolean clickCloneFormButton(){
			return objWrapperFunctions.click(btnCloneForm);			
		}
		
		public boolean clickStandardCloneButton(){
			return objWrapperFunctions.click(btnStandardClone);			
		}
		
		public boolean clickEditSettingButton(){
			return objWrapperFunctions.click(btnEditSetting);			
		}
		
		public boolean clickCustomFormSaveButton(){
			return objWrapperFunctions.click(btnCustomFormSave);			
		}
		
		public boolean clickPublishNowButton(){
			return objWrapperFunctions.click(btnPublishNow);			
		}
		
		public boolean verifyTheFormIsPublishedSuccessfull(){
			return objWrapperFunctions.checkElementExistence(msgTheFormIsPublishedSuccessfully, 10);			
		}
		
		public String grtNewURLOfForm(){
			return objWrapperFunctions.getText(UrlFormURL, "text");			
		}
		
		public boolean verifyTheFormHasNowBeenClonedSuccessfully(){
			return objWrapperFunctions.checkElementExistence(msgTheFormHasNowBeenClonedSuccessfully, 10);			
		}
		
		public boolean verifyNewFormURLGenrated(){
			return objWrapperFunctions.checkElementExistence(UrlFormURL, 10);			
		}
		
		public String getNewFormURL(){
			return objWrapperFunctions.getText(UrlFormURL, "text");
			
		}
		
		
		
		
		
		
}
