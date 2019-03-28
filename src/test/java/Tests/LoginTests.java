package Tests;

import StepsLibraries.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTests {
    //@Managed(driver="chrome", uniqueSession = true)
    @Managed(uniqueSession = true)
    WebDriver driver;

    @Steps
    private LoginSteps loginPage;

    @Test
    public void user_should_be_able_to_login(){
        loginPage.opens_login_page();
        loginPage.login_with_username_and_password("subsidieTestUser1@mailinator.com","Test123@");
        loginPage.User_should_be_logged_in_successfully(driver);
    }
}
