package com.newtours.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOnPage {

	@FindBy(xpath="//img[@src='/images/masts/mast_signon.gif']")
	private WebElement signonimg;
	
	public boolean checkSignOnImg()
	{
		return signonimg.isDisplayed();
		
	}
}
