package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWebElements {
	private WebDriver driver;

	@FindBy(className = "ups-loginsignup")
	private WebElement loginLink;

	@FindBy(name = "userID")
	private WebElement userIdElement;

	@FindBy(name = "password")
	private WebElement passwordElement;

	@FindBy(linkText = "Log in")
	private WebElement clickLOgin;

	public LoginPageWebElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public void getloginLink() {
		loginLink.click();
	}

	public void clickonLoginLink() {
		if(clickLOgin.isDisplayed()) {
			clickLOgin.click();
		} else {
			System.out.println("not displayed");
		}
		
	}

	public void getUserName(String userName) {
		userIdElement.sendKeys(userName);
	}

	public void getPassword(String password) {
		passwordElement.sendKeys(password);
	}

}
