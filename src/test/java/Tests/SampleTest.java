package Tests;

import ScreenPlayPattern.Questions.TheUserName;
import ScreenPlayPattern.Tasks.Login;
import ScreenPlayPattern.Ui.LoginPage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

@RunWith(SerenityRunner.class)
public class SampleTest {

    private Actor adminUser = Actor.named("Admin");


    @Managed(uniqueSession = true)
    public WebDriver hisBrowser;


    LoginPage loginPage;


    @Before
    public void adminCanBrowseTheWeb(){
        adminUser.can(BrowseTheWeb.with(hisBrowser));
    }

    @Test
    public void users_should_be_able_to_login()
    {
        givenThat(adminUser).wasAbleTo(Open.browserOn().the(loginPage));
        when(adminUser).attemptsTo(Login.withCredentials("kmohamed@worth.systems","Test123!"));
        then(adminUser).should(eventually(seeThat(TheUserName.displayed(),is("Kholoud Mohamed"))));
    }
}
