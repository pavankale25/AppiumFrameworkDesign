package FrameworkDesign;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.BeforeMethod;

import GeneralStore_main.FormPage;

import org.testng.annotations.BeforeClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
	public AndroidDriver driver;
	public FormPage formp;
	@BeforeClass
	public void setup() throws MalformedURLException {
		UiAutomator2Options option = new UiAutomator2Options();
		option.setChromedriverExecutable("C:\\Users\\IPS-52\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		option.setDeviceName("AndroidEmulator");
		option.setApp("E:\\Java_Program\\Appium\\src\\test\\java\\resources\\General-Store.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		formp = new FormPage(driver);        
	}
	
	
	

}
