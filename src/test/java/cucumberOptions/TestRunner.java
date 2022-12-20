package cucumberOptions;

        import io.cucumber.testng.AbstractTestNGCucumberTests;
        import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources",
        glue = "StepDefinitions", tags = "@RegressionTests" //package name
)
public class TestRunner extends AbstractTestNGCucumberTests {
}