package Webengage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Webengage.Initialize.Initialize;

public class LandingPage extends Initialize {
	
	WebDriver driver;
	
	
	
	public LandingPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
   
 	
 	@FindBy(xpath= "//input[@data-field-name='email address']")
 	WebElement userEmail;
 	
 	@FindBy(css= "input[data-field-name='password']")
 	WebElement userPassword;
 	
	@FindBy(css= "button.btn")
 	WebElement submit;
	
	
	public void loginApplication(String Email , String Password) {
		
	userEmail.sendKeys(Email);
	userPassword.sendKeys(Password);
	submit.click();
				}
	
	public void GoTo () {
		
		String url = baseUrl();
		
        driver.get(url);

		
	}
	
	
	
}
