package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.NewExpensePage;
import pages.NewIncomePage;
import pages.TransactionDetailsPage;

public class TestE2EMoneyFlow extends TestBase {

	HomePage homePage;
	NewExpensePage newExpensesPage;
	NewIncomePage newIncomePage;
	TransactionDetailsPage viewTransactionDetailsPage;

	/**
	 * @throws Exception Verify the E2E flow of a user adding an income, expense and
	 *                   verifying the values are correctly
	 */
	@Test
	public void testE2EFlow() throws Exception {
		setup();
		homePage = new HomePage(driver);
		newExpensesPage = new NewExpensePage(driver);
		newIncomePage = new NewIncomePage(driver);
		viewTransactionDetailsPage = new TransactionDetailsPage(driver);
		homePage.clickAddExpenses();
		newExpensesPage.clickExpensesNumberButton(5);
		newExpensesPage.clickExpensesNumberButton(0);
		newExpensesPage.clickExpensesNumberButton(0);
		newExpensesPage.clickChooseCategory();
		newExpensesPage.clickCarCategory();
		homePage.waitForIncomeDisplay();
		homePage.clickAddIncome();
		newIncomePage.clickNumberButton(1);
		newIncomePage.clickNumberButton(0);
		newIncomePage.clickNumberButton(0);
		newIncomePage.clickChooseCategory();
		newIncomePage.clickSalaryCategory();
		homePage.waitForIncomeDisplay();

		Assert.assertEquals(homePage.balanceAmountDisplay.getText(), "Balance -$400.00");
		Assert.assertEquals(homePage.incomeAmountDisplay.getText(), "$100.00");
		Assert.assertEquals(homePage.expenseAmountDisplay.getText(), "$500.00");
		teardown();
	}
}