package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/featureFile",glue="stepdefination",monochrome=true,
plugin= {"pretty","json:target/json-report/cucumber.json","html:target/htmlreport/cucumber.html",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestNgRunner extends AbstractTestNGCucumberTests{

}
