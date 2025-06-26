package Webengage.Initialize;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.Scenario;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;

public class BaseTest extends Initialize {

//	protected PageObjectManager page;
	protected static PageObjectManager page;

	
	

//	@BeforeMethod

	public void setUp() {
		WebDriver driver = launchApplication();
		String[] creds = setCredentials();
		page = new PageObjectManager(driver);
		page.getLandingPage().GoTo();

		page.getLandingPage().loginApplication(creds[0],creds[1]);
		ThucydidesWebDriverSupport.useDriver(driver);

	}

//	@AfterClass
	public void tearDown() {
		
		
		driver.quit();

	}
	
	
//	 public void tearDown2(Scenario scenario) {
//       if (scenario.isFailed()) {
//           // Take screenshot as byte[]
//           final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//           // Attach it to report
//           scenario.attach(screenshot, "image/png", "Failure Screenshot");
//       }
//
//       if (driver != null) {
//           driver.quit();
//       }
//   } 
	 
	 
	 
	
	
//	    public void afterStep(Scenario scenario) {
//	        if (scenario.isFailed()) {
//	            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//	            scenario.attach(screenshot, "image/png", "Step Failure Screenshot" + scenario.getName());
//	        }
//	    }
	    
	    
//	   
//	    public void afterStep2(Scenario scenario) {
//	        if (scenario.isFailed()) {
//	            String stepName = StepListener.getCurrentStepText();
//	            System.out.println("Failed Step: " + stepName);
//
//	            // Use this stepName in your screenshot name
//	            String sanitized = stepName.replaceAll("[^a-zA-Z0-9_-]", "_");
//
//	            try {
//	                String screenshotPath = getScreenshot(sanitized, driver);
//	                byte[] imageBytes = Files.readAllBytes(Paths.get(screenshotPath));
//	                scenario.attach(imageBytes, "image/png",  "Failure Screenshot" +stepName);
//	            } catch (IOException e) {
//	                e.printStackTrace();
//	            }
//	        }
//	    }
//	    
	    
	    
//	    public void afterStepSerenity(Scenario scenario) {
//	        if (scenario.isFailed()) {
//	            
//	        	WebDriver driver = ThucydidesWebDriverSupport.getDriver();
//		        if (driver != null) {
//		            Serenity.takeScreenshot();
//		        } else {
//		            System.out.println("Driver not found for Serenity");
//		        }	
//	        	
//	        }
//	    }    
	    
//		public static void capture() {
//	        WebDriver driver = ThucydidesWebDriverSupport.getDriver();
//	        if (driver != null) {
//	            Serenity.takeScreenshot();
//	        } else {
//	            System.out.println("Driver not found for Serenity");
//	        }
//	    }
	
	
}
