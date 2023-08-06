package com.bootcamp.framework.cucumber.test.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		         features = {"src/main/java/com/bootcamp/framework/cucumber/feature/files/TestFeature.feature"},
		         glue = {"com.bootcamp.framework.step.deftions"},
		         dryRun = false,
		         monochrome = true,
		         tags = "@tag",
		         publish = true,
		         plugin = {"rerun:test-output/failedrerun.txt"}
		        )
public class TestNGTestRunner extends AbstractTestNGCucumberTests {	

}