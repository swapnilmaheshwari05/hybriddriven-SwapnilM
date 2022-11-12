package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.PredefinedActions;

public class LoginPage extends PredefinedActions {
	
	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement userNameElement;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement passwordElement;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitBtn;
	
	@FindBy(css="div.organization-logo.shadow>img")
	private WebElement logo;
	
	@FindBy(css="#txtUsername-error")
	private WebElement txtUsernameErrorElement;
	
	@FindBy(css="#txtPassword-error")
	private WebElement passwordErrorElement;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickOnLoginBtn();
	}

	public void enterUsername(String username) {
		//driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		
		//WebElement e=getElement("xpath", "//input[@id='txtUsername']", false);
		//setText(e,username);
		
		//setText("xpath", "//input[@id='txtUsername']", false,username);
		
		//userNameElement.sendKeys(username);
		
		setText(userNameElement,username);

	}

	public void enterPassword(String password) {
		//driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		
		setText(passwordElement,password);

	}

	public void clickOnLoginBtn() {
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		clickOnElement(submitBtn, false);
	}

	public boolean isUsernameErrorMessage() {
		return isElementDisplayed(txtUsernameErrorElement);
	}

	public boolean isPasswordErrorMessage() {
		return isElementDisplayed(passwordErrorElement);
	}

	public boolean isLogoDisplayed() {
		return isElementDisplayed(logo);

	}

	
}
