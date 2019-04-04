package ScreenPlayPattern.Ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://acc-ls2.mfaservices.nl/c/portal/login")
public class LoginPage extends PageObject {
    public static Target USERNAME
            = Target.the("Username text box")
            .locatedBy("#_com_liferay_login_web_portlet_LoginPortlet_login");
    public static Target PASSWORD
            = Target.the("Password text box")
            .locatedBy("#_com_liferay_login_web_portlet_LoginPortlet_password");
    public static Target LOGIN_BUTTON
            = Target.the("Login Button")
            .locatedBy("button[id*='_login_web_portlet_LoginPortlet_']");


    // Microsoft account login
    public static Target MICROSOFT_EMAIL
            = Target.the("Microsoft email text box")
            .located(By.cssSelector("input[type='email']"));
    public static Target MICROSOFT_PASSWORD
            = Target.the("Microsoft password text box")
            .located(By.cssSelector("input[type='password']"));
    public static Target MICROSOFT_NEXT_BTN
            = Target.the("Microsoft submit button")
            .located(By.cssSelector("div.inline-block>input[type='submit'][value='Next']"));
    public static Target MICROSOFT_SIGNIN_BTN
            = Target.the("Microsoft submit button")
            .located(By.cssSelector("div.inline-block>input[type='submit'][value='Sign in']"));
}
