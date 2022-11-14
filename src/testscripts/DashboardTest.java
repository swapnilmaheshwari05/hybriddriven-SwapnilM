package testscripts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.PredefinedActions;
import pages.DashboardPage;
import utility.PropertyFileOperations;

public class DashboardTest extends TestBase {

	@Test
	public void verifyWidgetsCountandText() {
		DashboardPage dashboardPage = new DashboardPage();
		System.out.println("VERIFY-Number of widgets on dashboard page");
		int totalWidgets = dashboardPage.getNumberOfWidgets();

		Assert.assertEquals(totalWidgets, 9,
				"Total widgets was not displayed as expected , as it is expected 9, however actual widgets displayed"
						+ totalWidgets);

		List<String> listOfExpectedWidgetsText = new ArrayList<String>(
				Arrays.asList("Quick Access", "Buzz Latest Posts","My Actions","Latest Documents","Latest News",
						"Employees on Leave Today","Time At Work","Headcount by Location","COVID-19 Report"));
		
		//System.out.println(listOfExpectedWidgetsText);

		System.out.println("STEP- Get list of all widgets");
		List<String> listOfActualWidgetsText = dashboardPage.getAllWidgetsText();
		//System.out.println(listOfActualWidgetsText);
		System.out.println("VERIY - text of all widgets");
		Assert.assertEquals(listOfActualWidgetsText, listOfExpectedWidgetsText);

	}

}
