package pageObject;

import org.openqa.selenium.WebDriver;

import utility.DependencyInjection;

public class PageObjectManager {
public WebDriver driver;
public LoginPage lp;


	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage getLoginPage() {
		lp=new LoginPage(driver);
		return lp;
	}
	
}
