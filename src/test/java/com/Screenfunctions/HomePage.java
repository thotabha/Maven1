package com.Screenfunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Runnerclass.CucumberRunner;

public class HomePage extends CucumberRunner
{
	@FindBy(how=How.ID,using = "welcome")
	public static WebElement Lnk_welcome;
	
	@FindBy(how=How.XPATH,using = "//a[text()='Logout']")
	public static WebElement Lnk_logout;
	

	public static boolean verifyHomePageTitle(String title)
	{
		
		boolean check = true;
		String homeTitle = "OrangeHRM";
		if(!homeTitle.contentEquals(title))
		{
			check = false;
		}
		
		return check;
	}
	
	public static void toLogout() 
	{
		waitForElement(Lnk_welcome);
		Lnk_welcome.click();
		
		
		waitForElement(Lnk_logout);
		Lnk_logout.click();
		
	}
}
