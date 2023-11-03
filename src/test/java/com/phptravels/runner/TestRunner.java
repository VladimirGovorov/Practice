package com.phptravels.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		stepNotifications=true,
		features ="src/test/resources/features",
		glue={"com.phptravels.steps", "com.phptravels.Hooks"},
		tags="@ApproveLeave"
		
		)

public class TestRunner {

}
