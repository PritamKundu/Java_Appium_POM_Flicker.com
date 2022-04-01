package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class PersonalInfoPage {

    private AndroidDriver driver;

    public By clickProfile = By.id("com.flickr.android:id/fragment_navigation_profile");
    public By clickThreeDot = By.id("com.flickr.android:id/profile_header_overflow");
    public By clickonabout = By.id("com.flickr.android:id/profile_settings_about");

    public PersonalInfoPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void setClickProfile(){
        driver.findElement(clickProfile).click();
    }

    public void setClickThreeDot(){
        driver.findElement(clickThreeDot).click();
    }

    public void setClickonabout(){
        driver.findElement(clickonabout).click();
    }


}
