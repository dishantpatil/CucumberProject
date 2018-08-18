package com.face.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.face.pageFactory.MipegsFormManagerPage;
import com.face.pageFactory.MipegsLoginPage;
import com.face.pageFactory.MipegsSubmitFormPage;

import core.generic.StepBase;
import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
/**
 * @ScriptName    : SuiteSteps
 * @Description   : This class contains   
 * @Author: Digvijay Dusane(Aress) @Creation Date : 10 Jan 2018   @Modified Date:                    
 */
public class MipegsSubmitForm 
{
	// Local variables
	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private MipegsLoginPage objMipegsLoginPage = new MipegsLoginPage();
	private MipegsSubmitFormPage objMipegsSubmitFormPage = new MipegsSubmitFormPage();
	private StepBase objStepBase = new StepBase();
	private MipegsFormManagerPage objMipegsFormManagerPage = new MipegsFormManagerPage();
	
	@Then ("^Navigate to form URL$")
	public void nevigateToFormUrl()
	{
		/*objUtilities.waitForPageLoad();
		objStepBase.getDriver().navigate().to("https://portal-dev.mipegs.co.uk/webforms/NDM3Mw==");
		*/
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsFormManagerPage.verifyNewFormURLGenrated());
		System.out.println(objMipegsFormManagerPage.getNewFormURL());
		String NewFormURL = objMipegsFormManagerPage.getNewFormURL();
		objStepBase.getDriver().navigate().to(NewFormURL);
		
	}
	
	@Then ("^Verify lable$")
	public void verifyLable()
	{
		objUtilities.waitForPageLoad();
		System.out.println("********** Before verification");
		objMipegsSubmitFormPage.verifyLable();
		System.out.println("********** After verification");
		objMipegsSubmitFormPage.clickLogout();
	}
	
	
	@Then("^Enter Mipegs Name (.*)$")
	public void enterName(String name)  
	{
		//objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsSubmitFormPage.setName(name));
	}

	@Then("^Enter Mipegs Phone Number (.*)$")
	public void enterPhoneNumber(String phonenumber)  
	{
		//objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsSubmitFormPage.setPhoneNumber(phonenumber));
	}
	
	@Then("^Enter Mipegs Salary (.*)$")
	public void enterSalary(String salary)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsSubmitFormPage.setSalary(salary));
	}	
	
	@Then ("^Select Time$")
	public void selectTime()
	
	{
		objMipegsSubmitFormPage.selectTime();
	}
	
	@Then ("^Select Date$")
	public void selectDate()
	{
		objUtilities.waitForPageLoad();
		objMipegsSubmitFormPage.selectTodaysDate();
	}
	
	@Then("^Set Percentage (.*)$")
	public void enterPercentage(String Percentage)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsSubmitFormPage.setPercentage(Percentage));
	}
	
	@Then("^Set Address (.*)$")
	public void enterAddress(String address)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsSubmitFormPage.setAddress(address));
	}
	
	@Then ("^Select CheckBox$")
	public void selectCheckBox()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsSubmitFormPage.selectCheckbox());		
	}
	
	@Then ("^Select RadioButton$")
	public void selectRadioButton()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsSubmitFormPage.selectRadiobox());		
	}
	
	@Then("^Select Dropdown Value (.*)$")
	public void selectDropdownValue(String dropDownValue)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsSubmitFormPage.selectDropDownvalue(dropDownValue));
	}
	
	@Then("^Upload Photo (.*)$")
	public void uploadPhoto(String filePath)  
	{
		objUtilities.waitForPageLoad();
		objMipegsSubmitFormPage.uploadPhoto(filePath);
	}
	
	@Then ("^Click on Sign$")
	public void clickOnSign()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsSubmitFormPage.clickLabSign());		
	}
	
	@Then ("^Select Type Signature$")
	public void clickTypeSignature()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsSubmitFormPage.selectTypeSignature());		
	}
	
	@Then("^Enter Your Full Name (.*)$")
	public void enterYourFullName(String enterFullName)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsSubmitFormPage.setEnterYourFullName(enterFullName));
	}
	
	@Then("^Select Style (.*)$")
	public void selectStyle(String selectStyle)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsSubmitFormPage.selectStyle(selectStyle));
	}
	
	@Then ("^Click Sign Next Button$")
	public void clickSignNextButton()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsSubmitFormPage.clickSignNextButton());		
	}
	
	@Then("^Enter Full Name (.*)$")
	public void enterFullName(String signFullName)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsSubmitFormPage.enterfullName(signFullName));
	}
	
	@Then ("^Click Save Name button$")
	public void clickSaveNamebutton()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsSubmitFormPage.clickSaveName());		
	}
	
	@Then ("^Click Submit button$")
	public void clickSubmitButton()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsSubmitFormPage.clickSubmitButton());		
	}
	
	@Then ("^Verify form submitted Successfully$")
	public void verifyFormSubmittedSuccessfully()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsSubmitFormPage.verifyFormSubmittedSuccessfully());		
	}
	
}
