package Webengage;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Webengage.Initialize.Initialize;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class Reausable_Methods {

  WebDriver driver;

    public Reausable_Methods(WebDriver driver) {
    	this.driver =driver;
		// TODO Auto-generated constructor stub
	}

	public void waitElementToAppear(By locator, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        
    }
	

	public void waitElementToAppear(WebElement element, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOf(element));
        
    }
	
	public void waitElementToClick(By element, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        
    }
	
	public void waitElementToClick(WebElement element, int time) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
	    wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	
	
	
	public WebElement Find( By element) {
		
	return	driver.findElement(element);
		
        
    }
	
	
	public void hoverOverElement(WebElement element) {
	    Actions actions = new Actions(driver);
	   
	    actions.moveToElement(element).perform();
	}

	
//	public void waitElementToClickAndClick(By locator, int timeout) {
//	    try {
//	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
//	        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
//
//	        // Optional: Highlight for debugging
//	        ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", element);
//
//	        element.click();
//	        System.out.println("Clicked element: " + locator);
//	    } catch (Exception e) {
//	        System.out.println("Failed to click: " + locator);
//	        e.printStackTrace();
//	    }
//	}

	
	public void waitElementToInvisible(By element, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
        
    }
	
	
	
	public void waitElementToDisappear(By locator, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }	
	
	
	
	
	public void clearAndType(WebElement input, String text) {
		String os = System.getProperty("os.name").toLowerCase();
		Keys commandKey = os.contains("mac") ? Keys.COMMAND : Keys.CONTROL;

		input.sendKeys(Keys.chord(commandKey, "a")); // select all
		input.sendKeys(Keys.BACK_SPACE); // delete
		input.sendKeys(text); // type new text
	}

	public void selectAndDelete(WebElement input) {
		String os = System.getProperty("os.name").toLowerCase();
		Keys commandKey = os.contains("mac") ? Keys.COMMAND : Keys.CONTROL;

		input.sendKeys(Keys.chord(commandKey, "a")); // select all
		input.sendKeys(Keys.BACK_SPACE); // delete
	
	}
	
	
	
	
	public By DynamicXPathLocator(String element, String value) {
		
		element = element.replace("%s", value);
		
		
		
		return By.xpath(element);
		
	}
	
	
public By DynamicXPathLocator(String element, String value1, String value2) {
		
		element = element.replace("%s1", value1);
		element = element.replace("%s2", value2);
		return By.xpath(element);
		
	}
	

	
	
	
	public static void wheelScrollToTop(WebDriver driver, String elementXPath) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    String script = """
	        const xpath = arguments[0];
	        const result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null);
	        const element = result.singleNodeValue;

	        if (!element) {
	            console.warn('Element not found by XPath');
	            return;
	        }

	        // Use nested .rc-virtual-list-holder if present, otherwise element itself
	        const scrollContainer = element.querySelector('.rc-virtual-list-holder') || element;

	        scrollContainer.style.overflowY = 'auto';

	        let scrollAmount = 0;
	        const step = 20;
	        const interval = 30;

	        const intervalId = setInterval(() => {
	            scrollContainer.scrollTop -= step;  // scroll UP
	            scrollAmount += step;

	            const event = new WheelEvent('wheel', {
	                deltaY: -step,  // negative delta for upward scroll
	                bubbles: true,
	                cancelable: true
	            });
	            scrollContainer.dispatchEvent(event);

	            if (scrollContainer.scrollTop <= 0 || scrollAmount >= scrollContainer.scrollHeight) {
	                clearInterval(intervalId);
	                console.log('Scrolled to top.');
	            }
	        }, interval);
	    """;

	    js.executeScript(script, elementXPath);
	}
	
	

public static void wheelScrollToBottom(WebDriver driver, String elementXPath) {
    JavascriptExecutor js = (JavascriptExecutor) driver;

    String script = """
        const xpath = arguments[0];
        const result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null);
        const element = result.singleNodeValue;

        if (!element) {
            console.warn('Element not found by XPath');
            return;
        }

        // Find nested .rc-virtual-list-holder if exists, else use the element itself
        const scrollContainer = element.querySelector('.rc-virtual-list-holder') || element;

        scrollContainer.style.overflowY = 'auto';

        let scrollAmount = 0;
        const maxScroll = scrollContainer.scrollHeight - scrollContainer.clientHeight;
        const step = 20;
        const interval = 30;

        const intervalId = setInterval(() => {
            scrollContainer.scrollTop += step;
            scrollAmount += step;

            // Dispatch wheel event on scroll container to simulate user interaction
            const event = new WheelEvent('wheel', {
                deltaY: step,
                bubbles: true,
                cancelable: true
            });
            scrollContainer.dispatchEvent(event);

            if (scrollContainer.scrollTop >= maxScroll || scrollAmount >= maxScroll) {
                clearInterval(intervalId);
                console.log('Scrolled to bottom.');
            }
        }, interval);
    """;

    js.executeScript(script, elementXPath);
}






public void scrollToCenter(WebElement element) {
	
	
	
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
}


public void scrollToCenter1(WebElement element) {
    // Scroll to center
    ((JavascriptExecutor) driver).executeScript(
        "arguments[0].scrollIntoView({behavior: 'instant', block: 'center', inline: 'center'});", element);

    // Wait a short moment to let the browser visually scroll
    try {
        Thread.sleep(300); // optional but helps on slower machines
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    // Extra safeguard: verify it's in viewport
    Boolean isInView = (Boolean) ((JavascriptExecutor) driver).executeScript(
        "const rect = arguments[0].getBoundingClientRect();" +
        "return (rect.top >= 0 && rect.left >= 0 && rect.bottom <= (window.innerHeight || document.documentElement.clientHeight) && " +
        "rect.right <= (window.innerWidth || document.documentElement.clientWidth));",
        element
    );

    if (!isInView) {
        System.out.println("⚠️ Element is still not in viewport after scroll!");
    }
}



public void scrollCardToCenter(WebElement cardElement) {
    if (cardElement == null) {
        System.out.println("Card element not provided");
        return;
    }

    JavascriptExecutor js = (JavascriptExecutor) driver;

    js.executeScript("""
        const el = arguments[0];
        el.scrollIntoView({ behavior: 'instant', block: 'nearest', inline: 'nearest' });
        const rect = el.getBoundingClientRect();
        window.scrollBy(0, rect.top - (window.innerHeight / 2));
    """, cardElement);
}








public void waitUntilVisibleAndStable(By locator, int timeoutInSeconds) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
    wait.until(driver -> {
        WebElement element = driver.findElement(locator);
        return element.isDisplayed()
            && element.getRect().getHeight() > 0
            && element.getRect().getWidth() > 0;
    });
}	
	
public void  switchToIframeByXPath( String iframeXPath) {
    try {
        WebElement iframe = driver.findElement(By.xpath(iframeXPath));
        driver.switchTo().frame(iframe);
        System.out.println("✅ Switched to iframe: " + iframeXPath);
      
    } catch (NoSuchElementException e) {
        System.err.println("❌ Iframe not found: " + iframeXPath);
    } catch (Exception e) {
        System.err.println("❌ Error switching to iframe: " + e.getMessage());
    }
    
}	
	
	
}



