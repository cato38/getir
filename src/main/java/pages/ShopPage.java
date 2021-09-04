package pages;

import constants.ShopPageXpathConstants;
import interfaces.ShopInterface;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.ThreadLocalRandom;

public class ShopPage extends PageObject implements ShopInterface {
    public ShopPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void goToShopPage() {
        super.waitByXpath(ShopPageXpathConstants.SHOP_PAGE);
        super.clickElementByXpath(ShopPageXpathConstants.SHOP_PAGE);
    }

    @Override
    public void clickDresses() {
        super.waitByXpath(ShopPageXpathConstants.DRESSES);
        super.clickElementByXpath(ShopPageXpathConstants.DRESSES);
    }

    @Override
    public void clickRandomDress() {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 6);
        super.waitByXpath(String.format(ShopPageXpathConstants.RANDOM_DRESS, randomNum));
        super.clickElementByXpath(String.format(ShopPageXpathConstants.RANDOM_DRESS, randomNum));
    }

    @Override
    public boolean confirmDesc() {
        Boolean result = super.isElementExist(ShopPageXpathConstants.PRODUCT_DESCRIPTION);
        return result;
    }

    @Override
    public boolean confirmPhoto() {
        Boolean result = super.isElementExist(ShopPageXpathConstants.PRODUCT_PHOTO);
        return result;
    }

    @Override
    public boolean confirmPrice() {
        Boolean result = super.isElementExist(ShopPageXpathConstants.PRODUCT_PRICE);
        return result;
    }

    @Override
    public void addProductToChart() {
        super.waitByXpath(ShopPageXpathConstants.ADD_CHART);
        super.clickElementByXpath(ShopPageXpathConstants.ADD_CHART);
    }

    @Override
    public void viewCart() {
        super.waitByXpath(ShopPageXpathConstants.VIEW_CART);
        super.clickElementByXpath(ShopPageXpathConstants.VIEW_CART);
    }

    @Override
    public String getPriceValue() {
        super.waitByXpath(ShopPageXpathConstants.PRODUCT_PRICE);
        String value = super.getTextOfElement(ShopPageXpathConstants.PRODUCT_PRICE);
        return value;
    }
}
