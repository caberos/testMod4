import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.AddNewProject;
import task.tasking.Login;
import task.validations.IsCheck;

public class NewProjectTest extends BaseTest {

    @Test
    public void newProjectTest() {
        Login.as(webDriver, "test@mod4.com", "P@ssw0rd");
        AddNewProject.as(webDriver, "testMod4");
//        Assert.assertTrue(IsCheck.checkTableLeft(webDriver));
//        Assert.assertTrue(IsCheck.checkLogoutBt(webDriver));

    }
}
