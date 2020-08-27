package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SelenimUtilies.BrowserUtilities;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UPSHomePageLogin {

	private WebDriver driver;
	private final static String HOME_URL = "http://www.ups.com/us/en";

	@Given("Enter UPS home page URL")
	public void enter_UPS_home_page_URL() throws InterruptedException {
		driver = BrowserUtilities.getChromBrowserDriver(driver);
		BrowserUtilities.manageDriverOptions(driver);
		driver.get(HOME_URL);
		Thread.sleep(2000);
	}

	@And("click on login")
	public void click_on_login_signup() {
		driver.findElement(By.className("ups-loginsignup")).click();
		
	}
	
	@When("user enters {string} {string}")
	public void user_enters(String string, String string2) {
		driver.findElement(By.name("userID")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);//getTokenWithPassword
		driver.findElement(By.name("getTokenWithPassword")).submit();
	}

	@And("^Click on Login hyperlink$")
	public void click_on_login_link() {
		if(driver.findElement(By.linkText("Log in")).isDisplayed()) {
			driver.findElement(By.linkText("Log in")).click();
		} else { //DOARegisterLink
			System.out.println("not displayed");
			driver.findElement(By.id("DOARegisterLink")).click();
		}
			
	}

	

	@Then("login shoud be successfull.")
	public void login_shoud_be_successfull() {
		
	}
}
