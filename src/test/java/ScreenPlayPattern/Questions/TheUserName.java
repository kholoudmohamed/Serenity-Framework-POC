package ScreenPlayPattern.Questions;

import ScreenPlayPattern.Ui.Header;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

public class TheUserName implements Question<String> {
    @Override
    @Step
    public String answeredBy(Actor actor) {
        return Text.of(Header.LOGGEDIN_USERNAME).viewedBy(actor).resolve();
    }

    public static Question<String> displayed()
    {
        return new TheUserName();
    }
}
