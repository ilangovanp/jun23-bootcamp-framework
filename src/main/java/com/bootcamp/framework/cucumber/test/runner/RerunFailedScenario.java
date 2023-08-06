package com.bootcamp.framework.cucumber.test.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		          features = {"@test-output/failedrerun.txt"},
		          glue = {"com.bootcamp.framework.step.deftions"},
		          publish = true,
		          monochrome = true
		        )
public class RerunFailedScenario extends AbstractTestNGCucumberTests {
	
	

}
