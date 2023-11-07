package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/resources/Features/Login.feature", glue = "com.Dinesh.TechAssessment3",plugin= {"pretty", "html:target/Assessment-reports/Cucumber.html", "junit:target/Assessment-reports/Cucumber.xml", "json:target/Assessment-reports/Cucumber.json"})
//@CucumberOptions(features = "src/test/resources/Features/Register.feature", glue = "com.Dinesh.TechAssessment3",plugin= {"pretty", "html:target/Assessment-reports/Cucumber.html", "junit:target/Assessment-reports/Cucumber.xml", "json:target/Assessment-reports/Cucumber.json"})
@CucumberOptions(features = "src/test/resources/Features/Wishlist.feature", glue = "com.Dinesh.TechAssessment3",plugin= {"pretty", "html:target/Assessment-reports/Cucumber.html", "junit:target/Assessment-reports/Cucumber.xml", "json:target/Assessment-reports/Cucumber.json"})

public class runner {

}
