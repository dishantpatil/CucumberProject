package com.face.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.face.pageFactory.PlacementAssessmentPage;
import com.face.pageFactory.RoodlaneLoginPage;
import com.face.pageFactory.SearchPage;

import core.generic.StepBase;
import core.generic.Utilities;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
/**
 * @ScriptName    : SuiteSteps
 * @Description   : This class contains   
 * @Author: Digvijay Dusane(Aress) @Creation Date : 28 Nov 2017   @Modified Date:                    
 */
public class PlacementAssessment 
{
	// Local variables
	
	//private FoodPage objFoodPage = new FoodPage();
	private Utilities objUtilities = new Utilities();
	private RoodlaneLoginPage objRoodlaneLoginPage = new RoodlaneLoginPage();
	private SearchPage objSearchPage = new SearchPage();
	private PlacementAssessmentPage objPlacementAssessmentPage = new PlacementAssessmentPage();
	private StepBase objStepBase = new StepBase();
	
	@Then ("^Nevigate to the HCA URL$")
	public void nevigateToHCAURL()
	{
		objUtilities.waitForPageLoad();
		objStepBase.getDriver().navigate().to("https://placementuat.roodlane.co.uk/hca");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//objStepBase.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//objStepBase.getDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	}
	
	
	@Then("^Select Placement Assessment$")
	public void selectPlacementAssessment()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objPlacementAssessmentPage.selectPlacementAssessmentButton());
	}
	
	@Then("^Click on Continue button$")
	public void clickOnContinueButton()  
	{
		objUtilities.waitForPageLoad();
		objUtilities.waitFor(5000L);
		Assert.assertTrue(objPlacementAssessmentPage.clickContinueButton());
	}
	
	@Then ("^Again go to main url$")
	public void Againgotomainurl()
	{
		objUtilities.waitForPageLoad();
		objStepBase.getDriver().navigate().to("https://placementuat.roodlane.co.uk/Admin/frmPatientsAssessment.aspx");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//objStepBase.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//objStepBase.getDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	}
	
	
	
	
		
	
	
}
