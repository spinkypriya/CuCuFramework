package SelenimUtilies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtilities {

	
	public static WebDriver getChromBrowserDriver(WebDriver driver) {
		String directory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", directory+"/src/test/resources/Drivers/chromedriver.exe");
		return new ChromeDriver();
	}
	
	public static void manageDriverOptions(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
	}
	
	public static void sleep(long timeToSleep) throws InterruptedException {
		Thread.sleep(timeToSleep);
	}

}
