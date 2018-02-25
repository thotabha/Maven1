package com.Testcases;

import java.util.Map;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.Runnerclass.CucumberRunner;
import com.Screenfunctions.HRMLogin;
import com.Screenfunctions.HomePage;
import com.Screenfunctions.MyInfo;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tc_01 extends CucumberRunner
{
	
	@Given("^I want to launch ff$")
	public void i_want_to_launch_off() 
	{
		
		driver = new FirefoxDriver();	
	}

	@When("^ff is launched enter url$")
	public void enterUrl()
	{
		driver.navigate().to("http://testingmasters.com/hrm");
	}

	@Then("^maximize the browser$")
	public void maximize_the_browser() 
	{
	
		driver.manage().window().maximize();
	}

	@When("^it maximize verify the username is available$")
	public void it_maximize_verify_the_username_is_available() 
	{
		
	   
	}

	@When("^username is available enter the admin credentials$")
	public void username_is_available_enter_the_admin_credentials(Map<String,String> credentials) 
	{
		HRMLogin lgn = PageFactory.initElements(driver, HRMLogin.class);
		
		for(Map.Entry creds : credentials.entrySet())
		{
			System.out.println("userName : "+creds.getKey()+"password : "+creds.getValue());
		
			lgn.login(creds.getKey().toString(), creds.getValue().toString());
		}
		
	   
	   
	}

	@When("^verify the user is navigated to home page$")
	public void verify_the_user_is_navigated_to_home_page() 
	{
	   boolean status = HomePage.verifyHomePageTitle(driver.getTitle());
	   if(!status)
	   {
		   System.out.println("Page title is not veified");
	   }
	   	   
	}
	
	
	@When("^I navigate to my info to edit the contact details$")
	public void i_navigate_to_my_info_to_edit_the_contact_details() 
	{
		MyInfo myinf = PageFactory.initElements(driver, MyInfo.class);
		myinf.toNavigateMyInfo();
		myinf.toEditContactDetails();
		myinf.toSaveContactDetails();
		
	}

	@And("^I verify the successful message$")
	public void i_verify_the_successful_message() 
	{
	    
	}
	
	@Then("^I log out$")
	public void i_log_out()
	{
		HomePage hmpg = PageFactory.initElements(driver, HomePage.class);
		hmpg.toLogout();
	}

}
