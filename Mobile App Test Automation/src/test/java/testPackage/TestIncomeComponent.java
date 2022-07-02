package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.NewIncomePage;
import pages.TransactionDetailsPage;

public class TestIncomeComponent extends TestBase {
	HomePage homePage;
	NewIncomePage newIncomePage;
	TransactionDetailsPage viewTransactionDetailsPage;

	/**
	 * @throws Exception Verify that user is able to add a new income
	 */
	@Test
	public void addNewIncome() throws Exception {
		setup();
		homePage = new HomePage(driver);
		newIncomePage = new NewIncomePage(driver);
		viewTransactionDetailsPage = new TransactionDetailsPage(driver);
		homePage.clickAddIncome();
		newIncomePage.clickNumberButton(1);
		newIncomePage.clickNumberButton(0);
		newIncomePage.clickNumberButton(0);
		newIncomePage.clickChooseCategory();
		newIncomePage.clickSalaryCategory();
		homePage.waitForIncomeDisplay();

		Assert.assertEquals(homePage.balanceAmountDisplay.getText(), "Balance $100.00");
		Assert.assertEquals(homePage.incomeAmountDisplay.getText(), "$100.00");
		Assert.assertEquals(homePage.expenseAmountDisplay.getText(), "$0.00");
	}

	/**
	 * Verify user is able to edit an existing income
	 */
	@Test(dependsOnMethods = { "addNewIncome" })
	public void editIncome() {
		homePage.clickBalanceAmount();
		viewTransactionDetailsPage.clickTransactionCategory();
		viewTransactionDetailsPage.clickTransactionAmount();
		newIncomePage.clearIncomeEntryField(3);
		newIncomePage.clickNumberButton(5);
		newIncomePage.clickNumberButton(0);
		newIncomePage.clickBackButton();
		homePage.waitForBalanceDisplay();

		Assert.assertEquals(homePage.balanceAmountDisplay.getText(), "Balance $50.00");

	}

	/**
	 * Verify user is able to delete an income
	 */
	@Test(dependsOnMethods = { "addNewIncome", "editIncome" })
	public void deleteIncome() {
//        homePage.clickBalanceAmount();
		viewTransactionDetailsPage.clickTransactionCategory();
		viewTransactionDetailsPage.clickTransactionAmount();
		newIncomePage.clickDeleteBtn();
		homePage.waitForBalanceDisplay();
		homePage.clickBalanceAmount();
		homePage.waitForIncomeDisplay();

		Assert.assertEquals(homePage.balanceAmountDisplay.getText(), "Balance $0.00");
		Assert.assertEquals(homePage.incomeAmountDisplay.getText(), "$0.00");
		Assert.assertEquals(homePage.expenseAmountDisplay.getText(), "$0.00");
		teardown();
	}
}