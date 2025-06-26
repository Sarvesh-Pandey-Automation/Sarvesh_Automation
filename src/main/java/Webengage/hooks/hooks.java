package Webengage.hooks;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;

import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import Webengage.Initialize.BaseTest;
import Webengage.Initialize.Initialize;
import Webengage.Initialize.PageObjectManager;

public class hooks extends BaseTest{
    public static WebDriver driver;
    
 
	
    @Before
    public void beforeScenario() {
        setUp(); // from BaseTest
    }

//   @After
//  public void afterScenario() {
////      tearDown(); // from BaseTest}
//      
//      tearDown2();
//    
//   }
   
    
//    @AfterStep
//    public void afterScenario2(Scenario scenario) {
//    	afterStepSerenity(scenario);
//    }
    
    
//
//    @After
//    public void afterScenario(Scenario scenario) {
//        tearDown(); // ✅ Pass the scenario object
//    }
//    
    
    
    
    
//    @After
//    public void tearDown(Scenario scenario) {
//        if (scenario.isFailed()) {
//            // Take screenshot as byte[]
//            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//            // Attach it to report
//            scenario.attach(screenshot, "image/png", "Failure Screenshot");
//        }
//
//        if (driver != null) {
//            driver.quit();
//        }
//    }   
    
    
    
    
    
	}
	
    

