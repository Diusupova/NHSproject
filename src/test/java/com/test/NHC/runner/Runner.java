package com.test.NHC.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.util.Locale;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",//content
        glue="com/test/NHC/stepdefinitions",//source
        dryRun = true,
        tags="@regression",
        plugin = {"pretty", "html:target/uiReport.html","rerun:target/uiFailedTests.txt"}

)
public class Runner {
}




