package com.Screenfunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Runnerclass.CucumberRunner;

public class MyInfo extends CucumberRunner 
{

	@FindBy(how=How.XPATH,using = "//div[@class = 'menu']/ul/li[3]/a")
	public static WebElement Lnk_myinfo;
	
	@FindBy(how = How.XPATH,using = "//ul[@id = 'sidenav']/li[2]/a")
	public static WebElement Lnk_contactdetails;
	
	@FindBy(how = How.XPATH,using = "//a[text()='Emergency Contacts']")
	public static WebElement Lnk_emergencycontacts;
	
	@FindBy(how=How.XPATH,using = "//input[@value='Edit']")
	public static WebElement Btn_edit;
	
	@FindBy(how=How.XPATH,using = "//input[@value='Save']")
	public static WebElement Btn_save;
	
	@FindBy(how = How.ID,using = "contact_street1")
	public static WebElement Edi_street1;
	
	@FindBy(how = How.ID,using = "contact_street2")
	public static WebElement Edi_street2;
	
	@FindBy(how = How.ID,using = "contact_city")
	public static WebElement Edi_city;
	
	@FindBy(how = How.ID,using = "contact_province")
	public static WebElement Edi_povince;
	
	@FindBy(how = How.ID,using = "contact_emp_zipcode")
	public static WebElement Edi_zipcode;
	
	
	
	
	
	public static void toNavigateMyInfo()
	{
		
			waitForElement(Lnk_myinfo);
			Lnk_myinfo.click();
		
	}
	
	public static void toEditContactDetails()
	{
		waitForElement(Lnk_contactdetails);
		Lnk_contactdetails.click();
		
		//scrollToElement(Btn_edit);
		waitForElement(Btn_edit);
		Btn_edit.click();
		
		Edi_street1.clear();
		Edi_street1.sendKeys("1-200");
		
		Edi_street2.clear();
		Edi_street2.sendKeys("Opposite to Shilparamam");
		
		Edi_city.clear();
		Edi_city.sendKeys("Hyderabad");
		
		Edi_povince.clear();
		Edi_povince.sendKeys("Telanaga");
		
		Edi_zipcode.clear();
		Edi_zipcode.sendKeys("500010");
		
	
		
		
		//scrollToElement(Edi_street1);
				
			
	}
	
	public static void toSaveContactDetails()
	{
		waitForElement(Btn_save);
		Btn_save.click();
	}
	
	public static void toSaveEmergencyContacts()
	{
		waitForElement(Lnk_emergencycontacts);
		Lnk_emergencycontacts.click();
	}
	
}
