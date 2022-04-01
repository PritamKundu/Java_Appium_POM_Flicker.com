package Tests;

import Base.Base;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends Base {

    @Test
    public void loginsuccess(){
        LoginPage loginPage = homePage.ckickOnlogin();
        loginPage.clickgetStarted();
        loginPage.setGotologPage("marazislam8@gmail.com");
        loginPage.setNextBtn();
        loginPage.setEnterpass("TestCase0101");
        loginPage.setSignInbtn();
    }

}
