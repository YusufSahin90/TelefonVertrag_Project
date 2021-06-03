package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@RegressionTest",
        features = {"src/test/java/feature"},
        glue = {"stepdefs"}

)

public class _03_RegressionTest extends AbstractTestNGCucumberTests {
}
