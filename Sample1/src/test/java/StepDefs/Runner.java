package StepDefs;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/FeatureFiles/UKBA.feature", monochrome = true,
    plugin = {
        "pretty",
            "html:target/cucumber.html",
            "json:target/cucumber.json",
            "junit:target/cucumber.xml",

    },
        tags = "@test1"
)
public class Runner {
}
