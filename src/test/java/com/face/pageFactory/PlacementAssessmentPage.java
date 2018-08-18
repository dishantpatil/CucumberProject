package com.face.pageFactory;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;

import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class PlacementAssessmentPage
{
	// Local variables
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();

		//radioBox
		By radioPlacementAssessment = By.id("rdb_PEA");	
		
		//button
		By btnContinue = By.name("btnContinue");		
						
		/** Select Placement Assessment radio button*/
		public boolean selectPlacementAssessmentButton(){
			return objWrapperFunctions.selectRadioButton(radioPlacementAssessment, true);
		}
		
		/** Click Continue button*/
		public boolean clickContinueButton(){
			return objWrapperFunctions.click(btnContinue);
		}
		
		
		
		
		
		
		
		
}
