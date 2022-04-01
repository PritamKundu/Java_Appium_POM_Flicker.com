package Base;

import Pages.HomePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {

    AndroidDriver driver;
    protected HomePage homePage;

    @BeforeTest
    public void setDriver() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("automationName","UiAutomator2");
        cap.setCapability("platformName","Android");
        cap.setCapability("deviceName","Galaxy S9 plus");
        cap.setCapability("app","E:\\apk\\flickr.apk");
        cap.setCapability("udid","2220c33e10037ece");
        cap.setCapability("platformVersion","9 ");
        cap.setCapability("appPackage","com.flickr.android");
        cap.setCapability("appActivity","com.yahoo.mobile.client.android.flickr.ui.misc.LoginActivity");


        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);

        homePage = new HomePage(driver);

//        driver.quit();

    }

}
