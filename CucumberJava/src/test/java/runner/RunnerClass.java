package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="featureFiles/OpenGoogle.feature", glue={"stepDefinitions"}, plugin= {"html:report/WebReport", "json:report/jsonreport.json", "junit:report/xmlreport.xml"}, tags= "@SimpleLogin")
public class RunnerClass {
// it should combine feature file and step definition
	//Runner define
}
