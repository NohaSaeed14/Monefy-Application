package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends Elements {
	
	// variables
	private AppiumDriver driver;

	// locators
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.TextView")
	AndroidElement selectedViewOption;

	@AndroidFindBy(id = "income_button")
	AndroidElement addIncome;

	@AndroidFindBy(id = "expense_button")
	AndroidElement addExpense;

	@AndroidFindBy(id = "balance_amount")
	AndroidElement balanceAmountDisplay;

	@AndroidFindBy(id = "overflow")
	AndroidElement openSettingsPanel;

	@AndroidFindBy(id = "categories_imagebutton")
	AndroidElement openCategories;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.TextView")
	AndroidElement selectOneCategory;

	@AndroidFindBy(id = "accounts_imagebutton")
	AndroidElement openAccounts;

	@AndroidFindBy(id = "imageButtonAddCategory")
	AndroidElement addAccountFromSettingsPanel;

	@AndroidFindBy(id = "currency_imagebutton")
	AndroidElement openCurrencies;

	@AndroidFindBy(id = "settings_imagebutton")
	AndroidElement openSettings;

	@AndroidFindBy(id = "clear_database_button")
	AndroidElement settingsClearDatabase;

	@AndroidFindBy(id = "message")
	AndroidElement clearDatabaseWarningMessage;

	@AndroidFindBy(id = "button1")
	AndroidElement clearDatabaseWarningMessageOkBtn;

	@AndroidFindBy(id = "button2")
	AndroidElement clearDatabaseWarningMessageCancelBtn;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Open navigation']")
	AndroidElement openViewPanel;

	@AndroidFindBy(id = "income_amount_text")
	AndroidElement incomeAmountDisplay;

	@AndroidFindBy(id = "expense_amount_text")
	AndroidElement expenseAmountDisplay;

	@AndroidFindBy(id = "leftLinesImageView")
	AndroidElement viewDetails;

	@AndroidFindBy(id = "day_period_button")
	AndroidElement selectViewByDays;

	@AndroidFindBy(id = "month_period_button")
	AndroidElement selectViewByMonth;

	@AndroidFindBy(id = "pts_main")
	AndroidElement pieGraphHome;

	// constructor
	public HomePage(AppiumDriver appiumDriver) {
		super(appiumDriver);
	}

	// keywords / actions
	public void clickAddIncome() {
		clickElement(addIncome);
	}

	public void waitForIncomeDisplay() {
		waitForElementVisibility(incomeAmountDisplay);
	}

	public void clickBalanceAmount() {
		clickElement(balanceAmountDisplay);
	}

	public void waitForBalanceDisplay() {
		waitForElementVisibility(balanceAmountDisplay);
	}

	public void clickAddExpenses() {
		clickElement(addExpense);
	}

	public void openSettingsPanel() {
		clickElement(openSettingsPanel);
	}

	public void clickAccounts() {
		clickElement(openAccounts);
	}

	public void clickAddAccountPlusBtn() {
		clickElement(addAccountFromSettingsPanel);
	}

	public void clickPieGraph() {
		clickElement(pieGraphHome);
	}

	public void leftLinePanelOpen() {
		clickElement(viewDetails);
	}

	public void clickCategories() {
		clickElement(openCategories);
	}

	public void clickExistingCategory() {
		clickElement(selectOneCategory);
	}

	public void clickLeftViewPanel() {
		clickElement(openViewPanel);
	}

	public void selectViewByMonths() {
		clickElement(selectViewByMonth);
	}

	public void selectViewByDay() {
		clickElement(selectViewByDays);
	}
}
