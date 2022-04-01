package Pages;

import io.appium.java_client.android.AndroidDriver;

public class HomePage{

    private final AndroidDriver driver;

    public HomePage(AndroidDriver driver){
        this.driver = driver;
    }

    public LoginPage ckickOnlogin(){
        return new LoginPage(driver);
    }

    public SignUpPage clickOnSignUp(){return new SignUpPage(driver);}

    public SearchPage searchPage(){return new SearchPage(driver);}

    public PersonalInfoPage personalInfoPage(){return new PersonalInfoPage(driver);}

    public TrackViewsPage trackViewsPage(){return new TrackViewsPage(driver);}

    public PostPublicPage postPublicPage(){
        return new PostPublicPage(driver);
    }

    public AlbumPage albumPage(){
        return new AlbumPage(driver);
    }

    public GroupPage groupPage(){return new GroupPage(driver);}

}
