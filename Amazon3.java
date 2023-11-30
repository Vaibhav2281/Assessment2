package Mobile.Assessment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class Amazon3 {

	//Write script to search product and add into cart
	
	@SuppressWarnings("deprecation")
	@Test
	public void cart() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Xiaomi Redmi K20 Pro");
		cap.setCapability("udid", "501488a7");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11.0");
		cap.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		cap.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
		cap.setCapability("automationName", "UIAutomator2");
		
		URL url = new URL("http://127.0.0.1:4723/");
		AppiumDriver driver = new AppiumDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("in.amazon.mShop.android.shopping:id/sso_continue")).click();
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.xpath("(//android.widget.LinearLayout[@content-desc=\""
		+"Search\"])[1]/android.widget.LinearLayout/android.widget.TextView"));
		search.click();
		WebElement text = driver.findElement(By.id("in.amazon.mShop.android.shopping:id/rs_search_src_text"));
		text.sendKeys("Mouse");

        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER);
        action.perform();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)"
		+".instance(0)).scrollIntoView(new UiSelector().textContains(\"Zebronics Zeb-Power Wired USB Mouse,"
				+" 3-Button, 1200 DPI Optical Sensor, Plug & Play, for Windows/Mac\").instance(0))"));
		
		driver.findElement(By.xpath("(//android.view.View[@content-desc=\"Zebronics Zeb-Power Wired USB Mouse"
		+", 3-Button, 1200 DPI Optical Sensor, Plug & Play, for Windows/Mac\"])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)."
		+"instance(0)).scrollIntoView(new UiSelector().textContains(\"Add to Cart  \").instance(0))"));

		driver.findElement(By.xpath("//android.widget.Button[@text='Add to Cart  ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text='Proceed to checkout']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
