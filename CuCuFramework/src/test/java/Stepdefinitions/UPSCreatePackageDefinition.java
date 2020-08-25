package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SelenimUtilies.BrowserUtilities;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UPSCreatePackageDefinition {
	private WebDriver driver;
	private final static String HOME_URL = "http://www.ups.com/us/en";

	@Given("^User lands in to UPS home Page$")
	public void user_lands_in_to_UPS_home_Page() throws InterruptedException {
		System.out.println("Given ");
		driver = BrowserUtilities.getChromBrowserDriver(driver);
		BrowserUtilities.manageDriverOptions(driver);
		driver.get(HOME_URL);
		Thread.sleep(2000);
		
	}

	@And("^Navigate to Shipping Tab$")
	public void navigate_to_Shipping_Tab() throws InterruptedException {
		System.out.println("shiping" + By.linkText("Shipping"));
		driver.findElement(By.linkText("Shipping")).click();
		Thread.sleep(2000);
	}

	@When("Clicks on Create Create Shipment")
	public void clicks_on_Create_Create_Shipment() throws InterruptedException {
		if(driver.getPageSource().contains("Create a Shipment:")) {
			System.out.println("contains");
		//	driver.findElement(By.linkText("Create a Shipment:")).click();
			driver.get("https://www.ups.com/ship?loc=en_US");
			
		}
		Thread.sleep(2000);
	}

	@Then("Land on the Ship Page creation")
	public void land_on_the_Ship_Page_creation() {
		System.out.println("THen ");
//		driver.close();
//		driver.quit();
	}

}
