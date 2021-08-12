package suites;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		plugin= {"pretty"},
		features="src/test/resources/apiFeatures",
		glue="apiGlueCode"
		)


public class TestSuite {

}