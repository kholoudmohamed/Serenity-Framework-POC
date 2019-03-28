package PageObjects;

import Helpers.GetData;
import Helpers.WaitHelpers;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://subsidie-demo.test.worth.systems/web/guest/home?p_p_id=com_liferay_login_web_portlet_LoginPortlet&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&saveLastPath=false&_com_liferay_login_web_portlet_LoginPortlet_mvcRenderCommandName=%2Flogin%2Flogin")
public class LoginPage extends PageObject {

    @FindBy(id = "_com_liferay_login_web_portlet_LoginPortlet_login")
     WebElement Username;

    @FindBy(id = "_com_liferay_login_web_portlet_LoginPortlet_password")
    WebElement Password;

    @FindBy(css = "button[id*='_login_web_portlet_LoginPortlet_']")
    WebElement LoginBtn;


    public void Login(String username, String password)
    {
        Username.clear();
        Username.sendKeys(username);
        Password.sendKeys(password);
        LoginBtn.click();


        // This one could be removed from here
        //
    }


}
