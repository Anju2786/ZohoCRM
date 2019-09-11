package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.WebdriverCommonLib;
import pom.CreateCampaign;
import pom.CreateLead;
import pom.CrmHomePage;
import pom.Loginpage;


public class Campaign extends BaseTest
{
	@Test(priority =1)
	public void createCampaignByclickingOnCampaignButton() throws Throwable 
	{
		WebdriverCommonLib wlib=new WebdriverCommonLib();
		wlib.waitForPageLoad();
		Thread.sleep(8000);
		//Create campaign
		 CrmHomePage Ch = new CrmHomePage(driver);
		//Ch.CreateCampaignbyClickonCampaignBtn();
		
		Thread.sleep(4000);
		
//		Ch.CreateNewCampaignByClickonNewCampaignBtn();
//		Thread.sleep(2000);
//		
//		CreateCampaign Cc = new CreateCampaign(driver);
//		Cc.EnterCampaignName();
//		Cc.Typefield();
//		Cc.Statusfield();
//		Cc.SaveBtn();
		
		
     //		Create Lead
		Thread.sleep(2000);
		CreateLead Cl = new CreateLead(driver);
		Cl.CreateLeadbyClickonLeadBtn();
		Thread.sleep(4000);
		Cl.CreatenewLeadByclickonNewLeadBtn();
		
		
		

	}

}
