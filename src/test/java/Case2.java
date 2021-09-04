
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case2 extends BaseTest {

    @Test(priority = 1 , description = "Check login with actual account")
    public void case2(){
        myAccountPage.goToMyAccount();
        myAccountPage.enterMailInLoginArea();
        myAccountPage.enterPassword();
        myAccountPage.clickLogIn();
        boolean isLogInSuccessful = myAccountPage.confirmLogIn();
        Assert.assertTrue(isLogInSuccessful);
        myAccountPage.clickUserEditLink();
        myAccountPage.enterFirstName();
        myAccountPage.enterSurname();
        myAccountPage.enterCurrentPasswd();
        myAccountPage.enterNewPasswd();
        myAccountPage.reEnterNewtPasswd();
        myAccountPage.clickSaveChanges();
        boolean isEditSuccessful = myAccountPage.confirmEdit();
        Assert.assertTrue(isEditSuccessful);

    }


}
