package com.face.pageFactory;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;

import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class RoodlaneLoginPage
{
	// Local variables
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();

	//inputbox
		By inpUserName = By.name("txtUser");
		By inpUserPassword = By.name("txtPassword");
		
		//button
		By btnLogin = By.name("btnLogin");
		By btnReset = By.xpath("//input[contains(@value, 'Reset']");
		By btnLogout = By.id("ctl00_btnLogout");
		
		// Links
		By lnkForgotPassword = By.id("LinkButton1");
		
		
   
		/** Set Roodlane email address
		 * @return */
		public boolean setUserName(String email){
			return objWrapperFunctions.setText(inpUserName, email);			
		}
		
		/** Set Roodlane password*/
		public boolean setUserPassword(String password){
			return objWrapperFunctions.setText(inpUserPassword, password);
		}
		
		/** Click Login button*/
		public boolean clickLoginButton(){
			return objWrapperFunctions.click(btnLogin);
		}
		
		public boolean verifyHomePageDisplayed(){
			return objWrapperFunctions.checkElementExistence(btnLogout, 10);
			
		}
		
		
		
		
		
		
		
		
}
