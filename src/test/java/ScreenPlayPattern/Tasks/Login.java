package ScreenPlayPattern.Tasks;

import PageObjects.LoginPage;
import ScreenPlayPattern.Ui.LoginBox;
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
        actor.attemptsTo(Clear.field(LoginBox.USERNAME));
        actor.attemptsTo(Enter.theValue(username).into(LoginBox.USERNAME));
        actor.attemptsTo(Enter.theValue(password).into(LoginBox.PASSWORD));
        actor.attemptsTo(Click.on(LoginBox.LOGIN_BUTTON));

    }

    public static Login withCredentials(String username, String password)
    {

        return instrumented(Login.class,username,password);

    }
}
