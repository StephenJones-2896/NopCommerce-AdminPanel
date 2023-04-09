package Pratice.NopCommerce.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = ".//NopCommerce-AdminPanel//Feature",
		glue = ".//Pratice//NopCommerce//StepDefinition",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty", "html:Test-Output"}
		)

public class testRunner extends AbstractTestNGCucumberTests {

}
