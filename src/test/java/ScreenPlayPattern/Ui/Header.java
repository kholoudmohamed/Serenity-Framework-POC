package ScreenPlayPattern.Ui;

import net.serenitybdd.screenplay.targets.Target;

public class Header {
    public static Target LOGGEDIN_USERNAME
            = Target.the("Logged in username")
            .locatedBy("a[id*='_ProductNavigationUserPersonalBarPortlet_sidenavUserToggle']>span.user-full-name");
}
