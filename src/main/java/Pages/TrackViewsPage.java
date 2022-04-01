package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class TrackViewsPage {

    private AndroidDriver driver;

    private By clickProfile = By.id("com.flickr.android:id/fragment_navigation_profile");
    private By clickstats = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[2]");


    public TrackViewsPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void setClickProfile(){
        driver.findElement(clickProfile).click();
    }

    public void setClickstats(){
        driver.findElement(clickstats).click();
    }

}
