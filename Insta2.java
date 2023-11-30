package Mobile.Assessment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class Insta2 {

	//Write script to login in instagram with valid and invalid data and generate report for result
	
	@Test
	public void login() throws MalformedURLException, InterruptedException {
		
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName", "Xiaomi Redmi K20 Pro");
	cap.setCapability("udid", "501488a7");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "11.0");
	cap.setCapability("appPackage", "com.instagram.android");
	cap.setCapability("appActivity", "com.instagram.mainactivity.LauncherActivity");
	cap.setCapability("automationName", "UIAutomator2");
	
	@SuppressWarnings("deprecation")
	URL url = new URL("http://127.0.0.1:4723/");
	AppiumDriver driver = new AppiumDriver(url, cap);
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Log in to another account\"]/android.view.ViewGroup")).click();
	Thread.sleep(2000);
	
	WebElement id = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android"
			+".widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view"
			+".ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget"
			+".FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view"
			+".ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view."
			+"ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view."
			+"ViewGroup/android.view.ViewGroup/android.widget.EditText"));
	id.clear();
	id.sendKeys("vaibhav.badheka");
	WebElement pass = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget"
	+".LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget"
			+".FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget"
	+".FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view."
			+"ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android"
	+".view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android"
			+".widget.EditText"));
	pass.clear();
	pass.sendKeys("Vaibhav@1");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Log In\"]/android.view.ViewGroup")).click();
	Thread.sleep(6000);
	driver.quit();
	
	AppiumDriver driver1 = new AppiumDriver(url, cap);
	driver1.findElement(By.xpath("//android.widget.Button[@content-desc=\"Log in to another account\"]/android.view.ViewGroup")).click();
	Thread.sleep(2000);
	
	WebElement id1 = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android"
			+".widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view"
			+".ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget"
			+".FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view"
			+".ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view."
			+"ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view."
			+"ViewGroup/android.view.ViewGroup/android.widget.EditText"));
	id1.clear();
	id1.sendKeys("vaibhav.badheka");
	WebElement pass1 = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget"
	+".LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget"
			+".FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget"
	+".FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view."
			+"ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android"
	+".view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android"
			+".widget.EditText"));
	pass1.clear();
	pass1.sendKeys("Vab@123@1");
	Thread.sleep(2000);
	driver1.findElement(By.xpath("//android.widget.Button[@content-desc=\"Log In\"]/android.view.ViewGroup")).click();
	Thread.sleep(4000);
	driver1.quit();
}
}
