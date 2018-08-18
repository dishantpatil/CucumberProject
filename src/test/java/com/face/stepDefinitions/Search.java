package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.RoodlaneLoginPage;
import com.face.pageFactory.SearchPage;

import core.generic.Utilities;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
/**
 * @ScriptName    : SuiteSteps
 * @Description   : This class contains   
 * @Author: Digvijay Dusane(Aress) @Creation Date : 28 Nov 2017   @Modified Date:                    
 */
public class Search 
{
	// Local variables
	
	//private FoodPage objFoodPage = new FoodPage();
	private Utilities objUtilities = new Utilities();
	private RoodlaneLoginPage objRoodlaneLoginPage = new RoodlaneLoginPage();
	private SearchPage objSearchPage = new SearchPage();

	@Then("^Enter First Name (.*)$")
	public void enterFirstName(String FirstName)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSearchPage.enterFirstName(FirstName));
	}
	
	@Then("^Click on Search button$")
	public void clickOnSearchButton()  
	{
		objUtilities.waitForPageLoad();
		objUtilities.waitFor(5000L);
		Assert.assertTrue(objSearchPage.clickSearchButton());
	}
	
	@Then("^Verify Same user is displayed in search result$")
	public void verifySameUserDisplayedInSearchResult()  
	{
		objUtilities.waitForPageLoad();
		objUtilities.waitFor(5000L);
		Assert.assertTrue(objSearchPage.verifySameUserIsDisplayedInSearchResult());
	}
	
	
		
	
	
}
