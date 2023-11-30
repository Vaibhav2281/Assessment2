package Mobile.Assessment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class Insta1 {

//Write script to register on instagram and register with valid data get screenshot after successfully registration
	
	@Test
	public void register() throws MalformedURLException, InterruptedException {
		
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
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Create new account\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.google.android.gms:id/cancel")).click();
		Thread.sleep(2000);
		
		WebElement name = driver.findElement(By.className("android.widget.EditText"));
		name.click();
		name.sendKeys("Vaibhav");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Next\"]/android.view.ViewGroup")).click();
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.className("android.widget.EditText"));
		pass.click();
		pass.sendKeys("Vaib@12@178");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Next\"]/android.view.ViewGroup")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Not now\"]/android.view.ViewGroup")).click();
		Thread.sleep(2000);
		
		for(int i=2022; i>1991; i--)
		{	
			if (i>=1992) {
				WebElement date = driver.findElement(By.xpath("//android.widget.Button[@text='"+i+"']"));
				date.click();			
			}
		}
		
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Next\"]/android.view.ViewGroup")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Next\"]/android.view.ViewGroup")).click();
		Thread.sleep(2000);
		
		WebElement mobile = driver.findElement(By.className("android.widget.EditText"));
		mobile.click();
		mobile.sendKeys("8460575181");
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Next\"]/android.view.ViewGroup")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("android.widget.ImageView")).click();
		Thread.sleep(2000);
		
		
		
		//driver.quit();
	}
}
