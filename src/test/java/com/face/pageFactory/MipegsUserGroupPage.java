package com.face.pageFactory;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class MipegsUserGroupPage
{
	// Local variables
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();

		//Tab
		By tabUserGroup = By.xpath("//a[contains(text(), ' User Groups')]");
		
		//inputbox
		By inpGroupName = By.name("group_name");
		
		//button
		By btnAddUserGroupForm = By.id("add_user_group_form");
		By btnSaveGroup = By.id("save_group");
		By btnFormSetting = By.xpath("//div[contains(@title, 'Show settings')]");
		By btnEditSetting = By.xpath("//a[contains(@title, 'Edit')]");
		//msg
		By msgUserGroupHasBeenSaved = By.xpath("//div[contains(@class, 'messages status')]");
		
		public boolean clickUserGroupTab(){
			return objWrapperFunctions.click(tabUserGroup);	
		}
		
		public boolean enterGroupNam(String userGroupName){
			return objWrapperFunctions.setText(inpGroupName, userGroupName);			
		}
		
		public boolean clickAddUserGroupForm(){
			return objWrapperFunctions.click(btnAddUserGroupForm);	
		}
		
		public boolean verifyUserGroupHasBeenSaved(){
			return objWrapperFunctions.checkElementExistence(msgUserGroupHasBeenSaved, 3);	
		}
		
		public boolean clickSaveGroup(){
			return objWrapperFunctions.click(btnSaveGroup);	
		}
		
}
