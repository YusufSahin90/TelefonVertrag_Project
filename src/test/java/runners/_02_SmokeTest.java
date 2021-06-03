package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@SmokeTest",
        features = {"src/test/java/feature"},
        glue = {"stepdefs"}


)

public class _02_SmokeTest extends AbstractTestNGCucumberTests {
}
