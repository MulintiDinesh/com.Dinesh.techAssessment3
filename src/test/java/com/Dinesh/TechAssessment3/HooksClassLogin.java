package com.Dinesh.TechAssessment3;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClassLogin {
	@Before
	public static void setUp() {
		HelperClassLogin.setUpDriver();
	}
	@After
	public static void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) HelperClassLogin.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
		HelperClassLogin.teardown();
	}
}
