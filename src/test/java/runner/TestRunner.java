package StepDefinition;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
            features="src/test/java/features",
            glue={"src/test/java/StepDefinition", "src/test/java/utility"})
public class TestRunner{

}
