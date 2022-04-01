package Tests;

import Base.Base;
import Pages.SignUpPage;
import org.testng.annotations.Test;

public class SignUpTest extends Base {


    @Test
    public void signUp(){
        SignUpPage signUpPage = homePage.clickOnSignUp();
        signUpPage.setGetstarted();
        signUpPage.setClickSignUp();
        signUpPage.setFirst_name("Maraz");
        signUpPage.setLastName("Islam");
        signUpPage.setAge("20");
        signUpPage.setEmail_add("marazislam8@gmail.com");
        signUpPage.setPassword("TestCase0101");
        signUpPage.setClickSignupBtn();
    }

}
