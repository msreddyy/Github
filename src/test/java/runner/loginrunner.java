package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/feature/login.feature"},glue = {"Steps"},dryRun = false,
        plugin = {"pretty", "html:target/HtmlReports2",
        "json:target/JsonReports2",
        "junit:target/XmlReports2"})
public class loginrunner {
}
