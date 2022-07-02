package testPackage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class TestBase {

	public static AppiumDriver driver;

	@BeforeTest
	public void setup() throws Exception {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Noha");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.monefy.activities.main.MainActivity");
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.monefy.app.lite");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}