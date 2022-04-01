package Tests;

import Base.Base;
import Pages.LoginPage;
import Pages.TrackViewsPage;
import org.testng.annotations.Test;

public class TrackViewsTest extends Base {


    @Test
    public void trackViews(){

//        for login
        LoginPage loginPage = homePage.ckickOnlogin();
        loginPage.clickgetStarted();
        loginPage.setGotologPage("marazislam8@gmail.com");
        loginPage.setNextBtn();
        loginPage.setEnterpass("TestCase0101");
        loginPage.setSignInbtn();

//        for track
        TrackViewsPage trackViewsPage = homePage.trackViewsPage();
        trackViewsPage.setClickProfile();
        trackViewsPage.setClickstats();
    }

}
