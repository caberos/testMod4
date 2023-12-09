package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.itemsPage;

public class AddNewProject {

    public static void as(WebDriver driver, String projectName){
        Click.on(driver, itemsPage.addProject);
        Enter.text(driver, itemsPage.addProject, projectName);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO,"results");
    }
}
