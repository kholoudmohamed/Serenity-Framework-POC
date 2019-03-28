package StepsLibraries;

import Helpers.GetData;
import Helpers.WaitHelpers;
import PageObjects.LoginPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private static GetData data = new GetData();
    LoginPage loginPage;


    @Step
    public void opens_login_page(){
        loginPage.open();
    }

    @Step
    public void login_with_username_and_password(String username, String password){
        loginPage.Login(username,password);
    }

    @Step("User should be logged in successfully")
    public void User_should_be_logged_in_successfully(WebDriver driver){

        WaitHelpers.WaitTillUrlMatch(driver,10,data.getSubsidieBaseUrl());
    }
}
