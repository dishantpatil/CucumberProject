package com.face.pageFactory;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;

import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class SearchPage
{
	// Local variables
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();

	//inputbox
	    
		By inpFirstName = By.name("ctl00$MiddlePanel$txtFirstName");
		
		//button
		By btnManageCompany = By.xpath("//td[contains(text(),'Manage Company')]");
		
		By btnSearch = By.name("ctl00$MiddlePanel$btnSearch");
	
		//SearchResult
		By ResFirstName = By.xpath("//*[@id=\"ctl00_MiddlePanel_tr0\"]/td[contains(text(),'User15')]");
	   
				
		/**Enter First Name */
		public boolean enterFirstName(String FirstName) {
			return objWrapperFunctions.setText(inpFirstName, FirstName);
		}
		
		/** Click Search button*/
		public boolean clickSearchButton(){
			return objWrapperFunctions.click(btnSearch);
		}
		
		/**Verify same user is displayed in search result*/
		public boolean verifySameUserIsDisplayedInSearchResult(){
			String UserName = objWrapperFunctions.getText(ResFirstName, "text");
			System.out.println(UserName);
			return objWrapperFunctions.checkElementExistence(ResFirstName, 10);
		}
		
		
		
		
		
		
		
		
}
