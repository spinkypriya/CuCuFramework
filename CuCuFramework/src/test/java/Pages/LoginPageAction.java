package Pages;

import org.openqa.selenium.WebDriver;

import SelenimUtilies.BrowserUtilities;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPageAction {

	private WebDriver webDriver;
	LoginPageWebElements loginPageWebElements = null;
	private final static String HOME_URL = "http://www.ups.com/us/en";

	@Given("Enter UPS home page URL POM")
	public void enter_UPS_home_page_URL_POM() {
		webDriver = BrowserUtilities.getChromBrowserDriver(webDriver);
		BrowserUtilities.manageDriverOptions(webDriver);
		loginPageWebElements = new LoginPageWebElements(webDriver);
		webDriver.get(HOME_URL);
		BrowserUtilities.sleep(2000);
	}

	@And("click on login POM")
	public void click_on_login_POM() {
		loginPageWebElements.getloginLink();
		BrowserUtilities.sleep(2000);
	}

	@And("Click on Login hyperlink POM")
	public void click_on_Login_hyperlink_POM() {
		loginPageWebElements.clickonLoginLink();
		BrowserUtilities.sleep(2000);
	}

	@When("user enters  POM {string} {string}")
	public void user_enters_POM(String userName, String password) {
		loginPageWebElements.getUserName(userName);
		loginPageWebElements.getPassword(password);
		BrowserUtilities.sleep(2000);

	}

}
