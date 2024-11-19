package pages.pagefactory;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageFactory {

    WebDriver driver ;
    //Page Declaration
    public HomePage home_page;

    public PageFactory() {

    }
    public HomePage getHome_page() {
        home_page = new HomePage();
        return home_page;
    }

}
