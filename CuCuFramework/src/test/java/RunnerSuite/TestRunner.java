package RunnerSuite;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
glue = { "Stepdefinitions" },
monochrome = true, 
plugin = {"pretty", "html:target/HtmlReports", 
		"json:target/JSONReports/reports.json",
		"junit:target/JUNITReports/report.xml" }
)
public class TestRunner {

}
