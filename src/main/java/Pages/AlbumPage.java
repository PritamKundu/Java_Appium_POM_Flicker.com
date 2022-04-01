package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AlbumPage {

    private AndroidDriver driver;
    private By album= By.xpath("(//android.widget.TextView)[7]");

    public AlbumPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void setAlbum(){
        driver.findElement(album).click();
    }

}
