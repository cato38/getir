package pages;

import constants.CartPageXpathConstants;
import interfaces.CartPageInterfaces;
import org.openqa.selenium.WebDriver;

public class CartPage extends PageObject implements CartPageInterfaces {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getCartValue() {
        super.waitByXpath(CartPageXpathConstants.VALUE);
        String value = super.getTextOfElement(CartPageXpathConstants.VALUE);
        return value;
    }

    @Override
    public void proceedCheckout() {
        super.waitByXpath(CartPageXpathConstants.PROCEED);
        super.clickElementByXpath(CartPageXpathConstants.PROCEED);
    }
}
