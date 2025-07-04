package Webengage.Initialize;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Initialize {
	public WebDriver driver;
	private static Properties properties;

	// Load config.properties file once
	static {
		try {
			FileInputStream fileInput = new FileInputStream(
					System.getProperty("user.dir") + "//src/main//resources//config.properties");
			properties = new Properties();
			properties.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Helper method to get property
	public static String getProperty(String key) {
		return properties.getProperty(key);
	}

	// Browser setup based on config

	// Method to create browser driver
	private static WebDriver createDriver(String browserName) {
		if (browserName == null || browserName.isEmpty()) {
			System.out.println("Browser not specified, defaulting to chrome");
			browserName = "chrome";
		}

		switch (browserName.toLowerCase()) {

		case "headless":

			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			return new ChromeDriver(options);

		case "chrome":

			return new ChromeDriver();
		case "firefox":
			return new FirefoxDriver();
		case "safari":
			return new SafariDriver();
		default:
			throw new IllegalArgumentException("Unsupported browser: " + browserName);
		}
	}

	public WebDriver initializer() {
//    String browserName = getProperty("browser");
		String browserName = System.getProperty("browser") != null ? System.getProperty("browser")
				: getProperty("browser");

		driver = createDriver(browserName);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		return driver;
	}

	public WebDriver launchApplication() {

		driver = initializer();

		return driver;

	}

	public String baseUrl() {
		String env = System.getProperty("env") != null ? System.getProperty("env") : getProperty("env");

		if (env == null || env.isEmpty()) {
			System.out.println("Environment not specified, defaulting to US");
			env = "us";
		}

		switch (env.toLowerCase()) {
		case "us":
			return "https://dashboard.webengage.com/accounts/aa131d2c/users/overview";

		case "in":
			return "https://dashboard.in.webengage.com/user/account.html?action=login&region=in";

		case "ksa":
			return "https://dashboard.ksa.webengage.com/user/account.html?action=login&region=ksa";

		case "staging":
			return "https://dashboard-automation.stg.webengage.biz/accounts/stg~58b0115a/users/overview";

		default:
			throw new IllegalArgumentException("Unsupported environment: " + env);
		}
	}

	public String[] setCredentials() {
		String env = System.getProperty("env") != null ? System.getProperty("env") : getProperty("env");

		if (env == null || env.isEmpty()) {
			System.out.println("Environment not specified");
			env = "us"; // fallback default
		}

		String usernameKey = "un_" + env.toLowerCase();
		String passwordKey = "ps_" + env.toLowerCase();

		String username = getProperty(usernameKey);
		String password = getProperty(passwordKey);

		if (username == null || password == null) {
			throw new IllegalArgumentException("Credentials not found for environment: " + env);
		}

		return new String[] { username, password };
	}

//	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
//
//		TakesScreenshot sc = (TakesScreenshot) driver;
//		File source = sc.getScreenshotAs(OutputType.FILE);
//		File file = new File(System.getProperty("user.dir") + "/reports/" + testCaseName + ".png");
//		FileUtils.copyFile(source, file);
//		return System.getProperty("user.dir") + "/reports/" + testCaseName + ".png";
//
//	}
//	
//	

	
	

}
