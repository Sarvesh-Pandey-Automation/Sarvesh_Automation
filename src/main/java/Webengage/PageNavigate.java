package Webengage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageNavigate extends Reausable_Methods{
	
	WebDriver driver;
	
	
	
	public PageNavigate(WebDriver driver) {
		
	super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
   
	public static String GENERIC_TEXT= "//*[text()='%s']";
	
	By generic_text = By.xpath("//*[text()='%s']");

	@FindBy(className = "modal__close")
	WebElement gettingStartedModalClose;
	
	@FindBy(id = "app-nav-container")
	WebElement SideNavBar;
	
	@FindBy(xpath="//*[@class='we_close']")
	WebElement Header_Close;
	
	//*[@class='menu__list']
	
	@FindBy(className = "menu__list")
	WebElement menuList;
	
	By sidenavbar =By.id("app-nav-container");
	
	@FindBy(className = "fl-web-personalization")
	WebElement WebPersonalisation;
	
	By WebP = By.className("fl-web-personalization");
	
	@FindBy(className = "fl-on-site-notification")
	WebElement OnSiteNotification;
	
	
	By Onsite = By.className("fl-on-site-notification");
	
	
	@FindBy(xpath = "//*[text()='%s']")
	WebElement navBarOption;
	
	
	By navbarOption = By.xpath("//*[text()='%s']");
	
	By modal = By.className("modal__close");
	
	By webPush = By.id("allow");
	
	@FindBy(id = "allow")
	WebElement allow_webpush;
	
	@FindBy(id = "deny")
	WebElement deny_webpush;
	
//	public void navigatToPage() {
//		
////		driver.get("https://dashboard-control-room-1.stg.webengage.biz/accounts/stg~58b0115a/users/overview");
//		waitElementToAppear(modal,10);
//		gettingStartedModalClose.click();
//		SideNavBar.click();
//		navBarOption.click();
//		
//		
//		
//	}
	
	
	public void navigatToPage() {
	    try {
	        
	    	waitElementToAppear(modal,5);
	        
	        if (((WebElement) modal).isDisplayed()) {
	            gettingStartedModalClose.click();
	        }
	    } catch (TimeoutException e) {
	        System.out.println("Modal not present, continuing...");
	    }

	    waitElementToClick(sidenavbar,10);
	    SideNavBar.click();
//	    waitElementToClick();
	    navBarOption.click();
	}
	
	public void navigatToOnsitePage1() {
		
//		driver.get("https://dashboard-control-room-1.stg.webengage.biz/accounts/stg~58b0115a/users/overview");
		   try {
		        
		    	waitElementToAppear(modal,5);
		        
		        if (gettingStartedModalClose.isDisplayed()) {
		            gettingStartedModalClose.click();
		        }
		    } catch (TimeoutException e) {
		        System.out.println("Modal not present, continuing...");
		    }
		
		waitElementToClick(sidenavbar,10);
		SideNavBar.click();
		waitElementToClick(WebP,10);
		WebPersonalisation.click();
		waitElementToClick(Onsite,10);
		OnSiteNotification.click();
	
		
		
	}
	
	
	
	
	public void navigatToOnsitePage() {
	    // Step 1: Check for iframe and handle webpush first
	    List<WebElement> iframes = driver.findElements(By.id("webpush-onsite"));

	    if (!iframes.isEmpty()) {
	        System.out.println("Webpush iframe detected. Switching...");

	        // Switch to iframe
	        driver.switchTo().frame("webpush-onsite");

	        try {
	            waitElementToAppear(webPush, 5); // Wait for popup inside iframe

	            if (allow_webpush.isDisplayed()) {
	                deny_webpush.click();
	                System.out.println("Clicked allow/close inside webpush iframe.");
	            }
	        } catch (TimeoutException e) {
	            System.out.println("Webpush element not found in iframe.");
	        } catch (NoSuchElementException e) {
	            System.out.println("Webpush button not interactable: " + e.getMessage());
	        } finally {
	            // Important: always switch back to main content
	            driver.switchTo().defaultContent();
	        }
	    }

	    // Step 2: Now handle the modal (if present)
	    try {
	        waitElementToAppear(modal, 5);

	        if (gettingStartedModalClose.isDisplayed()) {
	            gettingStartedModalClose.click();
	            System.out.println("Modal closed.");
	        }
	    } catch (TimeoutException e) {
	        System.out.println("Modal not present, continuing...");
	    }

	    // Step 3: Continue normal navigation
	    SideNavBar.click();
	    
	
	    WebPersonalisation.click();
	    OnSiteNotification.click();
	
	}


	
	
	public void navigatToOnsitePage2(String value1 ,String value2) {
	    // Step 1: Check for iframe and handle webpush first
	    List<WebElement> iframes = driver.findElements(By.id("webpush-onsite"));

	    if (!iframes.isEmpty()) {
	        System.out.println("Webpush iframe detected. Switching...");

	        // Switch to iframe
	        driver.switchTo().frame("webpush-onsite");

	        try {
	            waitElementToAppear(webPush, 5); // Wait for popup inside iframe

	            if (allow_webpush.isDisplayed()) {
	                deny_webpush.click();
	                System.out.println("Clicked allow/close inside webpush iframe.");
	            }
	        } catch (TimeoutException e) {
	            System.out.println("Webpush element not found in iframe.");
	        } catch (NoSuchElementException e) {
	            System.out.println("Webpush button not interactable: " + e.getMessage());
	        } finally {
	            // Important: always switch back to main content
	            driver.switchTo().defaultContent();
	        }
	    }

	    // Step 2: Now handle the modal (if present)
	    try {
	        waitElementToAppear(modal, 5);

	        if (gettingStartedModalClose.isDisplayed()) {
	            gettingStartedModalClose.click();
	            System.out.println("Modal closed.");
	        }
	    } catch (TimeoutException e) {
	        System.out.println("Modal not present, continuing...");
	    }

	    // Step 3: Continue normal navigation
	    SideNavBar.click();
	    
//   scrollToCenter(Find(DynamicXPathLocator(GENERIC_TEXT,value2)));
	    
	    scrollToCenter(menuList) ;   
   waitElementToClick(DynamicXPathLocator(GENERIC_TEXT,value2),20); 
	   Find(DynamicXPathLocator(GENERIC_TEXT,value2)).click();
//	    WebPersonalisation.click();
//	    OnSiteNotification.click();
	   waitElementToClick(DynamicXPathLocator(GENERIC_TEXT,value1),10); 
	    Find(DynamicXPathLocator(GENERIC_TEXT,value1)).click();
	    
	}
	
	
	public void navigatToOnsitePage3(String value1, String value2) throws InterruptedException {
	    // Step 1: Handle webpush iframe
	    List<WebElement> webpushIframes = driver.findElements(By.id("webpush-onsite"));

	    if (!webpushIframes.isEmpty()) {
	        System.out.println("Webpush iframe detected. Switching...");
	        driver.switchTo().frame("webpush-onsite");

	        try {
	            waitElementToAppear(webPush, 5);
	            if (allow_webpush.isDisplayed()) {
	                deny_webpush.click();
	                System.out.println("Clicked deny inside webpush iframe.");
	            }
	        } catch (TimeoutException | NoSuchElementException e) {
	            System.out.println("Webpush iframe content not interactable: " + e.getMessage());
	        } finally {
	            driver.switchTo().defaultContent();
	        }
	    }

	    // Step 1.5: Handle second optional iframe (e.g., survey, guide, etc.)
	    List<WebElement> secondIframes = driver.findElements(By.id("webengage-notification-container"));

	    if (!secondIframes.isEmpty()) {
	        System.out.println("Second iframe detected. Switching...");
	        driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");

	        try {
	        	
	            waitElementToClick(Header_Close, 5);
	            if (Header_Close.isDisplayed()) {
	            	Header_Close.click();
	                System.out.println("Closed popup inside second iframe.");
	            }
	        } catch (TimeoutException | NoSuchElementException e) {
	            System.out.println("Second iframe element issue: " + e.getMessage());
	        } finally {
	            driver.switchTo().defaultContent();
	        }
	    }

	    // Step 2: Handle modal (if present)
	    try {
	        waitElementToAppear(modal, 5);
	        if (gettingStartedModalClose.isDisplayed()) {
	            gettingStartedModalClose.click();
	            System.out.println("Modal closed.");
	        }
	    } catch (TimeoutException e) {
	        System.out.println("Modal not present, continuing...");
	    }

	    // Step 3: Navigate to On-site Notifications
	    SideNavBar.click();
	    
	    waitElementToAppear(menuList,10);

	    scrollToCenter(menuList);
	    
	    waitElementToClick(DynamicXPathLocator(GENERIC_TEXT, value2), 20);
    Thread.sleep(3000);
	    
//	    By elem = (DynamicXPathLocator(GENERIC_TEXT, value2));
	    
//	    waitElementToClick(elem,20);
	    Find(DynamicXPathLocator(GENERIC_TEXT, value2)).click();
	    
//	    waitElementToClick(DynamicXPathLocator(GENERIC_TEXT, value1), 10);
	    Find(DynamicXPathLocator(GENERIC_TEXT, value1)).click();
	}


	
	
	
	
	public void navigatToOnsitePage4(String value1, String value2) {
	    // Step 1: Handle webpush iframe
	    List<WebElement> webpushIframes = driver.findElements(By.id("webpush-onsite"));

	    if (!webpushIframes.isEmpty()) {
	        System.out.println("Webpush iframe detected. Switching...");
	        driver.switchTo().frame("webpush-onsite");

	        try {
	            waitElementToAppear(By.cssSelector("selector-for-webPush"), 5); // Replace with actual By for `webPush`
	            if (driver.findElement(By.cssSelector("selector-for-allow-webpush")).isDisplayed()) {
	                driver.findElement(By.cssSelector("selector-for-deny-webpush")).click();
	                System.out.println("Clicked deny inside webpush iframe.");
	            }
	        } catch (TimeoutException | NoSuchElementException e) {
	            System.out.println("Webpush iframe content not interactable: " + e.getMessage());
	        } finally {
	            driver.switchTo().defaultContent();
	        }
	    }

	    // Step 1.5: Handle second optional iframe (e.g., survey, guide, etc.)
//	    List<WebElement> secondIframes = driver.findElements(By.id("webengage-notification-container"));
//
//	    if (!secondIframes.isEmpty()) {
//	        System.out.println("Second iframe detected. Switching...");
//	        driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
//
//	        try {
//	            By headerCloseBy = By.cssSelector("selector-for-header-close"); // Replace with actual selector
//	            waitElementToClick(headerCloseBy, 5);
//	            WebElement headerClose = driver.findElement(headerCloseBy);
//	            if (headerClose.isDisplayed()) {
//	                headerClose.click();
//	                System.out.println("Closed popup inside second iframe.");
//	            }
//	        } catch (TimeoutException | NoSuchElementException e) {
//	            System.out.println("Second iframe element issue: " + e.getMessage());
//	        } finally {
//	            driver.switchTo().defaultContent();
//	        }
//	    }

	    // Step 2: Handle modal (if present)
	    try {
	        waitElementToAppear(By.cssSelector("selector-for-modal"), 5); // Replace with actual By for `modal`
	        WebElement modalClose = driver.findElement(By.cssSelector("selector-for-modal-close"));
	        if (modalClose.isDisplayed()) {
	            modalClose.click();
	            System.out.println("Modal closed.");
	        }
	    } catch (TimeoutException e) {
	        System.out.println("Modal not present, continuing...");
	    }

	    // Step 3: Navigate to On-site Notifications
	    driver.findElement(By.cssSelector("selector-for-sidenavbar")).click(); // Replace with actual SideNavBar selector

	    waitElementToAppear(By.cssSelector("selector-for-menuList"), 10); // Replace with actual `menuList` selector

	    scrollToCenter(driver.findElement(By.cssSelector("selector-for-menuList"))); // Adjust if needed

	    // Handle first dynamic element (value2)
	    By elem2 = DynamicXPathLocator(GENERIC_TEXT, value2);
	    waitUntilVisibleAndStable(elem2, 10);
	    waitElementToClick(elem2, 10);
	    Find(elem2).click();

	    // Handle second dynamic element (value1)
	    By elem1 = DynamicXPathLocator(GENERIC_TEXT, value1);
	    waitUntilVisibleAndStable(elem1, 10);
	    waitElementToClick(elem1, 10);
	    Find(elem1).click();
	}

	
	

	
	
}
