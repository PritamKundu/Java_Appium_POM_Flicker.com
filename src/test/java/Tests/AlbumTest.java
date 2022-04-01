package Tests;

import Base.Base;
import Pages.AlbumPage;
import Pages.LoginPage;
import Pages.TrackViewsPage;
import org.testng.annotations.Test;

public class AlbumTest extends Base {

    @Test
    public void album(){

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

//        click on album
        AlbumPage albumPage = homePage.albumPage();
        albumPage.setAlbum();
    }

}
