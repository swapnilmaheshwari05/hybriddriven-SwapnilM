package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.PredefinedActions;

public class LoginPage extends PredefinedActions  {
	
	public void login(String username , String password) {
		enterUsername(username);
		enterPassword(password);
		clickOnLoginBtn();
	}
	
	public void enterUsername(String username) {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		
	}
	
	public void clickOnLoginBtn() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public boolean isUsernameErrorMessage() {
		WebElement usernameErrorMessage=driver.findElement(By.cssSelector("#txtUsername-error"));
		return usernameErrorMessage.isDisplayed();
	}
	
	public boolean isPasswordErrorMessage() {
		WebElement passwordErrorMessage =driver.findElement(By.cssSelector("#txtPassword-error"));
		return passwordErrorMessage.isDisplayed();
	}
	
	public boolean isLogoDisplayed() {
		return driver.findElement(By.cssSelector("div.organization-logo.shadow>img")).isDisplayed();
		
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
}
