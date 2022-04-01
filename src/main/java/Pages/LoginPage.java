package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    private AndroidDriver driver;

    private By getstarted =By.id("com.flickr.android:id/activity_welcome_sign_button");
    private By gotologPage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText");

    private By nextBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
    private By enterpass = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText");
    private By signInbtn =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");



    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickgetStarted(){
        driver.findElement(getstarted).click();
    }

    public void setGotologPage(String email){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(gotologPage).sendKeys(email);
    }

    public void setNextBtn(){
        driver.findElement(nextBtn).click();
    }

    public void setEnterpass(String pass){
        driver.findElement(enterpass).sendKeys(pass);
    }

    public void setSignInbtn(){
        driver.findElement(signInbtn).click();
    }
}
