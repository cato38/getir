package constants;

public class CheckoutXpathConstants {
    public static final String NAME_AREA = "//*[@id=\"billing_first_name\"]";
    public static final String SURNAME_AREA = "//*[@id=\"billing_last_name\"]";
    public static final String ADDRESS_AREA = "//*[@id=\"billing_address_1\"]";
    public static final String PC_AREA = "//*[@id=\"billing_postcode\"]";
    public static final String PHONE_AREA = "//*[@id=\"billing_phone\"]";
    public static final String MAIL_AREA = "//*[@id=\"billing_email\"]";
    public static final String PLACE_ORDER = "//*[contains(text(), 'Place order')]";
    public static final String TOWN_AREA = "//*[@id=\"billing_city\"]";
    public static final String MESSAGE = "//*[@id=\"post-91\"]//*[contains(text(), 'Invalid payment method')]";
}
