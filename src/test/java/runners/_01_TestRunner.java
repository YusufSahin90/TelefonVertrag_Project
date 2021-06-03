package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/feature"},
        glue = {"stepdefs"},
        dryRun = false

)

public class _01_TestRunner extends AbstractTestNGCucumberTests {


}