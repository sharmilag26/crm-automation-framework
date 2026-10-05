package org.contacts;

import org.testng.annotations.Test;

import com.ObjectRepository.ContactsPage;
import com.ObjectRepository.CreateContactPage;
import com.ObjectRepository.HomePage;
import com.buisnessUtility.BaseClass;

public class Tc001_VerifyuserisabletocreatecontactwithMandatoryfields extends BaseClass{
	
	@Test
	public void test() {
		
     homepage = new HomePage(driver);
		
		homepage.getMoreButton();

		homepage.getContactModule();
		
		contactspage = new ContactsPage(driver);
		
		contactspage.getCreateContact();
		
		createcontactspage = new CreateContactPage(driver);
		
		createcontactspage.getContactName();
		
		createcontactspage.getSaveButton();
		
		
		
	}

}
