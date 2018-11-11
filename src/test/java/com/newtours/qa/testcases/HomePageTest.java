package com.newtours.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.newtours.qa.base.TestBase;
import com.newtours.qa.pages.HomePage;
import com.newtours.qa.pages.ItineraryPage;
import com.newtours.qa.pages.LoginPage;
import com.newtours.qa.pages.ProfilePage;
import com.newtours.qa.pages.SignOnPage;

public class HomePageTest extends TestBase{
	LoginPage lp;
	HomePage hmp;
	ItineraryPage Itn;
	ProfilePage pp;
	SignOnPage sop;
	public HomePageTest()
	{
		super();
	}
	
	
    @BeforeMethod
    public void setUp()
    {
    	initialzation();
    	lp = new LoginPage();
    	hmp = lp.loggingin(prop.getProperty("uid"), prop.getProperty("pwd"));
    	
    }
    
    @Test(priority=1)
    public void checkTabnameTest()
    {
    	String title = hmp.verifyHomePageTitle();
    	Assert.assertEquals(title , "Find a Flight: Mercury Tours:" ,"Tab Name are not matched");
    }
    
    @Test(priority=2)
    public void itineraryTest()
    {
    	hmp.clickOnItinerary();
    	//Assert.assertTrue
      	//Assert.assertTrue(Itn.itnimgDisplay());
    	//boolean imgdisp = Itn.itnimgDisplay();
    	//Assert.assertEquals(imgdisp, 1);
    }
    
    @Test(priority=3)
    public void profilePageTest()
    {
    	hmp.clickOnProfile();
    	//Assert.assertTrue(pp.profilepageCheck());
    	//boolean profpge = pp.profilepageCheck();
    	//Assert.assertEquals(profpge, 1);
    }
    
    @Test(priority=4)
    public void signOnPageTest()
    {
    	hmp.clickOnSignoff();
    	//Assert.assertTrue(sop.checkSignOnImg());
    	//boolean signingoff = sop.checkSignOnImg();
    	//Assert.assertEquals(signingoff, 1);
    }
    @AfterMethod
    public void tearDown()
    {
    	driver.quit();
    }
}
