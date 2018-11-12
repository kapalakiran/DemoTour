package com.newtours.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newtours.qa.base.TestBase;

public class ProfilePage extends TestBase{
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement fn;
	
	public ProfilePage()
	{
		PageFactory.initElements(driver, this);
		//PageFactory.initElements(driver, ProfilePage.class);
	}
	
	public boolean profilepageCheck()
	{
		return fn.isDisplayed();
	}

}
