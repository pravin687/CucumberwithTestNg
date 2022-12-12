package stepdefination;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.Testbase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Testbase{
	
	@Before
	public void setup() throws IOException {
		launchDriver();
	}
	
	@After
	  public void afterclass(Scenario sc) throws IOException{
	   if(sc.isFailed()) {
		 final  byte[] srceenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		 sc.attach(srceenshot, "image/png", sc.getName());
	   }

		  driver.quit();
	  }

}
