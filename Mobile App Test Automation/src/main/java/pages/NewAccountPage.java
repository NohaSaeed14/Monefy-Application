package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NewAccountPage extends Elements {

	// variables
	private AppiumDriver driver;

	// locators
	@AndroidFindBy(id = "editTextCategoryName")
	AndroidElement newAccountNameField;

	@AndroidFindBy(id = "initialAmount")
	AndroidElement newAccountInitialAmount;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ImageView")
	AndroidElement newAccountAmexIcon;

	@AndroidFindBy(id = "save")
	AndroidElement newAccountAddButton;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
	AndroidElement backHomeFromNewAccountBtn;

	@AndroidFindBy(id = "delete")
	AndroidElement deleteAccountBtn;

	@AndroidFindBy(id = "android:id/button1")
	AndroidElement deleteAccountWarningMessageOkBtn;

	// constructor
	public NewAccountPage(AppiumDriver appiumDriver) {
		super(appiumDriver);
	}

	// keywords / actions
	public void enterAccountName(String credit) {
		sendElementText(newAccountNameField, credit);
	}

	public void selectAccountIcon() {
		clickElement(newAccountAmexIcon);
	}

	public void clickAddAccountBtn() {
		clickElement(newAccountAddButton);
	}

	public void enterAccountInitialAmt(String initialAmt) {
		sendElementText(newAccountInitialAmount, initialAmt);
	}

	public void clickBackButton() {
		clickElement(backHomeFromNewAccountBtn);
	}

	public void clickDeleteBtn() {
		clickElement(deleteAccountBtn);
	}

	public void clickDeleteConfirmBtn() {
		clickElement(deleteAccountWarningMessageOkBtn);
	}
}