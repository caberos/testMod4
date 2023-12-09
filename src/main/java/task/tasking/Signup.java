package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.SignupPage;
import ui.HomePage;

public class Signup {

    public static void as(WebDriver driver, String fullName,String email,String password){
        Click.on(driver, HomePage.signup);
        Enter.text(driver, SignupPage.fullName, fullName);
        Enter.text(driver, SignupPage.email, email);
        Enter.text(driver, SignupPage.password, password);
        Click.on(driver,SignupPage.checkTerms);
        Click.on(driver,SignupPage.signupBtn);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO,"results");
    }
}
