package ScreenPlayPattern.Ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginBox {
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
