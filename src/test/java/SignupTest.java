import base.BaseTest;
import org.testng.Assert;
import task.tasking.Signup;
import org.testng.annotations.Test;
import task.validations.IsCheck;

public class SignupTest extends BaseTest {

    @Test
    public void signupTest() {
        Signup.as(webDriver, "Test modulo4","test212@mod4.com","P@ssw0rd");
        Assert.assertTrue(IsCheck.checkTableLeft(webDriver));
    }
}
