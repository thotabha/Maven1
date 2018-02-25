package com.Runnerclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = "Features",
		glue = {"com.Testcases"},
		monochrome = true				
	)

public class CucumberRunner extends AbstractTestNGCucumberTests

{

		public static WebDriver driver;
		
		public static void waitForElement(WebElement element) 
		{
			for(int iterator = 1;iterator<=15;iterator++)
			{
				try
				{
					Actions act = new Actions(driver);
					act.moveToElement(element).build().perform();
					break;
				}
				catch(Exception e)
				{
					try
					{
						Thread.sleep(1000);
					}
					catch(Exception ex)
					{
						
					}
					
				}
			}
		}
		
		public static void scrollToElement(WebElement element)
		{
			JavascriptExecutor jspexe = (JavascriptExecutor)driver;
			jspexe.executeScript("arguments[0].scrollIntoView(true);", element);
			
		}
		
}

