package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.itemsPage;

public class LogoutPage {
    public static void as(WebDriver driver){
        Click.on(driver, itemsPage.logoutBtn);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO,"results");
    }
}
