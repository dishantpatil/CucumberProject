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
 * @Author: Digvijay Dusane(Aress) @Creation Date : 11 Jan 2018   @Modified Date:                    
 */
public class MipegsFormManager 
{
	// Local variables
	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private MipegsLoginPage objMipegsLoginPage = new MipegsLoginPage();
	private MipegsSubmitFormPage objMipegsSubmitFormPage = new MipegsSubmitFormPage();
	private StepBase objStepBase = new StepBase();
	private MipegsFormManagerPage objMipegsFormManagerPage = new MipegsFormManagerPage();
	
	@Then ("^Click on  Form Manager$")
	public void clickOnFormManager()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsFormManagerPage.clickFormManagerTab());
	}
	
	@Then("^Enter Form Name (.*)$")
	public void enterFormName(String formName)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsFormManagerPage.setFormName(formName));
	}
	
	@Then ("^Click on Show button$")
	public void clickOnShowButton()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsFormManagerPage.clickShowButton());
	}
	
	@Then ("^Click on Setting button$")
	public void clickOnSettingButton()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsFormManagerPage.clickFormSettingButton());
	}
	
	@Then ("^Click on Clone button$")
	public void clickOnCloneButton()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsFormManagerPage.clickCloneFormButton());
	}
	
	@Then("^Enter Number of Clones (.*)$")
	public void enterNumberOfClones(String numberOfClone)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsFormManagerPage.setNumberOfClone(numberOfClone));
	}
	
	@Then ("^Click on Standard Clone button$")
	public void clickOnStandardCloneButton()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsFormManagerPage.clickStandardCloneButton());
	}
	
	@Then ("^verify form cloned successfully$")
	public void verifyFormClonedSuccessfully()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsFormManagerPage.verifyTheFormHasNowBeenClonedSuccessfully());
	}
	
	@Then ("^Click On Edit button$")
	public void clickOnEditButton()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsFormManagerPage.clickEditSettingButton());
	}
	
	@Then("^Enter Custom Form Name (.*)$")
	public void enterCustomFormName(String customFormName)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsFormManagerPage.setCustomFormName(customFormName));
	}
	
	@Then ("^Click on Publish Now button$")
	public void clickOnPublishNowButton()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsFormManagerPage.clickPublishNowButton());
	}
	
	@Then ("^Verify Published successfully message displayed$")
	public void verifyPublishedSuccessfullyMessageDisplayed()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsFormManagerPage.verifyTheFormIsPublishedSuccessfull());
	}
	
	@Then ("^verify New Form URL genrated$")
	public void verifyNewFormURLGenrated()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsFormManagerPage.verifyNewFormURLGenrated());
	}
	
	@Then("^Click on Save button$")
	public void ClickOnSaveBbutton() {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsFormManagerPage.clickCustomFormSaveButton());
	
	}

	@Then("^Verify New Form URL genrated$")
	public void VerifyNewFormURLGenrated() {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsFormManagerPage.verifyNewFormURLGenrated());
		System.out.println(objMipegsFormManagerPage.getNewFormURL());
	
	}
	
	
}
