package constants;

public class ShopPageXpathConstants {
    public static final String SHOP_PAGE = "//*[@id=\"menu-item-834\"]//*[contains(text(), 'Shop')]";
    public static final String DRESSES = "//*[@id=\"woocommerce_product_categories-2\"]//*[contains(text(), 'Dresses')]";
    public static final String RANDOM_DRESS = "//*[@id=\"primary\"]//li[%d]";
    public static final String PRODUCT_DESCRIPTION = "//*[contains(@class, 'woocommerce-product-details__short-description')]";
    public static final String PRODUCT_PHOTO = "//*[contains(@class, 'woocommerce-product-gallery__wrapper')]";
    public static final String PRODUCT_PRICE = "//*[@class=\"price\"]";
    public static final String ADD_CHART = "//*[contains(@class, 'single_add_to_cart_button button alt')]";
    public static final String VIEW_CART = "//*[@id=\"primary\"]//*[contains(@class, 'button wc-forward')]";
}
