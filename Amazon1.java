package Mobile.Assessment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class Amazon1 {

	//Write script to login with valid and invalid data.
	
	@Test
	public void login() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Xiaomi Redmi K20 Pro");
		cap.setCapability("udid", "501488a7");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11.0");
		cap.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		cap.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
		cap.setCapability("automationName", "UIAutomator2");
		
		@SuppressWarnings("deprecation")
		URL url = new URL("http://127.0.0.1:4723/");
		AppiumDriver driver = new AppiumDriver(url, cap);
		
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Select English\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("in.amazon.mShop.android.shopping:id/continue_button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("in.amazon.mShop.android.shopping:id/sign_in_button")).click();
		Thread.sleep(2000);
		
		WebElement mail = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget"
		+".LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android"
				+".webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view"
		+".View[2]/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText"));
		mail.click();
		mail.sendKeys("vaibhav.badheka@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
		+"android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit"
				+".WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]"
		+"/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
		+"android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit."
				+"WebView/android.view.View/android.view.View[3]/android.view.View[1]/android.widget"
		+".EditText")).sendKeys("12345678910");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"
		+"/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit"
				+".WebView/android.view.View/android.view.View[3]/android.view.View[4]/android.widget"
		+".Button")).click();
		Thread.sleep(5000);
		driver.quit();
		
AppiumDriver driver1 = new AppiumDriver(url, cap);
		
		driver1.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Select English\"]")).click();
		Thread.sleep(3000);
		
		driver1.findElement(By.id("in.amazon.mShop.android.shopping:id/continue_button")).click();
		Thread.sleep(2000);
		
		driver1.findElement(By.id("in.amazon.mShop.android.shopping:id/sign_in_button")).click();
		Thread.sleep(2000);
		
		WebElement mail1 = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget"
		+".LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android"
				+".webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view"
		+".View[2]/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText"));
		mail1.click();
		mail1.sendKeys("vaibhav.badheka@gmail.com");
		Thread.sleep(2000);
		
		driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
		+"android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit"
				+".WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]"
		+"/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")).click();
		Thread.sleep(2000);
		
		driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
		+"android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit."
				+"WebView/android.view.View/android.view.View[3]/android.view.View[1]/android.widget"
		+".EditText")).sendKeys("*********");
		Thread.sleep(2000);
		
		driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"
		+"/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit"
				+".WebView/android.view.View/android.view.View[3]/android.view.View[4]/android.widget"
		+".Button")).click();
		Thread.sleep(5000);
		driver1.quit();
		
	}
}
