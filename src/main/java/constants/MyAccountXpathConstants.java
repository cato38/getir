package constants;

public class MyAccountXpathConstants {
    public static final String MAIL_REGISTER_ENTRY = "//*[@id=\"reg_email\"]";
    public static final String REGISTER_BUTTON = "//*[@id=\"customer_login\"]//*[contains(@value, 'Register')]";
    public static final String REGISTER_MESSAGE_AREA = "//*[@id=\"post-92\"]//*[contains(text(), 'Hello')]";
    public static final String MAIL_LOGIN_ENTRY = "//*[@id=\"username\"]";
    public static final String PASSWORD_ENTRY = "//*[@id=\"password\"]";
    public static final String LOGIN_BUTTON = "//*[@id=\"customer_login\"]//*[contains(@value, 'Log in')]";
    public static final String USER_EDIT_LINK = "//*[@id=\"post-92\"]//*[contains(text(), 'edit your password and account details')]";
    public static final String FIRSTNAME_ENTRY = "//*[@id=\"account_first_name\"]";
    public static final String SURNAME_ENTRY = "//*[@id=\"account_last_name\"]";
    public static final String NEWPASSWD_ENTRY = "//*[@id=\"password_1\"]";
    public static final String RENEWPASSWD_ENTRY = "//*[@id=\"password_2\"]";
    public static final String PASSWD_ENTRY = "//*[@id=\"password_current\"]";
    public static final String SAVE_CHANGES = "//*[@id=\"post-92\"]//*[contains(text(), 'Save changes')]";
    public static final String GOOD_EDIT = "//*[@id=\"post-92\"]//*[contains(text(), 'Account details changed successfully')]";
    public static String MY_ACCOUNT = "//*[@id=\"menu-item-844\"]//*[contains(text(), 'My account')]";
}
