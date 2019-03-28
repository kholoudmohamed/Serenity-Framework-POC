package Helpers;

import junit.framework.Test;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelpers {
    public static void WaitTillUrlMatch(WebDriver webDriver, int timeInSec, String expectedUrl)
    {
        WebDriverWait wait = new WebDriverWait(webDriver, timeInSec);
        wait.until(ExpectedConditions.urlMatches(expectedUrl));

    }
}
