package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseActions {

    public static void click_button(WebElement webelement, WebDriver driver, int... wait) {
        try {
            if(wait.length > 0) {

            }
            webelement.click();
        } catch (Exception ex) {

        }
    }
}
