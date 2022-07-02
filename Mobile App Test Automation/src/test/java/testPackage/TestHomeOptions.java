package testPackage;

import org.testng.annotations.Test;

import pages.HomePage;

public class TestHomeOptions extends TestBase {
	HomePage homePage;

	/**
	 * Test viewing of homepage with different options like day/month
	 */
	@Test
	public void viewOptions() throws Exception {
		setup();
		homePage = new HomePage(driver);
		homePage.clickLeftViewPanel();
		homePage.selectViewByDay();
		homePage.clickLeftViewPanel();
		homePage.selectViewByMonths();
		teardown();
	}
}
