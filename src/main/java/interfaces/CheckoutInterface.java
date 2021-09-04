package interfaces;

public interface CheckoutInterface {
    void enterName();
    void enterSurname();
    void enterAddress();
    void enterPostCode();
    void enterPhone();
    void enterMail();
    void placeOrder() throws InterruptedException;
    void enterTown();
    boolean confirmInvalidMessage();
}
