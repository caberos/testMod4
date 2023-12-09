package task.validations;

import org.openqa.selenium.WebDriver;
import ui.HomePage;
import ui.itemsPage;

public class IsCheck {

    public static boolean checkTableLeft(WebDriver driver) {
        return driver.findElement(itemsPage.tableLeft).isDisplayed();
    }

    public static boolean checkLogoutBt(WebDriver driver) {
        return driver.findElement(itemsPage.logoutBtn).isDisplayed();
    }

    public static boolean checkHomePage(WebDriver driver) {
        return driver.findElement(HomePage.signup).isDisplayed();
    }

}
