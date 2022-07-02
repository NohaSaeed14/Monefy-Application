package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NewExpensePage extends Elements {
	// variables
	private AppiumDriver driver;

	// locators
	@AndroidFindBy(id = "amount_text")
	AndroidElement newExpensesEntryField;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
	AndroidElement backHomeFromNewExpensesBtn;

	@AndroidFindBy(id = "textViewDate")
	AndroidElement selectDateNewExpenses;

	@AndroidFindBy(id = "keyboard_action_button")
	AndroidElement chooseCategoryNewExpenses;

	@AndroidFindBy(id = "buttonKeyboardClear")
	AndroidElement deleteEntryNewExpenses;

	@AndroidFindBy(id = "buttonKeyboard0")
	AndroidElement enterNumberZeroNewExpenses;

	@AndroidFindBy(id = "buttonKeyboard1")
	AndroidElement enterNumberOneNewExpenses;

	@AndroidFindBy(id = "buttonKeyboard2")
	AndroidElement enterNumberTwoNewExpenses;

	@AndroidFindBy(id = "buttonKeyboard3")
	AndroidElement enterNumberThreeNewExpenses;

	@AndroidFindBy(id = "buttonKeyboard4")
	AndroidElement enterNumberFourNewExpenses;

	@AndroidFindBy(id = "buttonKeyboard5")
	AndroidElement enterNumberFiveNewExpenses;

	@AndroidFindBy(id = "buttonKeyboard6")
	AndroidElement enterNumberSixNewExpenses;

	@AndroidFindBy(id = "buttonKeyboard7")
	AndroidElement enterNumberSevenNewExpenses;

	@AndroidFindBy(id = "buttonKeyboard8")
	AndroidElement enterNumberEightNewExpenses;

	@AndroidFindBy(id = "buttonKeyboard9")
	AndroidElement enterNumberNineNewExpenses;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ImageView")
	AndroidElement selectCarCategory;

	@AndroidFindBy(id = "delete")
	AndroidElement deleteExpensesBtn;

	// constructor
	public NewExpensePage(AppiumDriver appiumDriver) {
		super(appiumDriver);
	}

	// keywords / actions
	public void clickExpensesNumberButton(int number) {
		switch (number) {
		case 0:
			clickElement(enterNumberZeroNewExpenses);
			break;
		case 1:
			clickElement(enterNumberOneNewExpenses);
			break;
		case 2:
			clickElement(enterNumberTwoNewExpenses);
			break;
		case 3:
			clickElement(enterNumberThreeNewExpenses);
			break;
		case 4:
			clickElement(enterNumberFourNewExpenses);
			break;
		case 5:
			clickElement(enterNumberFiveNewExpenses);
			break;
		case 6:
			clickElement(enterNumberSixNewExpenses);
			break;
		case 7:
			clickElement(enterNumberSevenNewExpenses);
			break;
		case 8:
			clickElement(enterNumberEightNewExpenses);
			break;
		case 9:
			clickElement(enterNumberNineNewExpenses);
			break;
		}
	}

	public void clickChooseCategory() {
		clickElement(chooseCategoryNewExpenses);
	}

	public void clickCarCategory() {
		clickElement(selectCarCategory);
	}

	public void clearExpensesEntryField(int numDigits) {
		for (int i = 0; i < numDigits; i = i + 1) {
			clickElement(deleteEntryNewExpenses);
		}
	}

	public void clickBackButton() {
		clickElement(backHomeFromNewExpensesBtn);
	}

	public void clickDeleteBtn() {
		clickElement(deleteExpensesBtn);
	}
}