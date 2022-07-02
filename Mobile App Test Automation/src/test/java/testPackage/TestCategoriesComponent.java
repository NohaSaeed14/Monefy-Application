package testPackage;

import org.testng.annotations.Test;

import pages.EditCategoryPage;
import pages.HomePage;

public class TestCategoriesComponent extends TestBase {
	HomePage homePage;
	EditCategoryPage editCategoryPage;

	/**
	 * @throws Exception Verify that user is able to edit a category
	 */
	@Test
	public void editCategory() throws Exception {
		setup();
		homePage = new HomePage(driver);
		editCategoryPage = new EditCategoryPage(driver);
		homePage.openSettingsPanel();
		homePage.clickCategories();
		homePage.clickExistingCategory();
		editCategoryPage.editCategoryName("Edited");
		editCategoryPage.clickBackButton();
		teardown();
	}

	/**
	 * @throws Exception Verify that user is able to delete a category
	 */
	@Test(dependsOnMethods = { "editCategory" })
	public void deleteCategory() throws Exception {
		setup();
		homePage = new HomePage(driver);
		editCategoryPage = new EditCategoryPage(driver);
		homePage.openSettingsPanel();
		homePage.clickCategories();
		homePage.clickExistingCategory();
		editCategoryPage.deleteCategory();
		editCategoryPage.clickDeleteConfirmBtn();
		teardown();
	}

}