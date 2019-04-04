package ScreenPlayPattern.Tasks;

import Helpers.WaitHelpers;
import ScreenPlayPattern.Ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.jruby.RubyBoolean;
import org.openqa.selenium.WebDriver;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Login implements Task {

    private WebDriver driver = getDriver();
    private String currentURL = driver.getCurrentUrl();

    private final String username;
    private final String password;
    private final Boolean microsoftLogin;

    protected Login(String username, String password,Boolean microsoftLogin){
        this.username=username;
        this.password=password;
        this.microsoftLogin=microsoftLogin;
    }

    @Override
    @Step ("Login with username #username and password #password")
    public <T extends Actor> void performAs(T actor) {
        if (microsoftLogin)
        {
            actor.attemptsTo(WaitUntil.the(LoginPage.MICROSOFT_EMAIL, WebElementStateMatchers.isEnabled()));
            actor.attemptsTo(Enter.theValue(username).into(LoginPage.MICROSOFT_EMAIL));
            actor.attemptsTo(Click.on(LoginPage.MICROSOFT_NEXT_BTN));
            actor.attemptsTo(WaitUntil.the(LoginPage.MICROSOFT_PASSWORD, WebElementStateMatchers.isEnabled()));
            actor.attemptsTo(Enter.theValue(password).into(LoginPage.MICROSOFT_PASSWORD));
            actor.attemptsTo(Click.on(LoginPage.MICROSOFT_SIGNIN_BTN));
        }
        else
        {
            actor.attemptsTo(Clear.field(LoginPage.USERNAME));
            actor.attemptsTo(Enter.theValue(username).into(LoginPage.USERNAME));
            actor.attemptsTo(Enter.theValue(password).into(LoginPage.PASSWORD));
            actor.attemptsTo(Click.on(LoginPage.LOGIN_BUTTON));
        }

    }

    public static Login withCredentials(String username, String password)
    {

        return instrumented(Login.class,username,password, false);

    }
    public static Login withMicrosoftCredentials(String username, String password)
    {

        return instrumented(Login.class,username,password, true);

    }
}
