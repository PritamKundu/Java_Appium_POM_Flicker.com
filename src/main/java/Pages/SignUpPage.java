package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class SignUpPage {

    AndroidDriver driver;

    private By getstarted = By.id("com.flickr.android:id/activity_welcome_sign_button");
    private By clickSignUp = By.xpath("//android.view.View[@content-desc=\"Sign up here.\"]/android.widget.TextView");
    private By firstName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.EditText");
    private By lastName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.EditText");
    private By age = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.widget.EditText");
    private By email_add = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.view.View/android.widget.EditText");
    private By password = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[5]/android.view.View/android.widget.EditText");
    private By clickSignupBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");


    public SignUpPage(AndroidDriver driver){
        this.driver = driver;
    }

    public void setGetstarted(){
        driver.findElement(getstarted).click();
    }

    public void setClickSignUp(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(clickSignUp).click();
    }

    public void setFirst_name(String first_name){
        driver.findElement(firstName).sendKeys(first_name);
    }

    public void setLastName(String last_name){
        driver.findElement(lastName).sendKeys(last_name);
    }

    public void setAge(String ag) {
        driver.findElement(age).sendKeys(ag);
    }

    public void setEmail_add(String emailadd){
        driver.findElement(email_add).sendKeys(emailadd);
    }

    public void setPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }

    public void setClickSignupBtn(){
        driver.findElement(clickSignupBtn).click();
    }

}
