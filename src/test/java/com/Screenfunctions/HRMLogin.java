package com.Screenfunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Runnerclass.CucumberRunner;

public class HRMLogin extends CucumberRunner 
{
	
	@FindBy(how=How.ID,using = "txtUsername")
	public static WebElement Edi_UserName;
	
	@FindBy(how=How.NAME,using = "txtPassword")
	public static WebElement Edi_Password;
	
	@FindBy(how=How.XPATH,using = "//input[@id='btnLogin']")
	public static WebElement Btn_Login;

	
	public static boolean login(String userName,String password)
	{
		boolean status = true;
		
		try
		{
			Edi_UserName.sendKeys(userName);
			
		}catch(Exception e)
		{
			status = false;
			System.out.println("UserName field is not available");
		}
		
		if(status)
		{
			try
			{
				Edi_Password.sendKeys(password);
			}
			catch(Exception e)
			{
				status = false;
				System.out.println("Password field is not available");
			}
		}
		
		if(status)
		{
			try
			{
				
				Btn_Login.click();
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				status = false;
				System.out.println("Login Button field is not available");
			}
			
			
		}
		
		
		return status;
	}
	

}
