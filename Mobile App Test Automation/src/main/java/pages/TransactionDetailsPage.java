package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * This class contains the element finders and element actions for Transaction
 * Details Page
 **/
public class TransactionDetailsPage extends Elements {
	// variables
	private AppiumDriver driver;

	// locators
	@AndroidFindBy(id = "textViewCategoryName")
	MobileElement transactionCategory;

	@AndroidFindBy(id = "textViewTransactionAmount")
	MobileElement transactionAmount;

	@AndroidFindBy(id = "balance_amount")
	AndroidElement balanceAmountDisplay;

	@AndroidFindBy(id = "leftLinesImageView")
	AndroidElement viewDetails;

	// constructor
	public TransactionDetailsPage(AppiumDriver appiumDriver) {
		super(appiumDriver);
	}

	// keywords / actions
	public void clickTransactionCategory() {
		clickElement(transactionCategory);
	}

	public void clickTransactionAmount() {
		clickElement(transactionAmount);
	}

	public void clickBalanceAmount() {
		clickElement(balanceAmountDisplay);
	}

	public void clickLeftViewPanel() {
		clickElement(viewDetails);
	}
}