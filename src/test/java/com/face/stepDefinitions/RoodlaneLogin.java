package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.RoodlaneLoginPage;

import core.generic.Utilities;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
/**
 * @ScriptName    : SuiteSteps
 * @Description   : This class contains   
 * @Author: Digvijay Dusane(Aress) @Creation Date : 28 Nov 2017   @Modified Date:                    
 */
public class RoodlaneLogin 
{
	// Local variables
	
	//private FoodPage objFoodPage = new FoodPage();
	private Utilities objUtilities = new Utilities();
	private RoodlaneLoginPage objRoodlaneLoginPage = new RoodlaneLoginPage();

	@Given("^Enter User Name (.*)$")
	public void enterUserName(String email)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objRoodlaneLoginPage.setUserName(email));
	}

	@Then("^Enter Password (.*)$")
	public void enterPassword(String password)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objRoodlaneLoginPage.setUserPassword(password));
	}
	
	@Then("^Click on Login button$")
	public void clickOnLoginButton()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objRoodlaneLoginPage.clickLoginButton());
	}
	
	@Then("^Verify Logout button displayed$")
	public void verifyLogoutButtonDisplayed()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objRoodlaneLoginPage.verifyHomePageDisplayed());
	}
	
	
	
		
	
	
}
