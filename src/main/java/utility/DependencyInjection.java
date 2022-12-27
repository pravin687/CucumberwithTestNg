package utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import base.Testbase;
import pageObject.PageObjectManager;

public class DependencyInjection {

	//public WebDriver driver;
	public Testbase testbase;
	public PageObjectManager po;
	public DependencyInjection() throws IOException {
	
		testbase=new Testbase();
		po=new PageObjectManager(testbase.launchDriver());
		
	}
	
	
	
}
