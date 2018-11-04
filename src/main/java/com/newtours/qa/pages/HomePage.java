package com.newtours.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newtours.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//font[contains(text(),'Use our Flight Finder')]")
	private WebElement text;
	
	@FindBy(xpath="//a[contains(text(),'SIGN-OFF')]")
	private WebElement Signoffbutton;
	
	@FindBy(xpath="//a[contains(text(),'ITINERARY')]")
	private WebElement Itinerarybutton;
	
	@FindBy(xpath="//a[contains(text(),'PROFILE')]")
	private WebElement Profilebutton;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement FnameTextButton;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle()
	{
		
		return driver.getTitle();
		
	}
	
	public SignOnPage clickOnSignoff()
	{
		Signoffbutton.click();
		return new SignOnPage();
	}
	
	
	public ItineraryPage clickOnItinerary()
	{
		Itinerarybutton.click();
		return new ItineraryPage();
	}
	
	public ProfilePage clickOnProfile()
	{
		Profilebutton.click();
		
		return new ProfilePage();
	}
	
	public boolean fnameButton()
	{
		return FnameTextButton.isDisplayed();
	}
}

