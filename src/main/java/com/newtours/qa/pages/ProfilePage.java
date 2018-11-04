package com.newtours.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement fn;
	
	public boolean profilepageCheck()
	{
		return fn.isDisplayed();
	}

}
