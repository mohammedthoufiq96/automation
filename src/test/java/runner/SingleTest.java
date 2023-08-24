package runner;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;


@RunWith(CucumberWithSerenity.class)

@io.cucumber.junit.CucumberOptions(plugin= {"html:target/site/reports.html"},
features = "src/test/resources/features/" , glue = {"stepdefinitions"},tags="@Regression1")
//@io.cucumber.junit.CucumberOptions(plugin= {"html:target/site/reports.html"},
//features = "src/test/resources/features/Registration.feature" , glue = {"stepdefinitions"})
public class SingleTest  {
}
