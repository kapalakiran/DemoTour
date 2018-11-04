package com.newtours.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.newtours.qa.base.TestBase;
import com.newtours.qa.pages.HomePage;
import com.newtours.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage lp;
	HomePage hm;
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialzation();
		lp = new LoginPage();
		
	}
	
	@Test(priority=1)
	public void loginpagetitleTest()
	{
		String tabname = lp.validateTabName();
		Assert.assertEquals(tabname,"Welcome: Mercury Tours");	
	}
	
	@Test(priority=2)
	public void logincrendialTest()
	{
		hm = lp.loggingin(prop.getProperty("uid"), prop.getProperty("pwd"));
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
