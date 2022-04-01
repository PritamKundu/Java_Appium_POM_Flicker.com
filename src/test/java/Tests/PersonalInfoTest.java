package Tests;

import Base.Base;
import Pages.LoginPage;
import Pages.PersonalInfoPage;
import Pages.SearchPage;
import org.testng.annotations.Test;

public class PersonalInfoTest extends Base {

    @Test
    public void personalInfo(){

//        for login
        LoginPage loginPage = homePage.ckickOnlogin();
        loginPage.clickgetStarted();
        loginPage.setGotologPage("marazislam8@gmail.com");
        loginPage.setNextBtn();
        loginPage.setEnterpass("TestCase0101");
        loginPage.setSignInbtn();

//        for Search
        PersonalInfoPage personalInfoPage = homePage.personalInfoPage();
        personalInfoPage.setClickProfile();
        personalInfoPage.setClickThreeDot();
        personalInfoPage.setClickonabout();

    }
}
