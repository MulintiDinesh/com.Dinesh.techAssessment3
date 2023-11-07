package com.Dinesh.TechAssessment3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HelperClassLogin {
private static HelperClassLogin helperClassLogin;
	
	private static WebDriver driver;
	public final static int TIMEOUT = 15;
	
	HelperClassLogin() {
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
	}
	public static void openPage(String url) {
		driver.get(url);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setUpDriver() {
		if(helperClassLogin == null) {
			helperClassLogin = new HelperClassLogin();
		}
	}
	public static void teardown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		helperClassLogin = null;
	}
}

