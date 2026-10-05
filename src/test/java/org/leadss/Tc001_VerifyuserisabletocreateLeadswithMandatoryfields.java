package org.leadss;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ObjectRepository.CreateLeadsPage;
import com.ObjectRepository.HomePage;
import com.ObjectRepository.LeadsPage;
import com.buisnessUtility.BaseClass;

public class Tc001_VerifyuserisabletocreateLeadswithMandatoryfields extends BaseClass {
	
	@Test
	public void test() {
		
		 homepage = new HomePage(driver);
			
		homepage.getMoreButton();
		
		homepage.getLeadsModule();
		
		leadspage = new LeadsPage(driver);
		
		leadspage.getCreateLeads();
		
		createleadspage = new CreateLeadsPage(driver);
		
		createleadspage.getLeadsName();
		
		createleadspage.getCompanyName();
		
		createleadspage.getSaveButton();
		
	}

}
