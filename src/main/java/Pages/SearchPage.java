package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SearchPage {

    private AndroidDriver driver;

    private By shareBtn = By.id("com.flickr.android:id/fragment_navigation_search");
    private By clickSharetoggle =By.id("com.flickr.android:id/fragment_navigation_search_bar");
    private By searchbook = By.id("com.flickr.android:id/search_view_autocompl_textview");

    public SearchPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void setShareBtn(){
        driver.findElement(shareBtn).click();
    }

    public void setClickSharetoggle(){
        driver.findElement(clickSharetoggle).click();
    }

    public void setSearchbook(String bookname){
        driver.findElement(searchbook).sendKeys(bookname);
    }

}
