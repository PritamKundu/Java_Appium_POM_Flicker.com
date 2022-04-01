package Tests;

import Base.Base;
import Pages.LoginPage;
import Pages.SearchPage;
import org.testng.annotations.Test;

public class SearchTest extends Base {


    @Test
    public void search(){

//      for login flicker app
        LoginPage loginPage = homePage.ckickOnlogin();
        loginPage.clickgetStarted();
        loginPage.setGotologPage("marazislam8@gmail.com");
        loginPage.setNextBtn();
        loginPage.setEnterpass("TestCase0101");
        loginPage.setSignInbtn();

        //    for search bookName

        SearchPage searchPage = homePage.searchPage();
        searchPage.setShareBtn();
        searchPage.setClickSharetoggle();
        searchPage.setSearchbook("Biology");

    }

}
