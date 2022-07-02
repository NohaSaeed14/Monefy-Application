package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.NewExpensePage;
import pages.TransactionDetailsPage;

public class TestExpensesComponent extends TestBase {
	HomePage homePage;
	NewExpensePage newExpensesPage;
	TransactionDetailsPage viewTransactionDetailsPage;

	/**
	 * @throws Exception Verify the addition of a new expense
	 */
	@Test
	public void addNewExpense() throws Exception {
		setup();
		homePage = new HomePage(driver);
		newExpensesPage = new NewExpensePage(driver);
		viewTransactionDetailsPage = new TransactionDetailsPage(driver);
		homePage.clickAddExpenses();
		newExpensesPage.clickExpensesNumberButton(1);
		newExpensesPage.clickExpensesNumberButton(0);
		newExpensesPage.clickExpensesNumberButton(0);
		newExpensesPage.clickChooseCategory();
		newExpensesPage.clickCarCategory();
		homePage.waitForIncomeDisplay();

		Assert.assertEquals(homePage.balanceAmountDisplay.getText(), "Balance -$100.00");
		Assert.assertEquals(homePage.incomeAmountDisplay.getText(), "$0.00");
		Assert.assertEquals(homePage.expenseAmountDisplay.getText(), "$100.00");
	}

	/**
	 * Verify editing of an existing expense
	 */
	@Test(dependsOnMethods = { "addNewExpense" })
	public void editExpense() {
		homePage = new HomePage(driver);
		newExpensesPage = new NewExpensePage(driver);
		viewTransactionDetailsPage = new TransactionDetailsPage(driver);
		homePage.clickBalanceAmount();
		viewTransactionDetailsPage.clickTransactionCategory();
		viewTransactionDetailsPage.clickTransactionAmount();
		newExpensesPage.clearExpensesEntryField(3);
		newExpensesPage.clickExpensesNumberButton(5);
		newExpensesPage.clickExpensesNumberButton(0);
		newExpensesPage.clickBackButton();
		homePage.waitForBalanceDisplay();

		Assert.assertEquals(homePage.balanceAmountDisplay.getText(), "Balance -$50.00");
	}

	/**
	 * Verify deleting of an existing expense
	 */
	@Test(dependsOnMethods = { "addNewExpense", "editExpense" })
	public void deleteExpense() {
		viewTransactionDetailsPage.clickTransactionCategory();
		viewTransactionDetailsPage.clickTransactionAmount();
		newExpensesPage.clickDeleteBtn();
		homePage.waitForBalanceDisplay();
		homePage.clickBalanceAmount();
		homePage.waitForIncomeDisplay();

		Assert.assertEquals(homePage.balanceAmountDisplay.getText(), "Balance $0.00");
		Assert.assertEquals(homePage.incomeAmountDisplay.getText(), "$0.00");
		Assert.assertEquals(homePage.expenseAmountDisplay.getText(), "$0.00");
		teardown();
	}
}