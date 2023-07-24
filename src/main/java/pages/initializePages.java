package pages;

import org.openqa.selenium.WebDriver;

public class initializePages {
	
	public register_page register;
	public signin_page signin;
	public signInUsingEmail_page signInUsingEmail;
	public homepage_page homepage;
	public search_page search;
	public mybooks_page mybooks;
	public profile_page profile;
	
	public initializePages(WebDriver driver) {
		 
		this.register=new register_page(driver);
		this.signin=new signin_page(driver);
		this.signInUsingEmail=new signInUsingEmail_page(driver);
		this.homepage=new homepage_page(driver);
		this.search=new search_page(driver);
		this.mybooks=new mybooks_page(driver);
		this.profile=new profile_page(driver);
	}

}
