package com.newtours.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newtours.qa.base.TestBase;

public class ItineraryPage extends TestBase{
	
	
	@FindBy(xpath="//img[@src='/images/itinerary.gif']")
	private WebElement Itnimage;
	
	public ItineraryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean itnimgDisplay()
	{
		return Itnimage.isDisplayed();
		
	}

}
