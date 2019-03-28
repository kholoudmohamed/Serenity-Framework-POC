package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://subsidie-demo.test.worth.systems/nl/home")
public class HomePage extends PageObject {

    @FindBy(css = "a[id*='_ProductNavigationUserPersonalBarPortlet_sidenavUserToggle']>span.user-full-name")
    public static WebElement LoggedInUsername;
}
