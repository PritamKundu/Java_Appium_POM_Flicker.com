package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class PostPublicPage {

    private AndroidDriver driver;
    private By clickOnpublic = By.xpath("(//android.widget.TextView)[8]");

    public PostPublicPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void setClickOnpublic(){
        driver.findElement(clickOnpublic).click();
    }


}
