package com.newtours.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newtours.qa.base.TestBase;

public class SignOnPage extends TestBase{

	@FindBy(xpath="//img[@src='/images/masts/mast_signon.gif']")
	private WebElement signonimg;

	public SignOnPage()
	{
		PageFactory.initElements(driver, this);
	}


	public boolean checkSignOnImg()
	{
		return signonimg.isDisplayed();

	}
}
