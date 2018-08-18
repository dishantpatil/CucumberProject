package com.face.pageFactory;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;

import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class MipegsLoginPage
{
	// Local variables
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();

	    //inputbox
		By inpUserName = By.id("edit-name");
		By inpUserPassword = By.id("edit-pass");
		
		//button
		By btnLogin = By.id("edit-submit");
		By btnCreateNewAccount = By.xpath("//a[contains(@text, 'Create new account']");
		By btnRequestNewPassword = By.xpath("//a[contains(@text, 'Request new password']");
		By btnLogout = By.xpath("//*[@id=\"navigation\"]/div/a");
		
		   
		/** Set Roodlane email address
		 * @return */
		public boolean setUserName(String userName){
			return objWrapperFunctions.setText(inpUserName, userName);
			
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
