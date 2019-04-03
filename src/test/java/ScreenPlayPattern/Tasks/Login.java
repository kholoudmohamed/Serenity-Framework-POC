package ScreenPlayPattern.Tasks;

import ScreenPlayPattern.Ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private final String username;
    private final String password;

    protected Login(String username, String password){
        this.username=username;
        this.password=password;
    }

    @Override
    @Step ("Login with username #username and password #password")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Clear.field(LoginPage.USERNAME));
        actor.attemptsTo(Enter.theValue(username).into(LoginPage.USERNAME));
        actor.attemptsTo(Enter.theValue(password).into(LoginPage.PASSWORD));
        actor.attemptsTo(Click.on(LoginPage.LOGIN_BUTTON));

    }

    public static Login withCredentials(String username, String password)
    {

        return instrumented(Login.class,username,password);

    }
}
