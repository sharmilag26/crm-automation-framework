package org.campaign;

import org.testng.annotations.Test;

import com.ObjectRepository.CampaignPage;
import com.ObjectRepository.CreateCampaignPage;
import com.ObjectRepository.HomePage;
import com.buisnessUtility.BaseClass;

public class Tc001_VerifyuserisabletocreatecampaignwithMandatoryfields extends BaseClass {

	
	@Test
	public void test() throws InterruptedException {
		
	
	homepage = new HomePage(driver);
	
	homepage.getMoreButton();
	
	homepage.getCampaignModule();
	
	campaignpage = new CampaignPage(driver);
	
	campaignpage.getCreateCampaign();
	
	createcampaignpage = new CreateCampaignPage(driver);
	
	createcampaignpage.getCreateCampaign();
	
	createcampaignpage.ExpectedClosingDate();
	
	createcampaignpage.getSaveButton();
	
	}

}
