package stepdefination;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.Testbase;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.DependencyInjection;

public class Hooks{
	public DependencyInjection dependencyinjection;
	public Hooks(DependencyInjection di) {
		this.dependencyinjection=di;
	}
	
	@Before
	public void setup() throws IOException {
		
		dependencyinjection.testbase.launchDriver();
	}
	
	@After
	public void closeDriver() throws IOException {
		dependencyinjection.testbase.launchDriver().quit();
	}
	
	@AfterStep
	  public void afterclass(Scenario sc) throws IOException{
	   if(sc.isFailed()) {
		 final  byte[] srceenshot= ((TakesScreenshot)dependencyinjection.testbase.launchDriver()).getScreenshotAs(OutputType.BYTES);
		 sc.attach(srceenshot, "image/png", sc.getName());
		 
	   }

		
	  }

}
