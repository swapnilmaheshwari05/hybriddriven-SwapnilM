package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class PredefinedActions {
	
	protected static  WebDriver driver;
	
	public static void start(String url) {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver_106.exe>>>>>>>>>>");
		System.out.println("...................................");
		System.out.println("Step - Launch chrome browser");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	public static void closeBrowser() {
		driver.close();
	}
	public static void closeAllBrowser() {
		driver.quit();
	}

}
