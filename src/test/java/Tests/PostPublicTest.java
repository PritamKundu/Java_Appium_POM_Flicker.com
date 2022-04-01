package Tests;

import Base.Base;
import Pages.LoginPage;
import Pages.PostPublicPage;
import Pages.TrackViewsPage;
import org.testng.annotations.Test;

public class PostPublicTest extends Base {

    @Test
    public void postPublic(){
//        for login
        LoginPage loginPage = homePage.ckickOnlogin();
        loginPage.clickgetStarted();
        loginPage.setGotologPage("marazislam8@gmail.com");
        loginPage.setNextBtn();
        loginPage.setEnterpass("TestCase0101");
        loginPage.setSignInbtn();

//        for click on profile icon
        TrackViewsPage trackViewsPage = homePage.trackViewsPage();
        trackViewsPage.setClickProfile();

//        for click on post public
        PostPublicPage postPublicPage = homePage.postPublicPage();
        postPublicPage.setClickOnpublic();

    }

}
