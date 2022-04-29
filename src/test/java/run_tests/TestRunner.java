package run_tests;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
        features = "src/test/resources/feature_files/DemoWebShop_Registration.feature", monochrome = true, dryRun = false,
        glue = "com/demowebshop/step_definitions",
        plugin = { "pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json" })

public class TestRunner extends AbstractTestNGCucumberTests{


}
