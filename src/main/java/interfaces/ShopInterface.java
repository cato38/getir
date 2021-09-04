package interfaces;

public interface ShopInterface {
    void goToShopPage();
    void clickDresses();
    void clickRandomDress();
    boolean confirmDesc();
    boolean confirmPhoto();
    boolean confirmPrice();
    void addProductToChart();
    void viewCart();
    String getPriceValue();
}
