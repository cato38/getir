import org.testng.Assert;
import org.testng.annotations.Test;

public class Case1 extends BaseTest{

    @Test(description = "Check Registration Function")
    public void case1(){
        myAccountPage.goToMyAccount();
        myAccountPage.enterMailInRegisterArea();
        myAccountPage.clickRegister();
        boolean isRegistrationSuccessful = myAccountPage.confirmRegistration();
        Assert.assertTrue(isRegistrationSuccessful);

    }
}
