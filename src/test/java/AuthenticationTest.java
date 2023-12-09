import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.tasking.LogoutPage;
import task.validations.IsCheck;

public class AuthenticationTest extends BaseTest {

    @Test
    public void loginTest(){
        Login.as(webDriver, "test@mod4.com","P@ssw0rd");
        Assert.assertTrue(IsCheck.checkTableLeft(webDriver));
        Assert.assertTrue(IsCheck.checkLogoutBt(webDriver));

    }
    @Test
    public void logoutTest(){
        Login.as(webDriver, "test@mod4.com","P@ssw0rd");
        LogoutPage.as(webDriver);
        Assert.assertTrue(IsCheck.checkHomePage(webDriver));


    }
}
