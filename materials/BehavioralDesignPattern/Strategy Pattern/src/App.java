
public class App {

    public static void main(String[] args) {

        var checkoutPage = new CheckoutPage();

        checkoutPage.checkOut(PaymentMethods.payByBankTransfer);
        checkoutPage.checkOut(
                () -> System.out.println("payment made by cart")
        );

    }

}
