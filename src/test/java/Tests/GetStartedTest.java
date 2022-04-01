package Tests;

import Base.Base;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class GetStartedTest extends Base {

    @Test
    public void getStarted(){
        LoginPage loginPage = homePage.ckickOnlogin();
        loginPage.clickgetStarted();
    }

}
