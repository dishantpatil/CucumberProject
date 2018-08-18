package com.face.stepDefinitions;

import org.apache.poi.ss.formula.ThreeDEval;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import com.face.pageFactory.MipegsFormManagerPage;
import com.face.pageFactory.MipegsLoginPage;
import com.face.pageFactory.MipegsSubmitFormPage;
import com.face.pageFactory.MipegsUserGroupPage;
import com.face.pageFactory.MipegsUserManagerPage;

import core.generic.StepBase;
import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
/**
 * @ScriptName    : SuiteSteps
 * @Description   : This class contains   
 * @Author: Digvijay Dusane(Aress) @Creation Date : 17 Jan 2018   @Modified Date:                    
 */
public class MipegsUserGroup 
{
	// Local variables
	private Utilities objUtilities = new Utilities();
	private MipegsUserManagerPage objMipegsUserManagerPage = new MipegsUserManagerPage();
	private MipegsUserGroupPage objMipegsUserGroupPage = new MipegsUserGroupPage();
	
	@Then ("^Click on User Group$")
	public void clickOnUserGroup()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserGroupPage.clickUserGroupTab());
	}
	
	@Then ("^Click on Add User Group Button$")
	public void clickOnAddUserGroup()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserGroupPage.clickAddUserGroupForm());
	}
	
	@Then("^Enter User Group Name (.*)$")
	public void enterUserGroupName(String userGroupName)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserGroupPage.enterGroupNam(userGroupName));
	}
	
	@Then ("^Click on Save Group Button$")
	public void clickOnSaveGroupButton()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserGroupPage.clickSaveGroup());
	}
	
	@Then ("^Verify New Group has been Saved$")
	public void verifyNewGroupHasBeenSaved()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsUserGroupPage.verifyUserGroupHasBeenSaved());
	}
	
}
