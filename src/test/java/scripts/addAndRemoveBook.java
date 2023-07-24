package scripts;

import org.testng.annotations.Test;

import dataProviders.readDataProviders;
import generic.baseTest;
import pages.initializePages;



public class addAndRemoveBook extends baseTest{
	
	@Test(dataProviderClass=readDataProviders.class,dataProvider="userLogin")
	public void userLoginScript(String em,String pw,String bn) throws InterruptedException
	{
		initializePages pages=new initializePages(driver);
		
		pages.register.clickSignin();
		pages.signin.clickEmailSI();
		pages.signInUsingEmail.signin(em, pw);
		pages.homepage.clickSearch(bn);
		pages.search.clickWantToRead();
		pages.mybooks.clickRemove();
		
		actionUtil.validatePopup();
		
		Thread.sleep(2000);
		
		pages.profile.clickSingout();
		
	}
	
	

}
