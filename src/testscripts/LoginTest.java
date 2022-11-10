package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.PredefinedActions;
import pages.LoginPage;

public class LoginTest {
	
	@Test
	public void tc1() {
		System.out.println("STEP - Launch chrome browser and hit url");
		PredefinedActions.start("https://swapnilm-trials77.orangehrmlive.com/auth/login");
		
		System.out.println("STEP- Enter valid credential");
		LoginPage loginPage=new LoginPage();
		loginPage.login("admin","PUyF6Va6@k");
		
		System.out.println("VERIFY - Home page is displayed");
		String actualTitle=loginPage.getPageTitle();
		String expectedTitle="Employee Management";
		
		Assert.assertEquals(actualTitle, expectedTitle ,"Login failed"+expectedTitle +"but actual title is"+actualTitle);
		
		PredefinedActions.closeBrowser();
		
	}

}
