package BaseTEST;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;

	String browser = "chrome";

	public WebDriver openApp() {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			return driver;

		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://www.facebook.com/");
			return driver;

		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			return driver;
		}
		return driver;

	}

	public WebDriver openChrome() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		return driver;

	}

	public WebDriver openEdge() {

		WebDriverManager.edgedriver().setup();
		// WebDriverManager.chromedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		return driver;

	}

	public WebDriver openFirefox() throws InterruptedException {

		Thread.sleep(3000);

		WebDriverManager.firefoxdriver().setup();
		// WebDriverManager.chromedriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		return driver;

	}

}
