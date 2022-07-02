package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NewIncomePage extends Elements {
	// variables
	private AppiumDriver driver;

	// locators
	HomePage homepage;
	ElementUtilities elementUtilities;

	@AndroidFindBy(id = "amount_text")
	AndroidElement newIncomeEntryField;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
	AndroidElement backHomeFromNewIncomeBtn;

	@AndroidFindBy(id = "textViewDate")
	AndroidElement selectDateNewIncome;

	@AndroidFindBy(id = "keyboard_action_button")
	AndroidElement chooseCategoryNewIncome;

	@AndroidFindBy(id = "buttonKeyboardClear")
	AndroidElement deleteEntryNewIncome;

	@AndroidFindBy(id = "buttonKeyboard0")
	AndroidElement enterNumberZeroNewIncome;

	@AndroidFindBy(id = "buttonKeyboard1")
	AndroidElement enterNumberOneNewIncome;

	@AndroidFindBy(id = "buttonKeyboard2")
	AndroidElement enterNumberTwoNewIncome;

	@AndroidFindBy(id = "buttonKeyboard3")
	AndroidElement enterNumberThreeNewIncome;

	@AndroidFindBy(id = "buttonKeyboard4")
	AndroidElement enterNumberFourNewIncome;

	@AndroidFindBy(id = "buttonKeyboard5")
	AndroidElement enterNumberFiveNewIncome;

	@AndroidFindBy(id = "buttonKeyboard6")
	AndroidElement enterNumberSixNewIncome;

	@AndroidFindBy(id = "buttonKeyboard7")
	AndroidElement enterNumberSevenNewIncome;

	@AndroidFindBy(id = "buttonKeyboard8")
	AndroidElement enterNumberEightNewIncome;

	@AndroidFindBy(id = "buttonKeyboard9")
	AndroidElement enterNumberNineNewIncome;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ImageView")
	AndroidElement selectSalaryCategory;

	@AndroidFindBy(id = "delete")
	AndroidElement deleteIncomeBtn;

	// constructor
	public NewIncomePage(AppiumDriver appiumDriver) {
		super(appiumDriver);
	}

	// keywords / actions
	public void clickNumberButton(int number) {
		switch (number) {
		case 0:
			clickElement(enterNumberZeroNewIncome);
			break;
		case 1:
			clickElement(enterNumberOneNewIncome);
			break;
		case 2:
			clickElement(enterNumberTwoNewIncome);
			break;
		case 3:
			clickElement(enterNumberThreeNewIncome);
			break;
		case 4:
			clickElement(enterNumberFourNewIncome);
			break;
		case 5:
			clickElement(enterNumberFiveNewIncome);
			break;
		case 6:
			clickElement(enterNumberSixNewIncome);
			break;
		case 7:
			clickElement(enterNumberSevenNewIncome);
			break;
		case 8:
			clickElement(enterNumberEightNewIncome);
			break;
		case 9:
			clickElement(enterNumberNineNewIncome);
			break;
		}
	}

	public void clickChooseCategory() {
		clickElement(chooseCategoryNewIncome);
	}

	public void clickSalaryCategory() {
		clickElement(selectSalaryCategory);
	}

	public void clearIncomeEntryField(int numDigits) {
		for (int i = 0; i < numDigits; i = i + 1) {
			clickElement(deleteEntryNewIncome);
		}
	}

	public void clickBackButton() {
		clickElement(backHomeFromNewIncomeBtn);
	}

	public void clickDeleteBtn() {
		clickElement(deleteIncomeBtn);
	}
}