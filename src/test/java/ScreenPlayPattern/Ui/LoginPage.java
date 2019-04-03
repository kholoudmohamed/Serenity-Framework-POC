package ScreenPlayPattern.Ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://subsidie-demo.test.worth.systems/web/guest/home?p_p_id=com_liferay_login_web_portlet_LoginPortlet&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&saveLastPath=false&_com_liferay_login_web_portlet_LoginPortlet_mvcRenderCommandName=%2Flogin%2Flogin")
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
}
