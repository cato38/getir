package pages;

import constants.MyAccountPageTestConstants;
import constants.MyAccountXpathConstants;
import interfaces.MyAccountInterface;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends PageObject implements MyAccountInterface {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void goToMyAccount() {
        super.waitByXpath(MyAccountXpathConstants.MY_ACCOUNT);
        super.clickElementByXpath(MyAccountXpathConstants.MY_ACCOUNT);
    }

    @Override
    public void enterMailInRegisterArea() {
        super.waitByXpath(MyAccountXpathConstants.MAIL_REGISTER_ENTRY);
        super.enterTextByXpath(MyAccountXpathConstants.MAIL_REGISTER_ENTRY, MyAccountPageTestConstants.MAIL_ADDRESS_DEMO);
    }

    @Override
    public void clickRegister() {
        super.waitByXpath(MyAccountXpathConstants.REGISTER_BUTTON);
        super.clickElementByXpath(MyAccountXpathConstants.REGISTER_BUTTON);
    }

    @Override
    public boolean confirmRegistration() {
        Boolean result = super.isElementExist(MyAccountXpathConstants.REGISTER_MESSAGE_AREA);
        return result;
    }

    @Override
    public boolean confirmLogIn() {
        Boolean result = super.isElementExist(MyAccountXpathConstants.REGISTER_MESSAGE_AREA);
        return result;
    }

    @Override
    public boolean confirmEdit() {
        Boolean result = super.isElementExist(MyAccountXpathConstants.GOOD_EDIT);
        return result;
    }

    @Override
    public void enterMailInLoginArea() {
        super.waitByXpath(MyAccountXpathConstants.MAIL_LOGIN_ENTRY);
        super.enterTextByXpath(MyAccountXpathConstants.MAIL_LOGIN_ENTRY, MyAccountPageTestConstants.MAIL_ADDRESS);
    }

    @Override
    public void enterPassword() {
        super.waitByXpath(MyAccountXpathConstants.PASSWORD_ENTRY);
        super.enterTextByXpath(MyAccountXpathConstants.PASSWORD_ENTRY, MyAccountPageTestConstants.PASSWORD);
    }

    @Override
    public void clickLogIn() {
        super.waitByXpath(MyAccountXpathConstants.LOGIN_BUTTON);
        super.clickElementByXpath(MyAccountXpathConstants.LOGIN_BUTTON);
    }

    @Override
    public void clickUserEditLink() {
        super.waitByXpath(MyAccountXpathConstants.USER_EDIT_LINK);
        super.clickElementByXpath(MyAccountXpathConstants.USER_EDIT_LINK);
    }

    @Override
    public void enterFirstName() {
        super.waitByXpath(MyAccountXpathConstants.FIRSTNAME_ENTRY);
        super.enterTextByXpath(MyAccountXpathConstants.FIRSTNAME_ENTRY, MyAccountPageTestConstants.FIRSTNAME);
    }

    @Override
    public void enterSurname() {
        super.waitByXpath(MyAccountXpathConstants.SURNAME_ENTRY);
        super.enterTextByXpath(MyAccountXpathConstants.SURNAME_ENTRY, MyAccountPageTestConstants.SURNAME);
    }

    @Override
    public void enterCurrentPasswd() {
        super.waitByXpath(MyAccountXpathConstants.PASSWD_ENTRY);
        super.enterTextByXpath(MyAccountXpathConstants.PASSWD_ENTRY, MyAccountPageTestConstants.PASSWORD);
    }

    @Override
    public void enterNewPasswd() {
        super.waitByXpath(MyAccountXpathConstants.NEWPASSWD_ENTRY);
        super.enterTextByXpath(MyAccountXpathConstants.NEWPASSWD_ENTRY, MyAccountPageTestConstants.NEWPASSWD);
    }

    @Override
    public void reEnterNewtPasswd() {
        super.waitByXpath(MyAccountXpathConstants.RENEWPASSWD_ENTRY);
        super.enterTextByXpath(MyAccountXpathConstants.RENEWPASSWD_ENTRY, MyAccountPageTestConstants.NEWPASSWD);
    }

    @Override
    public void clickSaveChanges() {
        super.waitByXpath(MyAccountXpathConstants.SAVE_CHANGES);
        super.clickElementByXpath(MyAccountXpathConstants.SAVE_CHANGES);
    }
}
