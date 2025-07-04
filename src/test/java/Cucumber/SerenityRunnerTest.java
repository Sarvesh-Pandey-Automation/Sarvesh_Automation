package Cucumber;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;



import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features", // ✅ Feature files go here
    glue = {
        "Webengage.stepDefinitions",          // ✅ Step definitions in test/java
        "Webengage.hooks"                     // ✅ Hooks (optional)
    },
    plugin = {
        "pretty",
        "json:target/serenity/serenity.json"  // ✅ Required for report generation
    },
    
    
    tags= "@tag4",
   
    monochrome = true
    
)

public class SerenityRunnerTest {
	
	  @BeforeClass
	    public static void initialize() throws IOException, InterruptedException{
	        String env="us";
	        String credsUn="aditya.dhanve+1@webengage.com";
	        String credsPw="@dmin@123";
	        System.setProperty("env", env);
	        System.setProperty("set.Namespace", "automation");
	        System.setProperty("set.CredentialsUN", credsUn);
	        System.setProperty("set.CredentialsPW", credsPw);
	        System.setProperty("browser","chrome");
	        System.setProperty("set.LicenseCode","null");
	        System.setProperty("set.Suite", "WebSDKSuite");// WebSDKSuite
	       
	    }
	
	
    // No code inside needed
}
