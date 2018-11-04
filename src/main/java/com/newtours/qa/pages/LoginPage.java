package com.newtours.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newtours.qa.base.TestBase;

public class LoginPage extends TestBase
{

	@FindBy(xpath="//input[@name='userName']")
	private WebElement uname;

	@FindBy(xpath="//input[@name='password']")
	private WebElement pwd;

	@FindBy(xpath="//input[@name='login']")
	private WebElement logbuton;


     public LoginPage()
      {

      PageFactory.initElements(driver, this);
      }
     
     public HomePage loggingin(String un,String pw)
     {
    	 uname.sendKeys(un);
    	 pwd.sendKeys(pw);
    	 logbuton.click();
    	 return new HomePage();
     }
     
     public String validateTabName()
     {
		return driver.getTitle();
    	 
     }
}

