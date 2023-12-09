package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.LoginPage;
import ui.SignupPage;
import ui.HomePage;

public class Login {

    public static void as(WebDriver driver,String email,String password){
        Click.on(driver, HomePage.loginBtn);
        Enter.text(driver, LoginPage.email, email);
        Enter.text(driver, LoginPage.password, password);
        Click.on(driver,LoginPage.loginbtn);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO,"results");
    }
}
