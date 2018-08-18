package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.MipegsLoginPage;

import core.generic.Utilities;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
/**
 * @ScriptName    : SuiteSteps
 * @Description   : This class contains   
 * @Author: Digvijay Dusane(Aress) @Creation Date : 08 Jan 2018   @Modified Date:                    
 */
public class Mipegs 
{
	// Local variables
	
	private Utilities objUtilities = new Utilities();
	//private RoodlaneLoginPage objRoodlaneLoginPage = new RoodlaneLoginPage();
	private MipegsLoginPage objMipegsLoginPage = new MipegsLoginPage();
	
	@Given("^Enter Mipegs User Name (.*)$")
	public void enterUserName(String userName)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsLoginPage.setUserName(userName));
		
	}

	@Then("^Enter Mipegs Password (.*)$")
	public void enterPassword(String password)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsLoginPage.setUserPassword(password));
	}
	
	@Then("^Click on Mipegs Login button$")
	public void clickOnLoginButton()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsLoginPage.clickLoginButton());
	}
	
	@Then("^Verify Mipegs Logout button displayed$")
	public void verifyLogoutButtonDisplayed()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objMipegsLoginPage.verifyHomePageDisplayed());
	}
	
	
	
		
	
	
}
